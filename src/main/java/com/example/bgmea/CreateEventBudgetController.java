package com.example.bgmea;

import javafx.event.Event;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CreateEventBudgetController
{
    @javafx.fxml.FXML
    private TextField venueCostTextField;
    @javafx.fxml.FXML
    private Label totalLabel;
    @javafx.fxml.FXML
    private TextField stuffCostTextField;
    @javafx.fxml.FXML
    private TableColumn costColumn;
    @javafx.fxml.FXML
    private TableView eventBudgetTable;
    @javafx.fxml.FXML
    private TextField catererCostTextField;
    @javafx.fxml.FXML
    private TextField decoratorCostTextField;
    @javafx.fxml.FXML
    private TableColumn typeOfCostColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void addButton(Event event) {
    }

    @javafx.fxml.FXML
    public void sendButton(Event event) {
    }
}