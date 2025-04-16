package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;

public class SafetyAuditReportController
{
    @javafx.fxml.FXML
    private ToggleGroup fireSafetyTG;
    @javafx.fxml.FXML
    private ComboBox factoryNameCombobox;
    @javafx.fxml.FXML
    private TextArea ouputTextArea;
    @javafx.fxml.FXML
    private ToggleGroup electricalSafetyTG;
    @javafx.fxml.FXML
    private RadioButton protectiveEquipmentNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton electricalSafetyCompliantRB;
    @javafx.fxml.FXML
    private RadioButton structuralIntegrityNonCompliantRB;
    @javafx.fxml.FXML
    private RadioButton protectiveEquipmentNonCompliantRB;
    @javafx.fxml.FXML
    private ToggleGroup structuralIntegrityTG;
    @javafx.fxml.FXML
    private ToggleGroup protectiveEquipmentTG;
    @javafx.fxml.FXML
    private RadioButton structuralIntegrityNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton structuralIntegrityCompliantRB;
    @javafx.fxml.FXML
    private RadioButton fireSafetyNonComplianceRB;
    @javafx.fxml.FXML
    private RadioButton electricalSafetyNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton emergenceResponseNonCompliantRB;
    @javafx.fxml.FXML
    private RadioButton fireSafetyComplianceRB;
    @javafx.fxml.FXML
    private RadioButton electricalSafetyNonCompliantRB;
    @javafx.fxml.FXML
    private RadioButton emergenceResponseNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton emergenceResponseCompliantRB;
    @javafx.fxml.FXML
    private ToggleGroup emergenceResponseTG;
    @javafx.fxml.FXML
    private RadioButton fireSafetyNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton protectiveEquipmentCompliantRB;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void LCODashboardButtonOnAction(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void issueSafetyAuditButtonOnAction(ActionEvent actionEvent) {
    }
}