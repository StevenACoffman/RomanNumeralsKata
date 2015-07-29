package com.github.StevenACoffman;

public class RomanNumeral {
    
    public static String calculate(int input) {
        String result;
        if (input == 5) {
            result = "V";
        } else {
            result = repeat("I", input);
        }
        return result;
        
    }
    
    private static String repeat(String repeated, int count) {
        return new String(new char[count]).replace("\0", repeated);
    }
    
}
