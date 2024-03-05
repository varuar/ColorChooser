module org.openjfx.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.openjfx.colorchooser to javafx.fxml;
    exports org.openjfx.colorchooser;
}