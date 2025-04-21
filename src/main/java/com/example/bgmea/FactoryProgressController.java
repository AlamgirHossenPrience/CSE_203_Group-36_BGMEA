package com.example.bgmea;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.SQLException;

public class FactoryProgressController {
    @FXML private TextField searchFactoryTextField;
    @FXML private TableView<Factory> allFactoryProgressTable;
    @FXML private TableColumn<Factory, String> factoryNameColumn;
    @FXML private TableColumn<Factory, Integer> exportedMonthlyColumn;
    @FXML private TableColumn<Factory, Integer> exportedQuarterlyColumn;
    @FXML private TableColumn<Factory, Integer> exportedYearlyColumn;
    @FXML private TableColumn<Factory, Double> productionRateColumn;

    private ObservableList<Factory> factoryList = FXCollections.observableArrayList();
    @FXML
    private TableColumn totalGarmentsExportedColumn;

    @FXML
    public void initialize() {
        // Initialize table columns
        factoryNameColumn.setCellValueFactory(new PropertyValueFactory<>("factoryName"));
        exportedMonthlyColumn.setCellValueFactory(new PropertyValueFactory<>("monthlyExports"));
        exportedQuarterlyColumn.setCellValueFactory(new PropertyValueFactory<>("quarterlyExports"));
        exportedYearlyColumn.setCellValueFactory(new PropertyValueFactory<>("yearlyExports"));
        productionRateColumn.setCellValueFactory(new PropertyValueFactory<>("productionRate"));

        allFactoryProgressTable.setItems(factoryList);
    }


    }
