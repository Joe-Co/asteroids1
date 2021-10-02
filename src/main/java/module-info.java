module com.example.asteroids1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.asteroids1 to javafx.fxml;
    exports com.example.asteroids1;
}