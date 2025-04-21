package com.example.bgmea;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class PresidentDashboardController
{
    @javafx.fxml.FXML
    private Label announcementLabel;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void activeStatusButton(Event event) {
    }

    @javafx.fxml.FXML
    public void eventBudgetButton(Event event) {
    }

    @javafx.fxml.FXML
    public void makeAnAnnouncementButton(Event event) {
    }

    @javafx.fxml.FXML
    public void factoryProgressButton(Event event) {
    }

    @javafx.fxml.FXML
    public void pendingMemberRequestButton(Event event) {
    }

    @javafx.fxml.FXML
    public void eventBudgetButton(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource(("/com/example/bgmea/MahathirFXML/CreateEventBudget.fxml")));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

}