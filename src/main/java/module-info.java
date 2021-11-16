module com.example.manualadd {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.manualadd to javafx.fxml;
    exports com.example.manualadd;
}