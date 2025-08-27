
module com.wahat {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires java.sql;

    requires com.jfoenix;

    opens com.wahat to javafx.fxml;
    opens com.wahat.controller to javafx.fxml;
    // opens com.wahat.model to javafx.base;

    exports com.wahat;
    exports com.wahat.controller;

}
