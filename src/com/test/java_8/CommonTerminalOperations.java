package com.test.java_8;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonTerminalOperations {
    public static void main(String[] args) {
        // long count();

        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
//        System.out.println(stream.count());

//        Optional<T> min(Comparator<? super T> comparator)
//        Optional<T> max(Comparator<? super T> comparator)

//        Optional<String> min = stream.min((s1, s2) -> s1.length() - s2.length());
//        min.ifPresent(System.out::println);

//        Optional<String> max = stream.max(Comparator.comparingInt(String::length));
//        max.ifPresent(System.out::println);

//        Optional<T> findFirst()
//        stream.findFirst().ifPresent(System.out::println);

//        boolean anyMatch(Predicate <? super T> predicate)
//        boolean allMatch(Predicate <? super T> predicate)
//        boolean noneMatch(Predicate <? super T> predicate)

//        List<String> list = Arrays.asList("monkey", "2", "chimp");
//        Predicate<String> predicate = s -> Character.isLetter(s.charAt(0));
//        System.out.println(list.stream().anyMatch(predicate));
//        System.out.println(list.stream().allMatch(predicate));
//        System.out.println(list.stream().noneMatch(predicate));

//        void forEach(Consumer<? super T> action)
//        stream.forEach(System.out::print);

//        T reduce(T identity, BinaryOperator<T> accumulator)
        String[] array = new String[] { "w", "o", "l", "f" };
        String result = "";
        for (String s: array){
            result = result + s;
        }
        System.out.println(result);

        Stream<String> letterStream = Stream.of("w", "o", "l", "f");
        String word = letterStream.reduce("", (l1, l2) -> l1 + l2);
        System.out.println(word);

//        collect()
//        TreeSet<String> set = stream.collect(Collectors.toCollection(TreeSet::new));
//        System.out.println(set);

//        Set<String> set = stream.collect(Collectors.toSet());
//        System.out.println(set);

        List<String> list = stream.collect(Collectors.toList());
        System.out.println(list);

    }
}
