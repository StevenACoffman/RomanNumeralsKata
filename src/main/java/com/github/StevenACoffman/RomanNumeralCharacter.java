package com.github.StevenACoffman;

public enum RomanNumeralCharacter {
  
  //@formatter:off
    M("M", 1000),
    D("D", 500),
    CD("CD", 400),
    C("C", 100),
    L("L", 50),
    XL("XL",40),
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
