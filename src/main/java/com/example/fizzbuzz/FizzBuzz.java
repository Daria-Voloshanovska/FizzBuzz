package com.example.fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzz {
    private static final Map<Integer,String> rules = new LinkedHashMap<>();

    public FizzBuzz addRule(int divisor, String word) {
        rules.put(divisor, word);
        return this;
    }
    public void run(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }
    public String getFizzBuzzValue(int number) {
        StringBuilder output = new StringBuilder();

        for (Map.Entry<Integer, String> entry : rules.entrySet()) {
            if (number % entry.getKey() == 0) {
                output.append(entry.getValue());
            }
        }

        return output.length() > 0 ? output.toString() : String.valueOf(number);
    }


}
