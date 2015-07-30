package com.github.StevenACoffman.domain;

import lombok.Getter;

public class RomanNumeral {
    @Getter
    private int numericValue;
    
    @Getter
    private String roman;
    
    public RomanNumeral() {
        numericValue = 0;
        roman = "";
    }
    
    public RomanNumeral(String input) {
        if (isNumeric(input)) {
            numericValue = Integer.parseInt(input);
            roman = convertToRomanNumerals(numericValue);
        } else {
            roman = input;
            numericValue = convertFromRomanNumerals(input);
        }
    }
    
    private boolean isNumeric(String str) {
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return roman;
    }
    
    public static String convertToRomanNumerals(int input) {
        String result = "";
        
        for (RomanNumeralCharacter romanNumeralCharacter : RomanNumeralCharacter.values()) {
            while (input >= romanNumeralCharacter.getNumericValue()) {
                result += romanNumeralCharacter.toString();
                input -= romanNumeralCharacter.getNumericValue();
            }
        }
        return result;
        
    }
    
    public static int convertFromRomanNumerals(String input) {
        int result = 0;
        for (RomanNumeralCharacter romanNumeralCharacter : RomanNumeralCharacter.values()) {
            while (isNotBlank(input) && input.startsWith(romanNumeralCharacter.toString())) {
                result += romanNumeralCharacter.getNumericValue();
                input = removePrefix(input, romanNumeralCharacter);
            }
        }
        
        return result;
    }
    
    /**
     * @param input
     * @param romanNumeralCharacter
     * @return
     */
    private static String removePrefix(String input, RomanNumeralCharacter romanNumeralCharacter) {
        return input.substring(romanNumeralCharacter.toString().length());
    }
    
    /**
     * @param input
     * @return
     */
    private static boolean isNotBlank(String input) {
        return input != null && !"".equals(input);
    }
    
    public enum RomanNumeralCharacter {
        
        //@formatter:off
          M("M", 1000),
          CM("CM", 900),
          D("D", 500),
          CD("CD", 400),
          C("C", 100),
          XC("XC", 90),
          L("L", 50),
          XL("XL",40),
          X("X", 10),
          IX("IX", 9),
          V("V", 5),
          IV("IV", 4),
          I("I", 1);
        //@formatter:on
        
        private String character;
        private int numericValue;
        
        private RomanNumeralCharacter(String character, int value) {
            this.character = character;
            this.numericValue = value;
            
        }
        
        public int getNumericValue() {
            return this.numericValue;
        }
        
        public String toString() {
            return this.character;
        }
    }
    
}
