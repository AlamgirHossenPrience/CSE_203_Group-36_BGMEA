package com.example.bgmea;

import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CreateEventReportController
{
    @javafx.fxml.FXML
    private TextField catererCostTextField;
    @javafx.fxml.FXML
    private Label numberOfGuestArrivedLabel;
    @javafx.fxml.FXML
    private TextField otherCostTextField;
    @javafx.fxml.FXML
    private TableColumn costTypeColumn;
    @javafx.fxml.FXML
    private TextField decoratorCostTextField;
    @javafx.fxml.FXML
    private TableView eventReportTable;
    @javafx.fxml.FXML
    private TextField eventNameTextField;
    @javafx.fxml.FXML
    private TextField venueCostTextField;
    @javafx.fxml.FXML
    private TextField stuffCostTextField;
    @javafx.fxml.FXML
    private TableColumn costColumn;
    @javafx.fxml.FXML
    private TextField assignedTeamTextField;
    @javafx.fxml.FXML
    private Label teamOfStuffLabel;
    @javafx.fxml.FXML
    private Label totalCostLabel;
    @javafx.fxml.FXML
    private Label eventNameLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void createReportButton(Event event) {
    }
}