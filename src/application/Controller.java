package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import static application.Methods.alreadyHasMathSymbol;

public class Controller {

    Locale setLocal = new Locale("en", "US");
    String showUser = "";


    @FXML
    private Label painel;

    @FXML
    private Button numberOne;

    @FXML
    private Button numberTwo;

    @FXML
    private Button numberThree;

    @FXML
    private Button numberFour;

    @FXML
    private Button numberFive;

    @FXML
    private Button numberSix;

    @FXML
    private Button numberSeven;

    @FXML
    private Button numberEight;

    @FXML
    private Button numberNine;

    @FXML
    private Button numberZero;

    @FXML
    private Button plusButton;

    @FXML
    private Button minusButton;

    @FXML
    private Button multiplicationButton;

    @FXML
    private Button divisionButton;

    @FXML
    private Button equalButton;

    @FXML
    private Button decimalButton;

    @FXML
    private Button clearButton;

    @FXML
    private Button porcentageButton;


    public void addNumOne(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())) {
        showUser += numberOne.getText();
        painel.setText(showUser);
        }
    }

    public void addNumTwo(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())) {
        showUser += numberTwo.getText();
        painel.setText(showUser);
        }
    }

    public void addNumThree(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())) {
        showUser += numberThree.getText();
        painel.setText(showUser);
        }
    }

    public void addNumFour(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())) {
        showUser += numberFour.getText();
        painel.setText(showUser);
        }
    }

    public void addNumFive(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())) {
            showUser += numberFive.getText();
            painel.setText(showUser);
        }
    }

    public void addNumSix(ActionEvent actionEvent) {
        showUser += numberSix.getText();
        painel.setText(showUser);
    }

    public void addNumSeven(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())) {
        showUser += numberSeven.getText();
        painel.setText(showUser);
        }
    }

    public void addNumEight(ActionEvent actionEvent) {
            showUser += numberEight.getText();
            painel.setText(showUser);
    }

    public void addNumNine(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())) {
           showUser += numberNine.getText();
            painel.setText(showUser);
        }
    }

    public void addNumZero(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())) {
            showUser += numberZero.getText();
            painel.setText(showUser);
        }
    }

    public void addDecimal(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())) {
            showUser += decimalButton.getText();
            painel.setText(showUser);
        }
    }

    public void addXSymbol(ActionEvent actionEvent) {
        if(Methods.checkShowUser(painel.getText())  && !alreadyHasMathSymbol(showUser)){
            showUser += multiplicationButton.getText();
            painel.setText(showUser);
        }
    }

    public void clearViewer(ActionEvent actionEvent) {
        showUser = "";
        painel.setText("0");
    }

    public void calculatePorcentage(ActionEvent actionEvent) {
        painel.setText(showUser);
    }

    public void addDivideSymbol(ActionEvent actionEvent) {
            if(Methods.checkShowUser(painel.getText())  && !alreadyHasMathSymbol(showUser)){
                showUser += divisionButton.getText();
                painel.setText(showUser);
        }

    }

    public void toCalculate(ActionEvent actionEvent) {
    }

    public void addPlusSymbol(ActionEvent actionEvent) {
        if(Methods.checkShowUser(showUser) && !alreadyHasMathSymbol(showUser)){
            showUser += plusButton.getText();
            painel.setText(showUser);
        }

    }


    public void addMinusSymbol(ActionEvent actionEvent) {
        if (Methods.checkShowUser(painel.getText())&& !alreadyHasMathSymbol(showUser)) {
            showUser += minusButton.getText();
            painel.setText(showUser);
        }

    }
}

