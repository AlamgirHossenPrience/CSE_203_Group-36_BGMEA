package com.example.bgmea;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PresidentDashboardController {

    @FXML
    private Label announcementLabel;

    @FXML
    public void initialize() {
        File file = new File("data/announcement.txt");
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                StringBuilder content = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    content.append(line).append("\n");
                }
                announcementLabel.setText(content.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            announcementLabel.setText("No announcements yet.");
        }
    }
}
