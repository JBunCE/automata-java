module com.example.automata {
    requires javafx.controls;
    requires javafx.fxml;
    requires lombok;
    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.automata to javafx.fxml;
    exports com.example.automata;
}