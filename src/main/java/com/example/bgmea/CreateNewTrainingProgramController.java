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

public class CreateNewTrainingProgramController
{
    @javafx.fxml.FXML
    private TextField durationTextField;
    @javafx.fxml.FXML
    private TextField programIDTextField;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TextField programTitleTextField;
    @javafx.fxml.FXML
    private ComboBox<String> modeCombobox;
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
        modeCombobox.getItems().addAll("Online","Offline");
    }

    @javafx.fxml.FXML
    public void TECDashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource(("/com/example/bgmea/AlamgirFXML/TrainingandEducationCoordinatorDashboard.fxml")));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void createProgramButtonOnAction(ActionEvent actionEvent) {

        TrainingProgram tp = new TrainingProgram(Integer.parseInt(programIDTextField.getText()),
                programTitleTextField.getText(),
                modeCombobox.getValue(),
                descriptionTextArea.getText(),
                Float.parseFloat(durationTextField.getText()));

        File f;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            f = new File("TrainingProgram.bin");
            if(f.exists()){
                fos = new FileOutputStream( f,true );
                oos = new CreateNewTrainingProgramController.AppendableObjectOutputStream( fos );
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream( fos );
            }

            oos.writeObject(tp);

        }catch(Exception e) {
            //
        }finally {
            try{
                if(oos != null) oos.close();
            }catch(Exception e){
                //
            }
        }
        outputTextArea.setText("New Training Program Created Successfully. \n"+tp.toString());
    }
}