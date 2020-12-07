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
        if(countCharacters(expression,".") >=3){
            return false;
        }
        int checkDots=0;
        for (int i = 0; i < expression.length(); i++) {
            String charIndex = Character.toString(expression.charAt(i));
            if (charIndex.equals("+") || charIndex.equals("-") || charIndex.equals("x") || charIndex.equals("÷") || checkDots >= 1) {
                if (countCharacters(expression.substring(0, i), ".") >= 2 || countCharacters(expression.substring(i), ".") >= 2) {
                    return false;
                }
            }

            if (charIndex.equals(".")) {
                if (Character.toString(expression.charAt(i + 1)).equals(".")) {
                    return false;
                }
                checkDots++;
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
        DecimalFormat format = new DecimalFormat("#0.00");
        double result = 0;
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

        return format.format(result);
        }

    static int countCharacters(String word, String character){
        int result = 0;
        for (int i = 0; i < word.length(); i++){
            String charIndex=Character.toString(word.charAt(i));
            if(charIndex.equals(character)){
                result++;
            }
        }
        return result;
    }

    static String porcentage(String expression){
        DecimalFormat format = new DecimalFormat("#0.00");
        double result = 0.00;
        String numberActual = "0";
        for (int i = 0; i < expression.length(); i++) {
            String charIndex = Character.toString(expression.charAt(i));
            if(charIndex.equals("+")) {
                return "0";
                }
            else if(charIndex.equals("-")) {
                return "0";
            }
            else if(charIndex.equals("x")) {
                result = checkNumber(numberActual) * (checkNumber(expression.substring(i+1))/100);
            }
            else if(charIndex.equals("÷")) {
                return "0";
            }
            else{
                numberActual += charIndex;
            }
        }

        return format.format(result);
    }

}
