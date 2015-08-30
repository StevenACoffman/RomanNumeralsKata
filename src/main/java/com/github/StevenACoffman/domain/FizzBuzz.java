package com.github.StevenACoffman.domain;

import java.util.function.Predicate;

public class FizzBuzz {
    
    public String process(Integer input) {
        String fizz = isDivisibileBy(3).test(input) ? "Fizz" : "";
        String buzz = isDivisibileBy(5).test(input) ? "Buzz" : "";
        return (fizz.isEmpty() && buzz.isEmpty()) ? input.toString() : fizz + buzz;
    }
    
    private Predicate<Integer> isDivisibileBy(int divisor) {
        return dividend -> (dividend % divisor) == 0;
    }
    
}
