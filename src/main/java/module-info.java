module com.example.gerenciarprodutos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gerenciarprodutos to javafx.fxml;
    exports com.example.gerenciarprodutos;
}