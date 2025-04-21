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

public class AssignTrainertoTrainingProgramController
{
    @javafx.fxml.FXML
    private TextField phoneNoTextField;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField trainerIDTextField;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> trainingProgramCombobox;
    @javafx.fxml.FXML
    private TextField trainerNameTextField;

    public class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }
        @Override
        protected void writeStreamHeader() throws IOException {
            //
        }
    }

    @javafx.fxml.FXML
    public void initialize() {

        ArrayList<String> sl = new ArrayList<>();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("TrainingProgram.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            TrainingProgram s = null;
            while (true) {
                try {
                    s = (TrainingProgram) ois.readObject();
                    if (s.getProgramTitle() != null && !s.getProgramTitle().isEmpty()) {
                        sl.add(s.getProgramTitle());
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
            trainingProgramCombobox.getItems().add(s);
        }
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
    public void addTrainerButtonOnAction(ActionEvent actionEvent) {

        Trainer newTrainer = new Trainer(Integer.parseInt(trainerIDTextField.getText()),
                trainerNameTextField.getText(),
                emailTextField.getText(),
                phoneNoTextField.getText());

        File f;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            f = new File("Trainer.bin");
            if(f.exists()){
                fos = new FileOutputStream( f,true );
                oos = new AssignTrainertoTrainingProgramController.AppendableObjectOutputStream( fos );
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream( fos );
            }

            oos.writeObject(newTrainer);

        }catch(Exception e) {
            //
        }finally {
            try{
                if(oos != null) oos.close();
            }catch(Exception e){
                //
            }
        }
        outputTextArea.setText("Assign New Trainer Successfully. \n"+newTrainer.toString());

        // Add trainerID to the training program
        File nf = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            nf = new File("TrainingProgram.bin");
            fis = new FileInputStream(nf);
            ois = new ObjectInputStream(fis);

            TrainingProgram s = null;
            while (true) {
                try {
                    s = (TrainingProgram) ois.readObject();
                    if (s.getProgramTitle() != null && !s.getProgramTitle().isEmpty()) {
                        if (s.getProgramTitle().equals(trainingProgramCombobox.getValue()))
                        {
                            s.setTrainerID(Integer.parseInt(trainerIDTextField.getText()));
                            break;
                        }
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
    }
}