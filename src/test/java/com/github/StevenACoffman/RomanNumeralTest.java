package com.github.StevenACoffman;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class RomanNumeralTest {
    @Test
    public void convertFromNumberToRomanNumeral() {
        // Given
        // When
        // Then
        assertThat(RomanNumeral.calculate(1), is(equalTo("I")));
        assertThat(RomanNumeral.calculate(2), is(equalTo("II")));
        assertThat(RomanNumeral.calculate(5), is(equalTo("V")));
        assertThat(RomanNumeral.calculate(6), is(equalTo("VI")));
        assertThat(RomanNumeral.calculate(10), is(equalTo("X")));
        assertThat(RomanNumeral.calculate(20), is(equalTo("XX")));
    }
    
}
