package com.github.StevenACoffman.domain;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanNumeralTest {
    @Test
    public void constructFromRomanNumeral() {
        // Given
        RomanNumeral romanNumeral = new RomanNumeral("IV");
        // Then
        assertThat(romanNumeral.getNumericValue(), is(equalTo(4)));
        assertThat(romanNumeral.getRoman(), is(equalTo("IV")));
    }
    
    @Test
    public void constructFromIntegerString() {
        RomanNumeral romanNumeral = new RomanNumeral("4");
        assertThat(romanNumeral.getRoman(), is(equalTo("IV")));
        assertThat(romanNumeral.getNumericValue(), is(equalTo(4)));
    }
    
    @Test
    public void convertFromNumberToRomanNumeral() {
        // Then
        assertThat(RomanNumeral.convertToRomanNumerals(1), is(equalTo("I")));
        assertThat(RomanNumeral.convertToRomanNumerals(2), is(equalTo("II")));
        assertThat(RomanNumeral.convertToRomanNumerals(4), is(equalTo("IV")));
        assertThat(RomanNumeral.convertToRomanNumerals(5), is(equalTo("V")));
        assertThat(RomanNumeral.convertToRomanNumerals(6), is(equalTo("VI")));
        assertThat(RomanNumeral.convertToRomanNumerals(9), is(equalTo("IX")));
        assertThat(RomanNumeral.convertToRomanNumerals(10), is(equalTo("X")));
        assertThat(RomanNumeral.convertToRomanNumerals(20), is(equalTo("XX")));
        assertThat(RomanNumeral.convertToRomanNumerals(40), is(equalTo("XL")));
        assertThat(RomanNumeral.convertToRomanNumerals(50), is(equalTo("L")));
        assertThat(RomanNumeral.convertToRomanNumerals(100), is(equalTo("C")));
        assertThat(RomanNumeral.convertToRomanNumerals(207), is(equalTo("CCVII")));
        assertThat(RomanNumeral.convertToRomanNumerals(400), is(equalTo("CD")));
        assertThat(RomanNumeral.convertToRomanNumerals(500), is(equalTo("D")));
        assertThat(RomanNumeral.convertToRomanNumerals(1000), is(equalTo("M")));
        
        assertThat(RomanNumeral.convertToRomanNumerals(1954), is(equalTo("MCMLIV")));
        assertThat(RomanNumeral.convertToRomanNumerals(1990), is(equalTo("MCMXC")));
        assertThat(RomanNumeral.convertToRomanNumerals(2015), is(equalTo("MMXV")));
        assertThat(RomanNumeral.convertToRomanNumerals(3999), is(equalTo("MMMCMXCIX")));
        
    }
    
    @Test
    public void convertFromRomanNumeralToNumber() {
        assertThat(RomanNumeral.convertFromRomanNumerals("I"), is(equalTo(1)));
        assertThat(RomanNumeral.convertFromRomanNumerals("II"), is(equalTo(2)));
        assertThat(RomanNumeral.convertFromRomanNumerals("IV"), is(equalTo(4)));
        assertThat(RomanNumeral.convertFromRomanNumerals("V"), is(equalTo(5)));
        assertThat(RomanNumeral.convertFromRomanNumerals("VI"), is(equalTo(6)));
        assertThat(RomanNumeral.convertFromRomanNumerals("IX"), is(equalTo(9)));
        assertThat(RomanNumeral.convertFromRomanNumerals("X"), is(equalTo(10)));
        assertThat(RomanNumeral.convertFromRomanNumerals("XX"), is(equalTo(20)));
        assertThat(RomanNumeral.convertFromRomanNumerals("XL"), is(equalTo(40)));
        assertThat(RomanNumeral.convertFromRomanNumerals("L"), is(equalTo(50)));
        assertThat(RomanNumeral.convertFromRomanNumerals("C"), is(equalTo(100)));
        assertThat(RomanNumeral.convertFromRomanNumerals("CCVII"), is(equalTo(207)));
        assertThat(RomanNumeral.convertFromRomanNumerals("CD"), is(equalTo(400)));
        assertThat(RomanNumeral.convertFromRomanNumerals("D"), is(equalTo(500)));
        assertThat(RomanNumeral.convertFromRomanNumerals("M"), is(equalTo(1000)));
        
        assertThat(RomanNumeral.convertFromRomanNumerals("MCMLIV"), is(equalTo(1954)));
        assertThat(RomanNumeral.convertFromRomanNumerals("MCMXC"), is(equalTo(1990)));
        assertThat(RomanNumeral.convertFromRomanNumerals("MMXV"), is(equalTo(2015)));
        assertThat(RomanNumeral.convertFromRomanNumerals("MMMCMXCIX"), is(equalTo(3999)));
    }
    
}
