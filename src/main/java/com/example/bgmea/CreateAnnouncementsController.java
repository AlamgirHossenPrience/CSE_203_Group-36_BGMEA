package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class CreateAnnouncementsController
{
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TextArea messageTextArea;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TextField titleTextField;

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
    public void creatAnnouncementButtonOnAction(ActionEvent actionEvent) {
        Announcement a = new Announcement(titleTextField.getText(),
                messageTextArea.getText(),
                dateDatePicker.getValue());

        File f;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            f = new File("WageComplianceReport.bin");
            if(f.exists()){
                fos = new FileOutputStream( f,true );
                oos = new CreateAnnouncementsController.AppendableObjectOutputStream( fos );
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream( fos );
            }

            oos.writeObject(a);

        }catch(Exception e) {
            //
        }finally {
            try{
                if(oos != null) oos.close();
            }catch(Exception e){
                //
            }
        }
        outputTextArea.setText("Successfully announcement created. \n"+a.toString());
    }
}