package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class DeleteTrainingProgramController
{
    @javafx.fxml.FXML
    private TableColumn titleTableColumn;
    @javafx.fxml.FXML
    private ComboBox trainingProgramsCombobox;
    @javafx.fxml.FXML
    private TableColumn modeTableColumn;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TableColumn trainerNameTableColumn;
    @javafx.fxml.FXML
    private TableView showProgramTableViex;
    @javafx.fxml.FXML
    private TableColumn trainingIDTableColumn;

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
    public void showProgramButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleteButtonOnAction(ActionEvent actionEvent) {
    }
}