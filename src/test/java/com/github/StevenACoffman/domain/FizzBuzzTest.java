package com.github.StevenACoffman.domain;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void shouldReturnOneForOne() {
        assertThat(new FizzBuzz().process(1), is(equalTo("1")));
        assertThat(new FizzBuzz().process(3), is(equalTo("Fizz")));
        assertThat(new FizzBuzz().process(5), is(equalTo("Buzz")));
        assertThat(new FizzBuzz().process(15), is(equalTo("FizzBuzz")));
    }
}
