package com.example.bgmea;

import javafx.event.Event;
import javafx.scene.control.*;

public class TaskStuffManagementController
{
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private ComboBox eventTeamComboBox;
    @javafx.fxml.FXML
    private TableView taskandEventManagementTable;
    @javafx.fxml.FXML
    private TableColumn applicableNumberOFGuestColumn;
    @javafx.fxml.FXML
    private TableColumn availabilityColumn;
    @javafx.fxml.FXML
    private TableColumn teamColumn;
    @javafx.fxml.FXML
    private DatePicker eventDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void assignButton(Event event) {
    }
}