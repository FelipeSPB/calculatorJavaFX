package application;

import java.util.ArrayList;

public interface Methods {


    static boolean checkShowUser(String showUser) {
        if (showUser.length() >= 10) {
            return false;
        }
        return true;
    }

    static boolean alreadyHasMathSymbol(String showUser) {
        for (int i = 0; i < showUser.length(); i++) {
            String charIndex = Character.toString(showUser.charAt(i));
            if (charIndex.equals("+") || charIndex.equals("-") || charIndex.equals("x") || charIndex.equals("÷")) {
                return true;
            }
        }
        return false;
    }
}