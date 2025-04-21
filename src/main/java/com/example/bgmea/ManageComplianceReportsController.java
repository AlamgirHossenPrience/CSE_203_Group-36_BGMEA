package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ManageComplianceReportsController
{
    @javafx.fxml.FXML
    private TableColumn reportTypeTableColumn;
    @javafx.fxml.FXML
    private TableColumn factoryNameTableColumn;
    @javafx.fxml.FXML
    private TableView reportTableView;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private ComboBox reportTypeCombobox;
    @javafx.fxml.FXML
    private TableColumn reportIDTableColumn;
    @javafx.fxml.FXML
    private TableColumn factoruCodeTableColumn;

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

    @Deprecated
    public void deleteButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void showReportOnAction(ActionEvent actionEvent) {
    }
}