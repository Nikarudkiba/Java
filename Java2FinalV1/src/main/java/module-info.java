module com.example.java2finalv1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java2finalv1 to javafx.fxml;
    exports com.example.java2finalv1;
}