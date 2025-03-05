module lk.dulz.task1fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.dulz.task1fx to javafx.fxml;
    exports lk.dulz.task1fx;
}