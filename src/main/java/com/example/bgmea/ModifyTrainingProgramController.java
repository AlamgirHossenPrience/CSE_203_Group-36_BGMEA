package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ModifyTrainingProgramController
{
    @javafx.fxml.FXML
    private TextField newProgramTitleTextField;
    @javafx.fxml.FXML
    private ComboBox<String> newModeCombobox;
    @javafx.fxml.FXML
    private Label programTitleLabel;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> availableTrainingProgramCombobox;
    @javafx.fxml.FXML
    private TextField newProgramDurationTextField;
    @javafx.fxml.FXML
    private Label modeLabel;
    @javafx.fxml.FXML
    private Label durationLabel;
    @javafx.fxml.FXML
    private Label programIDLabel;

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
        newModeCombobox.getItems().addAll("Online","Offline");

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
            availableTrainingProgramCombobox.getItems().add(s);
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
    public void modifyTrainingProgramButtonOnAction(ActionEvent actionEvent) {
        File file = new File("TrainingProgram.bin");
        List<TrainingProgram> programs = new ArrayList<>();

        // Step 1: Read all programs into list
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                try {
                    TrainingProgram s = (TrainingProgram) ois.readObject();
                    programs.add(s);
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }

        // Step 2: Modify matching program
        for (TrainingProgram s : programs) {
            if (s.getProgramTitle() != null && s.getProgramTitle().equals(availableTrainingProgramCombobox.getValue())) {
                s.setProgramTitle(newProgramTitleTextField.getText());
                s.setDuration(Float.parseFloat(newProgramDurationTextField.getText()));
                s.setMode(newModeCombobox.getValue());
                break;
            }
        }

        // Step 3: Write updated list back to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            for (TrainingProgram s : programs) {
                oos.writeObject(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void loadTrainingProgramButtonOnAction(ActionEvent actionEvent) {
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
                        if (s.getProgramTitle().equals(availableTrainingProgramCombobox.getValue()))
                        {
                            programIDLabel.setText(String.valueOf(s.getProgramID()));
                            programTitleLabel.setText(s.getProgramTitle());
                            durationLabel.setText(String.valueOf(s.getDuration()));
                            modeLabel.setText(s.getMode());
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