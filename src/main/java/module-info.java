module org.example.javafxassignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens org.example.javafxassignment to javafx.fxml,javafx.graphics;
    opens org.example.javafxassignment.controller to javafx.fxml,javafx.graphics;
    opens org.example.javafxassignment.entity to javafx.fxml,javafx.graphics;
    opens org.example.javafxassignment.repository to javafx.fxml,javafx.graphics;
    exports org.example.javafxassignment.entity;
    exports org.example.javafxassignment.controller ;
    exports org.example.javafxassignment;
}