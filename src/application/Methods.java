package application;

import java.util.ArrayList;

public interface Methods {

    static ArrayList settingMathArray(){
        String [] symbols = {"+","-","x","÷"};
        ArrayList<String> array = new ArrayList<String>();
        for (String symbol: symbols) {
            array.add(symbol);
        }
        return array;
    }

    static boolean checkShowUser(String showUser) {
        if(showUser.length()>=10){
            return false;
        }
        return true;
    }



}
