package com.test.java_8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreatingStreamSources {
    public static void main(String[] args) {
        Stream<String> empty = Stream.empty();
        Stream<Integer> singleElement = Stream.of(1);
        Stream<Integer> severalElements = Stream.of(1, 2, 3);

        List<String> list = Arrays.asList("one", "two", "three", "four");
        Stream<String> fromList = list.stream();

        Double[] array = {0.1, 0.2, 0.3, 0.4, 0.5};
        Stream<Double> fromArray = Stream.of(array);
    }
}
