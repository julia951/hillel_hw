package com.test.java_8;

import java.util.*;

public class AdvantageOfUsingStreams {
    public static void main(String[] args) {
//        Task: print the first two names alphabetically that are four characters long.
        List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");

        List<String> filtered = new ArrayList<>();
        for (String name : list) {
            if (name.length() == 4) {
                filtered.add(name);
            }
        }
        Collections.sort(filtered);
        System.out.println(filtered.get(0));
        System.out.println(filtered.get(1));

        //============================================================//
        list.stream()
                .filter(name -> name.length() == 4)
                .sorted()
                .limit(2)
                .forEach(System.out::println);
    }
}
