package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Locale;

import static application.Methods.*;

public class Controller {

    Locale setLocal = new Locale("en", "US");
    String expression = "";


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
        if (Methods.checkExpressionLength(painel.getText())) {
        expression += numberOne.getText();
        painel.setText(expression);
        }
    }

    public void addNumTwo(ActionEvent actionEvent) {
        if (Methods.checkExpressionLength(painel.getText())) {
        expression += numberTwo.getText();
        painel.setText(expression);
        }
    }

    public void addNumThree(ActionEvent actionEvent) {
        if (Methods.checkExpressionLength(painel.getText())) {
        expression += numberThree.getText();
        painel.setText(expression);
        }
    }

    public void addNumFour(ActionEvent actionEvent) {
        if (Methods.checkExpressionLength(painel.getText())) {
        expression += numberFour.getText();
        painel.setText(expression);
        }
    }

    public void addNumFive(ActionEvent actionEvent) {
        if (Methods.checkExpressionLength(painel.getText())) {
            expression += numberFive.getText();
            painel.setText(expression);
        }
    }

    public void addNumSix(ActionEvent actionEvent) {
        expression += numberSix.getText();
        painel.setText(expression);
    }

    public void addNumSeven(ActionEvent actionEvent) {
        if (Methods.checkExpressionLength(painel.getText())) {
        expression += numberSeven.getText();
        painel.setText(expression);
        }
    }

    public void addNumEight(ActionEvent actionEvent) {
            expression += numberEight.getText();
            painel.setText(expression);
    }

    public void addNumNine(ActionEvent actionEvent) {
        if (Methods.checkExpressionLength(painel.getText())) {
           expression += numberNine.getText();
            painel.setText(expression);
        }
    }

    public void addNumZero(ActionEvent actionEvent) {
        if (Methods.checkExpressionLength(painel.getText()) && !expression.equals("")) {
            expression += numberZero.getText();
            painel.setText(expression);
        }
    }

    public void addDecimal(ActionEvent actionEvent) {
        if (expression.equals("")){
            expression += 0 + decimalButton.getText();
            painel.setText(expression);
        }
        if (Methods.checkExpressionLength(painel.getText()) && checkingDecimals(expression)) {
            expression += decimalButton.getText();
            painel.setText(expression);
        }
    }

    public void addXSymbol(ActionEvent actionEvent) {
        if(Methods.checkExpressionLength(painel.getText())  && !alreadyHasMathSymbol(expression) && !expression.equals("")){
            expression += multiplicationButton.getText();
            painel.setText(expression);
        }
    }

    public void clearViewer(ActionEvent actionEvent) {
        expression = "";
        painel.setText("0");
    }

    public void calculatePorcentage(ActionEvent actionEvent) {
        painel.setText(porcentage(painel.getText()));
    }

    public void addDivideSymbol(ActionEvent actionEvent) {
            if(Methods.checkExpressionLength(painel.getText())  && !alreadyHasMathSymbol(expression) && !expression.equals("")){
                expression += divisionButton.getText();
                painel.setText(expression);
        }

    }

    public void toCalculate(ActionEvent actionEvent) {
        painel.setText(calculate(painel.getText()));
    }

    public void addPlusSymbol(ActionEvent actionEvent) {
        if(Methods.checkExpressionLength(expression) && !alreadyHasMathSymbol(expression) && !expression.equals("")){
            expression += plusButton.getText();
            painel.setText(expression);
        }

    }

    public void addMinusSymbol(ActionEvent actionEvent) {
        if (Methods.checkExpressionLength(painel.getText())&& !alreadyHasMathSymbol(expression) && !expression.equals("")) {
            expression += minusButton.getText();
            painel.setText(expression);
        }

    }
}

