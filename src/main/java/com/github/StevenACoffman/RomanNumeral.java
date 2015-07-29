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
        private int value;
        
        private RomanNumeralCharacter(String character, int value) {
            this.character = character;
            this.value = value;
            
        }
        
        public int getNumericValue() {
            return this.value;
        }
        
        public String toString() {
            return this.character;
        }
    }
    
}
