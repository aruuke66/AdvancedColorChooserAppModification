module com.example.advancedcolorchooserappmodification {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.advancedcolorchooserappmodification to javafx.fxml;
    exports com.example.advancedcolorchooserappmodification;
}