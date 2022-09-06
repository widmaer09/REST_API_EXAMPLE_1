module com.example.rest_api {
    requires javafx.controls;
    requires javafx.fxml;
    requires json.simple;


    opens com.example.rest_api to javafx.fxml;
    exports com.example.rest_api;
}