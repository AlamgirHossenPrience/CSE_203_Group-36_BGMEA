package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class TrackTrainingCompletionStatusController
{
    @javafx.fxml.FXML
    private ComboBox trainingProgramsCombobox;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TextArea reviewTextArea;

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
    public void markedAsCompletedButtonOnAction(ActionEvent actionEvent) {
    }
}