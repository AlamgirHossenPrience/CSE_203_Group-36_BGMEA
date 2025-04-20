package com.example.bgmea;

import javafx.event.Event;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;
import java.util.List;

public class CreateEventBudgetController
{
    @javafx.fxml.FXML
    private TextField venueCostTextField;
    @javafx.fxml.FXML
    private Label totalLabel;
    @javafx.fxml.FXML
    private TextField stuffCostTextField;
    @javafx.fxml.FXML
    private TableColumn<Cost, Integer> costColumn;
    @javafx.fxml.FXML
    private TableView<Cost> eventBudgetTable;
    @javafx.fxml.FXML
    private TextField catererCostTextField;
    @javafx.fxml.FXML
    private TextField decoratorCostTextField;
    @javafx.fxml.FXML
    private TableColumn<Cost, String> typeOfCostColumn;
    private List<Cost> costs = new ArrayList<>();



    @javafx.fxml.FXML
    public void initialize() {
        costColumn.setCellValueFactory(new PropertyValueFactory<>("cost"));
        typeOfCostColumn.setCellValueFactory(new PropertyValueFactory<>("typeOfCost"));
    }

    @javafx.fxml.FXML
    public void addButton(Event event) {
        costs.add(new Cost("Venue Cost", Integer.parseInt(venueCostTextField.getText())));
        costs.add(new Cost("Stuff Cost", Integer.parseInt(stuffCostTextField.getText())));
        costs.add(new Cost("Caterer Cost", Integer.parseInt(catererCostTextField.getText())));
        costs.add(new Cost("Decorator Cost", Integer.parseInt(decoratorCostTextField.getText())));

        eventBudgetTable.getItems().clear();

        eventBudgetTable.getItems().addAll(costs);
        int total = 0;
        for(Cost c: eventBudgetTable.getItems()){
            total += c.getCost();
        }
        totalLabel.setText(Integer.toString(total));
    }

    @javafx.fxml.FXML
    public void sendButton(Event event) {
    }
}