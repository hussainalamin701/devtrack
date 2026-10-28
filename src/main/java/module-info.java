module com.bulb {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bulb to javafx.fxml;
    exports com.bulb;
}
