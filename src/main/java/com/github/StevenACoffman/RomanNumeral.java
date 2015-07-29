package com.github.StevenACoffman;

public class RomanNumeral {
    
    public static String calculate(int input) {
        String result = "";
        
        for (RomanNumeralCharacter romanNumeralCharacter : RomanNumeralCharacter.values()) {
            while (input >= romanNumeralCharacter.getNumericValue()) {
                result += romanNumeralCharacter.toString();
                input -= romanNumeralCharacter.getNumericValue();
            }
        }
        
        return result;
        
    }
    
}
