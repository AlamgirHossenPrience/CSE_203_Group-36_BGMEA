package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class IssueComplianceViolationNoticeController
{
    @javafx.fxml.FXML
    private ComboBox factoryNameCombobox;
    @javafx.fxml.FXML
    private TextArea ouputTextArea;
    @javafx.fxml.FXML
    private ComboBox violationTypeCombobox;
    @javafx.fxml.FXML
    private DatePicker noticeDateDatePicker;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;

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
    public void issueNoticeButtonOnAction(ActionEvent actionEvent) {
    }
}