module com.example.bgmea {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.bgmea.MahathirFXML to javafx.fxml;
    opens com.example.bgmea to javafx.fxml;
    exports com.example.bgmea;
}