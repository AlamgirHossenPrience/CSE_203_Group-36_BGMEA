package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddFactoryToBlacklistController
{
    @javafx.fxml.FXML
    private TextField panaltyAmountTextField;
    @javafx.fxml.FXML
    private ComboBox violationCombobox;
    @javafx.fxml.FXML
    private TextArea reasonForBlacklistTextArea;
    @javafx.fxml.FXML
    private DatePicker blacklistedDateDatePicker;
    @javafx.fxml.FXML
    private TextField blacklistedByTextField;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private ComboBox factoryCombobox;

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
    public void addToBlacklistButtonOnAction(ActionEvent actionEvent) {
    }
}