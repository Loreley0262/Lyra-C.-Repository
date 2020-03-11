package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller {
    public Button btn7;
    public Button btn4;
    public Button btn1;
    public Button btn8;
    public Button btn5;
    public Button btn2;
    public Button btn9;
    public Button btn6;
    public Button btn3;
    public Button btnAdd;
    public Button btnSub;
    public Button btn0;
    public Button btnClr;
    public Label lblTotal;
    public String temp;
    public int num;
    public int savenum;


    ArrayList<Integer> ints = new ArrayList<Integer>();
    ArrayList<Double> numbers = new ArrayList<Double>();
    ArrayList<String> operations = new ArrayList<String>();


    public void zero(ActionEvent actionEvent) {
        ints.add(0);
        String str = "";
        for (int i = 0; i < ints.size(); i++) {
            str = str + "" + ints.get(i);
        }
        lblTotal.setText(str);
        num = Integer.parseInt(str);
    }

    public void one(ActionEvent actionEvent) {
        ints.add(1);
        String str = "";
        for (int i = 0; i < ints.size(); i++) {
            str = str + "" + ints.get(i);
        }
        lblTotal.setText(str);
        num = Integer.parseInt(str);
    }

    public void two(ActionEvent actionEvent) {
        ints.add(2);
        String str = "";
        for (int i = 0; i < ints.size(); i++) {
            str = str + "" + ints.get(i);
        }
        lblTotal.setText(str);
        num = Integer.parseInt(str);
    }

    public void three(ActionEvent actionEvent) {
        ints.add(3);
        String str = "";
        for (int i = 0; i < ints.size(); i++) {
            str = str + "" + ints.get(i);
        }
        lblTotal.setText(str);
        num = Integer.parseInt(str);
    }

    public void clr(ActionEvent actionEvent) {
        lblTotal.setText(Integer.toString(0));
        ints.clear();
        operations.clear();
    }

    public void plus(ActionEvent actionEvent) {
        savenum = num;
        operations.add("+");
    }

    public void equals(ActionEvent actionEvent) {

        for (int i = 0; i<ints.size(); i++){
            if (operations.get(i).equals("+")){
                savenum = savenum + num;
            }
        }
    }

    public void decimal(ActionEvent actionEvent) {
//        for (int i = 0; i < ints.size(); i++) {
//            str = str + "" + ints.get(i);
//        }
//        temp = lblTotal.toString() + ".";
//        String str = ".";
//        lblTotal.setText(temp);
    }
}
