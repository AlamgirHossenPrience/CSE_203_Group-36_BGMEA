package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class IssueComplianceViolationNoticeController
{
    @javafx.fxml.FXML
    private ComboBox<String> factoryNameCombobox;
    @javafx.fxml.FXML
    private TextArea ouputTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> violationTypeCombobox;
    @javafx.fxml.FXML
    private DatePicker noticeDateDatePicker;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;

    public class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }
        @Override
        protected void writeStreamHeader() throws IOException {
            // Do not write a header
        }
    }

    @javafx.fxml.FXML
    public void initialize() {

        violationTypeCombobox.getItems().addAll("Safety Violation", "Child Labor", "Wage Issues", "Overtime Violations");

        ArrayList<String> sl = new ArrayList<>();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Factory.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            Factory s = null;
            while (true) {
                try {
                    s = (Factory) ois.readObject();
                    if (s.getFactoryName() != null && !s.getFactoryName().isEmpty()) {
                        System.out.println("Loaded factory name: " + s.getFactoryName()); // debug
                        sl.add(s.getFactoryName());
                    }
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(ois != null) ois.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
        for (String s : sl) {
            factoryNameCombobox.getItems().add(s);
        }
    }

    @javafx.fxml.FXML
    public void LCODashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource(("/com/example/bgmea/AlamgirFXML/LaborComplianceOfficerDashboard.fxml")));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void issueNoticeButtonOnAction(ActionEvent actionEvent) {

        if(factoryNameCombobox.getValue().isEmpty() ||
                violationTypeCombobox.getValue().isEmpty() ||
                noticeDateDatePicker.getValue() == null ||
                descriptionTextArea.getText().trim().isEmpty())
        {
            ouputTextArea.setText("Please enter all data");
            return;
        }

        ComplianceViolationNotice cvn = new ComplianceViolationNotice(factoryNameCombobox.getValue(),
                violationTypeCombobox.getValue(),
                descriptionTextArea.getText(),
                noticeDateDatePicker.getValue());

        File f;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            f = new File("ComplianceViolationNotice.bin");
            if(f.exists()){
                fos = new FileOutputStream( f,true );
                oos = new IssueComplianceViolationNoticeController.AppendableObjectOutputStream( fos );
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream( fos );
            }

            oos.writeObject(cvn);

        }catch(Exception e) {
            //
        }finally {
            try{
                if(oos != null) oos.close();
            }catch(Exception e){
                //
            }
        }
        ouputTextArea.setText("Successfully issue Compliance Violation Notice. \n"+cvn.toString());
    }
}