package com.example.bgmea;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;

public class SafetyAuditReportController
{
    @javafx.fxml.FXML
    private ToggleGroup fireSafetyTG;
    @javafx.fxml.FXML
    private ComboBox<String> factoryNameCombobox;
    @javafx.fxml.FXML
    private TextArea ouputTextArea;
    @javafx.fxml.FXML
    private ToggleGroup electricalSafetyTG;
    @javafx.fxml.FXML
    private RadioButton protectiveEquipmentNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton electricalSafetyCompliantRB;
    @javafx.fxml.FXML
    private RadioButton structuralIntegrityNonCompliantRB;
    @javafx.fxml.FXML
    private RadioButton protectiveEquipmentNonCompliantRB;
    @javafx.fxml.FXML
    private ToggleGroup structuralIntegrityTG;
    @javafx.fxml.FXML
    private ToggleGroup protectiveEquipmentTG;
    @javafx.fxml.FXML
    private RadioButton structuralIntegrityNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton structuralIntegrityCompliantRB;
    @javafx.fxml.FXML
    private RadioButton fireSafetyNonComplianceRB;
    @javafx.fxml.FXML
    private RadioButton electricalSafetyNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton emergenceResponseNonCompliantRB;
    @javafx.fxml.FXML
    private RadioButton fireSafetyComplianceRB;
    @javafx.fxml.FXML
    private RadioButton electricalSafetyNonCompliantRB;
    @javafx.fxml.FXML
    private RadioButton emergenceResponseNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton emergenceResponseCompliantRB;
    @javafx.fxml.FXML
    private ToggleGroup emergenceResponseTG;
    @javafx.fxml.FXML
    private RadioButton fireSafetyNeedImprovementRB;
    @javafx.fxml.FXML
    private RadioButton protectiveEquipmentCompliantRB;

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
        ArrayList<String> sl = new ArrayList<>();
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("Factory.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);

            Factory s = null;
            while (true) {
                try {
                    s = (Factory) ois.readObject();
                    if (s.getFactoryName() != null && !s.getFactoryName().isEmpty()) {
                        System.out.println("Loaded factory name: " + s.getFactoryName()); // debug
                        sl.add(s.getFactoryName());
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
        for (String s : sl) {
            factoryNameCombobox.getItems().add(s);
        }
    }

    @javafx.fxml.FXML
    public void LCODashboardButtonOnAction(ActionEvent actionEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader (getClass().getResource(("/com/example/bgmea/AlamgirFXML/LaborComplianceOfficerDashboard.fxml")));
        Scene scene = new Scene(fxmlLoader.load());

        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void issueSafetyAuditButtonOnAction(ActionEvent actionEvent) {

        String fireSafety, electricalSafety, structuralIntegrity, emergencyResponse, protectiveEquipment;

        if(fireSafetyComplianceRB.isSelected()){
            fireSafety = "Compliance";
        }else if(fireSafetyNonComplianceRB.isSelected()){
            fireSafety = "Non-compliance";
        }else{
            fireSafety = "Needs-Improvement";
        }

        if(electricalSafetyCompliantRB.isSelected()){
            electricalSafety = "Compliance";
        }else if(electricalSafetyNonCompliantRB.isSelected()){
            electricalSafety = "Non-compliance";
        }else{
            electricalSafety = "Needs-Improvement";
        }

        if(structuralIntegrityCompliantRB.isSelected()){
            structuralIntegrity = "Compliance";
        }else if(structuralIntegrityNonCompliantRB.isSelected()){
            structuralIntegrity = "Non-compliance";
        }else{
            structuralIntegrity = "Needs-Improvement";
        }

        if(emergenceResponseCompliantRB.isSelected()){
            emergencyResponse = "Compliance";
        }else if(emergenceResponseNonCompliantRB.isSelected()){
            emergencyResponse = "Non-compliance";
        }else{
            emergencyResponse = "Needs-Improvement";
        }

        if(protectiveEquipmentCompliantRB.isSelected()){
            protectiveEquipment = "Compliance";
        }else if(protectiveEquipmentNonCompliantRB.isSelected()){
            protectiveEquipment = "Non-compliance";
        }else{
            protectiveEquipment = "Needs-Improvement";
        }

        SafetyAudit sa = new SafetyAudit(factoryNameCombobox.getValue(),
                fireSafety,
                electricalSafety,
                structuralIntegrity,
                emergencyResponse,
                protectiveEquipment);

        File f;
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            f = new File("SafetyAudit.bin");
            if(f.exists()){
                fos = new FileOutputStream( f,true );
                oos = new SafetyAuditReportController.AppendableObjectOutputStream( fos );
            }
            else {
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream( fos );
            }

            oos.writeObject(sa);

        }catch(Exception e) {
            //
        }finally {
            try{
                if(oos != null) oos.close();
            }catch(Exception e){
                //
            }
        }
        ouputTextArea.setText("Successfully conduct factory safety audit. \n"+sa.toString());
    }
}