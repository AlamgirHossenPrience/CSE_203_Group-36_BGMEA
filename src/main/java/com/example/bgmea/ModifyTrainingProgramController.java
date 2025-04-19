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

import java.io.IOException;

public class ModifyTrainingProgramController
{
    @javafx.fxml.FXML
    private TextField newProgramTitleTextField;
    @javafx.fxml.FXML
    private ComboBox newModeCombobox;
    @javafx.fxml.FXML
    private Label programTitleLabel;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private ComboBox availableTrainingProgramCombobox;
    @javafx.fxml.FXML
    private TextField newProgramDurationTextField;
    @javafx.fxml.FXML
    private Label modeLabel;
    @javafx.fxml.FXML
    private Label durationLabel;
    @javafx.fxml.FXML
    private Label programIDLabel;

    @javafx.fxml.FXML
    public void initialize() {
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
    }

    @javafx.fxml.FXML
    public void loadTrainingProgramButtonOnAction(ActionEvent actionEvent) {
    }
}