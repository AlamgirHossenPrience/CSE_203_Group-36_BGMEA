package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginViewController
{
    @javafx.fxml.FXML
    private ComboBox<String> userTypeComboBox;
    @javafx.fxml.FXML
    private PasswordField passwordPasswordField;
    @javafx.fxml.FXML
    private TextField IDTextField;

    @javafx.fxml.FXML
    public void initialize() {

        userTypeComboBox.getItems().setAll("Labor Compliance Officer","Training and Education Coordinator"," President","Event manager", "Legal Advisor","Public relation Officer ");

    }

    @javafx.fxml.FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        if(IDTextField.getText().trim().isEmpty() ||
                passwordPasswordField.getText().trim().isEmpty() ||
                userTypeComboBox.getValue() == null){
            System.out.println("Enter ID, Password and Select User Type");
            return;
        }

        if(userTypeComboBox.getValue().equals("Labor Compliance Officer")){
            FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource(("/com/example/bgmea/AlamgirFXML/LaborComplianceOfficerDashboard.fxml")));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }else if(userTypeComboBox.getValue().equals("Training and Education Coordinator")){
            FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource(("/com/example/bgmea/AlamgirFXML/LaborComplianceOfficerDashboard.fxml")));
            Scene scene = new Scene(fxmlLoader.load());

            Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

            stage.setScene(scene);
            stage.show();
        }
    }
}