package com.example.fizzbuzz;

import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzz {
    private static final Map<Integer, String> rules = new LinkedHashMap<>();
    private static boolean suppressCombined = false;   // Flag to control combined output suppression

    public FizzBuzz addRule(int divisor, String word) {
        rules.put(divisor, word);
        return this;
    }

    public FizzBuzz setSuppressCombined(boolean suppress) {
        suppressCombined = suppress;
        return this;
    }

    public void run(int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }

    public String getFizzBuzzValue(int number) {
        StringBuilder output = new StringBuilder();
        int matchCount = 0; // Tracks how many rules matched

        for (Map.Entry<Integer, String> entry : rules.entrySet()) {
            if (number % entry.getKey() == 0) {
                output.append(entry.getValue());
                matchCount++;
            }
        }
        // Suppress combined output if enabled and multiple rules matched
        if (suppressCombined && matchCount > 1) {
            return String.valueOf(number);
        }

        return output.length() > 0 ? output.toString() : String.valueOf(number);
    }


}
