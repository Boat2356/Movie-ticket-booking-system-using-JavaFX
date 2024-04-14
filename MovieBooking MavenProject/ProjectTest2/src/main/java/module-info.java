module com.mycompany.projecttest2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.projecttest2 to javafx.fxml;
    exports com.mycompany.projecttest2;
}
