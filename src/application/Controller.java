package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.Locale;

public class Controller {

    Locale setLocal = new Locale("en","US");

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
        showUser += numberOne.getText();
        painel.setText(showUser);
    }

    public void addNumTwo(ActionEvent actionEvent) {
        showUser += numberTwo.getText();
        painel.setText(showUser);
    }

    public void addNumThree(ActionEvent actionEvent) {
        showUser += numberThree.getText();
        painel.setText(showUser);
    }

    public void addNumFour(ActionEvent actionEvent) {
        showUser += numberFour.getText();
        painel.setText(showUser);
    }

    public void addNumFive(ActionEvent actionEvent) {
        showUser += numberFive.getText();
        painel.setText(showUser);
    }

    public void addNumSix(ActionEvent actionEvent) {
        showUser += numberSix.getText();
        painel.setText(showUser);
    }

    public void addNumSeven(ActionEvent actionEvent) {
        showUser += numberSeven.getText();
        painel.setText(showUser);
    }

    public void addNumEight(ActionEvent actionEvent) {
        showUser += numberEight.getText();
        painel.setText(showUser);
    }

    public void addNumNine(ActionEvent actionEvent) {
        showUser += numberNine.getText();
        painel.setText(showUser);
    }

    public void addNumZero(ActionEvent actionEvent) {
        showUser += numberZero.getText();
        painel.setText(showUser);
    }

    public void addDecimal(ActionEvent actionEvent) {
        showUser += decimalButton.getText();
        painel.setText(showUser);

    }

    public void addXSymbol(ActionEvent actionEvent) {
        showUser += multiplicationButton.getText();
        painel.setText(showUser);
    }

    public void clearViewer(ActionEvent actionEvent) {
        showUser = "";
        painel.setText("0");
    }

    public void calculatePorcentage(ActionEvent actionEvent) {
        painel.setText(showUser);
    }

    public void addDivideSymbol(ActionEvent actionEvent) {
        showUser += divisionButton.getText();
        painel.setText(showUser);
    }

    public void toCalculate(ActionEvent actionEvent) {
    }

    public void addPlusSymbol(ActionEvent actionEvent) {
        showUser += plusButton.getText();
        painel.setText(showUser);
    }


    public void addMinusSymbol(ActionEvent actionEvent) {
        showUser += minusButton.getText();
        painel.setText(showUser);
    }
}
