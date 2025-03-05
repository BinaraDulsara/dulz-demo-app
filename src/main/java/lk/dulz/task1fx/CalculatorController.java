package lk.dulz.task1fx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class CalculatorController {

    @FXML
    private TextField txtFstNum;

    @FXML
    private TextField txtSecNum;

    int result ;

    @FXML
    void devide(ActionEvent event) {

        int fstNum = Integer.parseInt(txtFstNum.getText());
        int secNum = Integer.parseInt(txtSecNum.getText());

        result = fstNum / secNum;


    }

    @FXML
    void minus(ActionEvent event) {

        int fstNum = Integer.parseInt(txtFstNum.getText());
        int secNum = Integer.parseInt(txtSecNum.getText());

        result = fstNum - secNum;

    }

    @FXML
    void multiply(ActionEvent event) {

        int fstNum = Integer.parseInt(txtFstNum.getText());
        int secNum = Integer.parseInt(txtSecNum.getText());

        result = fstNum * secNum;

    }

    @FXML
    void puls(ActionEvent event) {

        int fstNum = Integer.parseInt(txtFstNum.getText());
        int secNum = Integer.parseInt(txtSecNum.getText());

        result = fstNum + secNum;

    }

    @FXML
    void answer(ActionEvent event) {

        System.out.println("The Result : "+ result);

        System.out.println("Binara");



    }

}
