package com.example.bgmea;

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class FactoryProgressController
{
    @javafx.fxml.FXML
    private TableColumn factoryNameColumn;
    @javafx.fxml.FXML
    private TableColumn exportedYearlyColumn;
    @javafx.fxml.FXML
    private TableColumn productionRateColumn;
    @javafx.fxml.FXML
    private TableColumn totalGarmentsExportedColumn;
    @javafx.fxml.FXML
    private TextField searchFactoryTextField;
    @javafx.fxml.FXML
    private TableColumn exportedQuarterlyColumn;
    @javafx.fxml.FXML
    private TableView allFactoryProgressTable;
    @javafx.fxml.FXML
    private TableColumn exportedMonthlyColumn;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void searchFactoryOnMouseClicked(Event event) {
    }
}