package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class EnrollWorkersInTrainingController
{
    @javafx.fxml.FXML
    private ToggleGroup genderTG;
    @javafx.fxml.FXML
    private TextField phoneNoTextField;
    @javafx.fxml.FXML
    private ComboBox trainingProgramsComboBox;
    @javafx.fxml.FXML
    private RadioButton maleRB;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private DatePicker dobDatePicker;
    @javafx.fxml.FXML
    private RadioButton femaleRB;
    @javafx.fxml.FXML
    private TextField workerIDTextfield;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void enrollWorkerButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void TECDashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource(("/com/example/bgmea/AlamgirFXML/TrainingandEducationCoordinatorDashboard.fxml")));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}