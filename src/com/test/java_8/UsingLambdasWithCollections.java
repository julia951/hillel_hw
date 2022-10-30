package com.test.java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingLambdasWithCollections {

    public static void main(String[] args) {
        // boolean removeIf(Predicate<? super E> filter)

        List<String> names = new ArrayList<>(Arrays.asList("Sara", "Bob", "Paul"));
        System.out.println(names);

        names.removeIf(name -> name.startsWith("S"));
        System.out.println(names);

        names.removeIf((String s) -> s.length() < 4);
        System.out.println(names);

        // void replaceAll(UnaryOperator<E> operator)
        List<Integer> integers = Arrays.asList(1, 2, 3);
        integers.replaceAll(i -> i * 2);
        System.out.println(integers);

        // forEach
        for (String name : names) {
            System.out.println(name);
        }

        //using lambda
        names.forEach(name -> System.out.println(name));

        //using method reference
        names.forEach(System.out::println);
    }
}
