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
        assertThat(RomanNumeral.calculate("IV"), is(equalTo(4)));
        assertThat(RomanNumeral.calculate("V"), is(equalTo(5)));
        assertThat(RomanNumeral.calculate("VI"), is(equalTo(6)));
        assertThat(RomanNumeral.calculate("IX"), is(equalTo(9)));
        assertThat(RomanNumeral.calculate("X"), is(equalTo(10)));
        assertThat(RomanNumeral.calculate("XX"), is(equalTo(20)));
        assertThat(RomanNumeral.calculate("XL"), is(equalTo(40)));
        assertThat(RomanNumeral.calculate("L"), is(equalTo(50)));
        assertThat(RomanNumeral.calculate("C"), is(equalTo(100)));
        assertThat(RomanNumeral.calculate("CCVII"), is(equalTo(207)));
        assertThat(RomanNumeral.calculate("CD"), is(equalTo(400)));
        assertThat(RomanNumeral.calculate("D"), is(equalTo(500)));
        assertThat(RomanNumeral.calculate("M"), is(equalTo(1000)));
        
        assertThat(RomanNumeral.calculate("MCMLIV"), is(equalTo(1954)));
        assertThat(RomanNumeral.calculate("MCMXC"), is(equalTo(1990)));
        assertThat(RomanNumeral.calculate("MMXV"), is(equalTo(2015)));
        assertThat(RomanNumeral.calculate("MMMCMXCIX"), is(equalTo(3999)));
    }
    
}
