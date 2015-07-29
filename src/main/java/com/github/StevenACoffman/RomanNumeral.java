package com.github.StevenACoffman;

public class RomanNumeral {
    
    public static String calculate(int input) {
        String result = "";
        
        while (input >= 10) {
            result += "X";
            input -= 10;
        }
        
        while (input >= 5) {
            result += "V";
            input -= 5;
        }
        while (input >= 4) {
            result += "IV";
            input -= 4;
        }
        while (input >= 1) {
            result += "I";
            input -= 1;
        }
        
        return result;
        
    }
    
    private static String repeat(String repeated, int count) {
        return new String(new char[count]).replace("\0", repeated);
    }
    
}
