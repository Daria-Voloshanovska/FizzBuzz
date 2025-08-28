package com.example.fizzbuzz;

public class Main {
    public static void main(String[] args) {
        new FizzBuzz()
                .addRule(3, "Fizz")
                .addRule(5, "Buzz")
                .run(1, 100);
    }
}

