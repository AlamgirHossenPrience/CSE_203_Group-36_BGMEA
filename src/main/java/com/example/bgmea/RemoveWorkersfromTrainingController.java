package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class RemoveWorkersfromTrainingController
{
    @javafx.fxml.FXML
    private TableColumn workerIDTableColumn;
    @javafx.fxml.FXML
    private ComboBox trainingProgramsCombobox;
    @javafx.fxml.FXML
    private TableColumn genderTableColumn;
    @javafx.fxml.FXML
    private TableColumn trainingProgramTableColumn;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TableView showWorkersTableView;
    @javafx.fxml.FXML
    private TextField workerIDTextField;
    @javafx.fxml.FXML
    private TableColumn workerNameTableColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void removeButtonOnAction(ActionEvent actionEvent) {
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
    public void showEnrolledWorkersButtonOnAction(ActionEvent actionEvent) {
    }
}