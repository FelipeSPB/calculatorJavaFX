package application;

import java.text.DecimalFormat;

public interface Methods {


    static boolean checkExpressionLength(String expression) {
        if (expression.length() >= 10) {
            return false;
        }
        return true;
    }

    static boolean alreadyHasMathSymbol(String expression) {
        for (int i = 0; i < expression.length(); i++) {
            String charIndex = Character.toString(expression.charAt(i));
            if (charIndex.equals("+") || charIndex.equals("-") || charIndex.equals("x") || charIndex.equals("÷")) {
                return true;
            }
        }
        return false;
    }

    static boolean checkingDecimals(String expression){
        int countDots = 0;
        for (int i = 0; i < expression.length(); i++) {
            String charIndex = Character.toString(expression.charAt(i));
            if(charIndex.equals(".")){
                countDots++;
                if(Character.toString(expression.charAt(i+1)).equals(".")){
                    return false;
                }
            }
            if(countDots>=2){
                return false;
            }
        }
        return true;
    }

    static double checkNumber(String expression) {
        String number = "0";
        for (int i = 0; i < expression.length(); i++) {
            String charIndex = Character.toString(expression.charAt(i));
            if (charIndex.equals("+") || charIndex.equals("-") || charIndex.equals("x") || charIndex.equals("÷")) {
                break;
            } else {
                number += charIndex;
            }
        }
        return Double.parseDouble(number);
    }

    static String calculate(String expression) {
        DecimalFormat format = new DecimalFormat("#.00");
        Double result = 0.0;
        String numberActual = "0";
        if (expression.equals(numberActual)){
            return expression;
        }
        for (int i = 0; i < expression.length(); i++) {
            String charIndex = Character.toString(expression.charAt(i));
            if(charIndex.equals("+")) {
                if (i == expression.indexOf(-1)) {
                    return numberActual;
                }
                result = checkNumber(numberActual) + checkNumber(expression.substring(i+1));
                }
            else if(charIndex.equals("-")) {
                if (i == expression.indexOf(-1)) {
                    return numberActual;
                    }
                result = checkNumber(numberActual) - checkNumber(expression.substring(i+1));
                }
            else if(charIndex.equals("x")) {
                if (i == expression.indexOf(-1)) {
                    return numberActual;
                    }
                result = checkNumber(numberActual) * checkNumber(expression.substring(i+1));
                }
            else if(charIndex.equals("÷")) {
                if (i == expression.indexOf(-1)) {
                    return numberActual;
                    }
                result = checkNumber(numberActual)/checkNumber(expression.substring(i+1));
                }
            else{
                numberActual += charIndex;
                }
             }

        return format.format(result).toString();
        }
    }

