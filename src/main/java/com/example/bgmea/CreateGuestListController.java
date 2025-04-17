package com.example.bgmea;

import javafx.event.Event;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CreateGuestListController
{
    @javafx.fxml.FXML
    private TextField guestNameTextField;
    @javafx.fxml.FXML
    private TableColumn nameCoumn;
    @javafx.fxml.FXML
    private TextField guestCompanyTextField;
    @javafx.fxml.FXML
    private TableView createGuestListTable;
    @javafx.fxml.FXML
    private TextField guestPhoneNumberTextField;
    @javafx.fxml.FXML
    private TableColumn guestTypeColumn;
    @javafx.fxml.FXML
    private TableColumn companyColumn;
    @javafx.fxml.FXML
    private ComboBox guestTypeComboBox;
    @javafx.fxml.FXML
    private TextField guestEmailAddressTextField;
    @javafx.fxml.FXML
    private TableColumn phoneNumberColumn;
    @javafx.fxml.FXML
    private TableColumn emailAddressColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addbutton(Event event) {
    }

    @javafx.fxml.FXML
    public void loadTableButton(Event event) {
    }

    @javafx.fxml.FXML
    public void sendButton(Event event) {
    }
}