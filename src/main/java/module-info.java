module com.example.bgmea {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bgmea to javafx.fxml;
    exports com.example.bgmea;
}