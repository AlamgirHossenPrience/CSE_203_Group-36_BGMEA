package com.example.bgmea;

import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class CreateEventController
{
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private TextField eventTimeTextField;
    @javafx.fxml.FXML
    private ComboBox eventVenueComboBox;
    @javafx.fxml.FXML
    private TextField eventDescriptionTextField;
    @javafx.fxml.FXML
    private ComboBox eventTypeComboBox;
    @javafx.fxml.FXML
    private DatePicker eventDatePicker;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createEventButton(Event event) {
    }
}