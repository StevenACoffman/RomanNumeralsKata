package com.github.StevenACoffman.domain;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanNumeralFormTest {
    private static final String ROMAN_NUMERAL_FOUR = "IV";
    
    @Test
    public void isBlankWorks() {
        RomanNumeralForm romanNumeralForm = new RomanNumeralForm();
        RomanNumeral romanNumeral = new RomanNumeral(ROMAN_NUMERAL_FOUR);
        assertThat(romanNumeralForm.isNotBlank(), is(equalTo(false)));
        
        romanNumeralForm.setRomanNumeral(romanNumeral);
        assertThat(romanNumeralForm.isNotBlank(), is(equalTo(true)));
        assertThat(romanNumeralForm.getRomanNumeral().getRoman(), is(equalTo(ROMAN_NUMERAL_FOUR)));
    }
    
    @Test
    public void romanInputWorks() {
        RomanNumeralForm romanNumeralForm = new RomanNumeralForm();
        romanNumeralForm.setRomanInput(ROMAN_NUMERAL_FOUR);
        assertThat(romanNumeralForm.getRomanInput(), is(equalTo(ROMAN_NUMERAL_FOUR)));
        assertThat(romanNumeralForm.getRomanNumeral().getRoman(), is(equalTo(ROMAN_NUMERAL_FOUR)));
    }
}
