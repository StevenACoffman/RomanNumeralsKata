package com.github.StevenACoffman.domain;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class RomanNumeralForm {
    
    @NotNull
    @Valid
    @Size(min = 1, max = 15)
    @Getter
    private String romanInput;
    
    @Getter
    @Setter
    private RomanNumeral romanNumeral = new RomanNumeral();
    
    public boolean isNotBlank() {
        return romanNumeral.getNumericValue() != 0;
    }
    
    public void setRomanInput(String romanInput) {
        this.romanInput = romanInput;
        romanNumeral = new RomanNumeral(romanInput.trim().toUpperCase());
    }
    
}
