package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

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
    }
}