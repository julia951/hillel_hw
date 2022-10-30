package com.test.java_8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectingResults {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("lions", "tigers", "bears");
        String collect = list.stream().collect(Collectors.joining(", "));
        String collect2 = String.join(", ", list);
        System.out.println(collect);

        Double collect3 = list.stream().collect(Collectors.averagingInt(String::length));
        System.out.println(collect3);

        List<String> names = Arrays.asList("Toby", "Anna", "Leroy", "Alex");
        Map<String, Integer> collect4 = names.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println(collect4);

        Map<Integer, List<String>> collect5 = names.stream()
//                .collect(Collectors.groupingBy(s -> s.length(), HashMap::new, Collectors.toList()));
                .collect(Collectors.groupingBy(String::length));
        System.out.println(collect5);
    }
}
