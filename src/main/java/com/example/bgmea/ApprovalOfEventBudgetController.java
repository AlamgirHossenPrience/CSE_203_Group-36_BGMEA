package com.example.bgmea;

import javafx.event.Event;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ApprovalOfEventBudgetController
{
    @javafx.fxml.FXML
    private TableView eventBudgetListTable;
    @javafx.fxml.FXML
    private Label eventNameBudgetListLabel;
    @javafx.fxml.FXML
    private TableColumn projectedSubTotalColumn;
    @javafx.fxml.FXML
    private Label totalBudgetLabel;
    @javafx.fxml.FXML
    private TableColumn categoryColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void approveEventBudgetButton(Event event) {
    }
}