package com.github.StevenACoffman;

public enum RomanNumeralCharacter {
  
  //@formatter:off
    L("L", 50),
    X("X", 10),
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
