package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;

public class RegisterNewFactoryController
{
    @javafx.fxml.FXML
    private TextField ownerTextField;
    @javafx.fxml.FXML
    private TextField contactNoTextField;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TextField factoryNameTextField;
    @javafx.fxml.FXML
    private TextField noOfWorkersTextField;
    @javafx.fxml.FXML
    private TextField factoryCodeTextField;


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
    public void registerButtonOnAction(ActionEvent actionEvent) {
        if(factoryCodeTextField.getText().trim().isEmpty() ||
                factoryNameTextField.getText().trim().isEmpty() ||
                ownerTextField.getText().trim().isEmpty() ||
                noOfWorkersTextField.getText().trim().isEmpty() ||
                contactNoTextField.getText().trim().isEmpty())
        {
            outputTextArea.setText("Please enter all data");
            return;
        }

        Factory factory = new Factory(Integer.parseInt(factoryCodeTextField.getText()),
                Integer.parseInt(noOfWorkersTextField.getText()),
                factoryNameTextField.getText(),
                ownerTextField.getText(),
                contactNoTextField.getText());

        File f;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            f = new File("Factory.bin");
            if(f.exists()){
                fos = new FileOutputStream( f,true );
                oos = new AppendableObjectOutputStream( fos );
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream( fos );
            }

            oos.writeObject(factory);

        }catch(Exception e) {
            //
        }finally {
            try{
                if(oos != null) oos.close();
            }catch(Exception e){
                //
            }
        }
        outputTextArea.setText("Factory Registered successfully\n"+factory.toString());
    }
}