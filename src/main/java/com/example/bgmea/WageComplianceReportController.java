package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class WageComplianceReportController
{
    @javafx.fxml.FXML
    private ComboBox<String> factoryNameCombobox;
    @javafx.fxml.FXML
    private TextField basicSalaryTextField;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TextField overtimePamentTextField;
    @javafx.fxml.FXML
    private ComboBox<String> allowancesCombobox;

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

        allowancesCombobox.getItems().addAll("Housing", "Travel", "Food");

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
    public void addReportButtonOnAction(ActionEvent actionEvent) {
        WageComplianceReport wcr = new WageComplianceReport(factoryNameCombobox.getValue(),
                Integer.parseInt(basicSalaryTextField.getText()),
                Integer.parseInt(overtimePamentTextField.getText()),
                allowancesCombobox.getValue());

        File f;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            f = new File("WageComplianceReport.bin");
            if(f.exists()){
                fos = new FileOutputStream( f,true );
                oos = new WageComplianceReportController.AppendableObjectOutputStream( fos );
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream( fos );
            }

            oos.writeObject(wcr);

        }catch(Exception e) {
            //
        }finally {
            try{
                if(oos != null) oos.close();
            }catch(Exception e){
                //
            }
        }
        outputTextArea.setText("Successfully wage compliance report created. \n"+wcr.toString());
    }
}