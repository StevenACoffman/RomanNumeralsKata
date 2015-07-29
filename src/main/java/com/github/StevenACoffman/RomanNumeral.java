package com.github.StevenACoffman;

public class RomanNumeral {
    
    public static String calculate(int input) {
        
        return repeat("I", input);
        
    }
    
    private static String repeat(String repeated, int count) {
        return new String(new char[count]).replace("\0", repeated);
    }
    
}
