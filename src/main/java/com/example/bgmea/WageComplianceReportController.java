package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class WageComplianceReportController
{
    @javafx.fxml.FXML
    private ComboBox factoryNameCombobox;
    @javafx.fxml.FXML
    private TextField basicSalaryTextField;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TextField overtimePamentTextField;
    @javafx.fxml.FXML
    private ComboBox allowancesCombobox;

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
    public void addReportButtonOnAction(ActionEvent actionEvent) {
    }
}