package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class CurrentBlacklistedFactoryController
{
    @javafx.fxml.FXML
    private TableColumn<BlacklistedFactory,String> nameTableColumn;
    @javafx.fxml.FXML
    private TableColumn<BlacklistedFactory,String> violationTableColumn;
    @javafx.fxml.FXML
    private TextArea outputTextArea;
    @javafx.fxml.FXML
    private TableView<BlacklistedFactory> blaclistedFactoryTableview;
    @javafx.fxml.FXML
    private TableColumn<BlacklistedFactory, LocalDate> dateTableColumn;

    public class AppendableObjectOutputStream extends ObjectOutputStream {
        public AppendableObjectOutputStream(OutputStream out) throws IOException {
            super(out);
        }
        @Override
        protected void writeStreamHeader() throws IOException {
            // Do not write a header
        }
    }

    @javafx.fxml.FXML
    public void initialize() {
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<>("factoryName"));
        violationTableColumn.setCellValueFactory(new PropertyValueFactory<>("violation"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("blacklistedDate"));
    }

    @javafx.fxml.FXML
    public void showBlacklistedFectoryButtonOnAction(ActionEvent actionEvent) {

        ArrayList<BlacklistedFactory> sl = new ArrayList<>();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("BlacklistedFactory.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            BlacklistedFactory s = null;
            while (true) {
                try {
                    s = (BlacklistedFactory) ois.readObject();
                    if (s != null) {
                        System.out.println("Loaded factory name: " + s.getFactoryName()); // debug
                        sl.add(s);
                    }
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if(ois != null) ois.close();
            } catch(Exception e) {
                e.printStackTrace();
            }
        }

        blaclistedFactoryTableview.getItems().clear();
        blaclistedFactoryTableview.getItems().addAll(sl);
    }

    @javafx.fxml.FXML
    public void LCODashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource(("/com/example/bgmea/AlamgirFXML/LaborComplianceOfficerDashboard.fxml")));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}