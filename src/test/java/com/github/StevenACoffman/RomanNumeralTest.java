package com.github.StevenACoffman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanNumeralTest {
    @Test
    public void convertFromNumberToRomanNumeral() {
        // Then
        assertThat(RomanNumeral.calculate(1), is(equalTo("I")));
        assertThat(RomanNumeral.calculate(2), is(equalTo("II")));
        assertThat(RomanNumeral.calculate(4), is(equalTo("IV")));
        assertThat(RomanNumeral.calculate(5), is(equalTo("V")));
        assertThat(RomanNumeral.calculate(6), is(equalTo("VI")));
        assertThat(RomanNumeral.calculate(9), is(equalTo("IX")));
        assertThat(RomanNumeral.calculate(10), is(equalTo("X")));
        assertThat(RomanNumeral.calculate(20), is(equalTo("XX")));
        assertThat(RomanNumeral.calculate(40), is(equalTo("XL")));
        assertThat(RomanNumeral.calculate(50), is(equalTo("L")));
        assertThat(RomanNumeral.calculate(100), is(equalTo("C")));
        assertThat(RomanNumeral.calculate(207), is(equalTo("CCVII")));
        assertThat(RomanNumeral.calculate(400), is(equalTo("CD")));
        assertThat(RomanNumeral.calculate(500), is(equalTo("D")));
        assertThat(RomanNumeral.calculate(1000), is(equalTo("M")));
        
        assertThat(RomanNumeral.calculate(1954), is(equalTo("MCMLIV")));
        assertThat(RomanNumeral.calculate(1990), is(equalTo("MCMXC")));
        assertThat(RomanNumeral.calculate(2015), is(equalTo("MMXV")));
        assertThat(RomanNumeral.calculate(3999), is(equalTo("MMMCMXCIX")));
        
    }
    
    @Test
    public void convertFromRomanNumeralToNumber() {
        assertThat(RomanNumeral.calculate("I"), is(equalTo(1)));
        assertThat(RomanNumeral.calculate("II"), is(equalTo(2)));
        
    }
    
}
