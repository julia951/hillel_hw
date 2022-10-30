package com.test.java_8;

import java.util.Optional;

public class OptionalExample {
    public static Optional<Double> average(int... scores) {
        if (scores.length == 0) {
            return Optional.empty();
        }
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return Optional.of((double) sum / scores.length);
    }

    public static void main(String[] args) {
        Optional<Double> optional = average(90, 100);
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        optional.ifPresent(System.out::println);

        Optional<Double> empty = average();
        System.out.println(empty.orElse(0.0));
        System.out.println(empty.orElseGet(() -> Math.random()));
        System.out.println(empty.orElseGet(Math::random));
        System.out.println(empty.orElseThrow(() -> new IllegalArgumentException()));
        System.out.println(empty.orElseThrow(IllegalArgumentException::new));
    }
}
