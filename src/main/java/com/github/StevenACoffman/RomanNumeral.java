package com.github.StevenACoffman;

public class RomanNumeral {
    
    public static String calculate(int input) {
        String result = "";
        
        while (input >= 10) {
            result += "X";
            input -= 10;
        }
        
        if (input >= 5) {
            result += "V";
            input -= 5;
        }
        if (input >= 4) {
            result += "IV";
            input -= 4;
        }
        
        result += repeat("I", input);
        
        return result;
        
    }
    
    private static String repeat(String repeated, int count) {
        return new String(new char[count]).replace("\0", repeated);
    }
    
}
