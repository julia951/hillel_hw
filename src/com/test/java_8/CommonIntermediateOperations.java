package com.test.java_8;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonIntermediateOperations {
    public static void main(String[] args) {
//        Stream<T> filter(Predicate<? super T> predicate)
        Stream<String> stream = Stream.of("monkey", "gorilla", "bonobo");
        List<String> collect = stream.filter(s -> s.length() < 7)
                .collect(Collectors.toList());
        System.out.println(collect);

//        Stream<T> distinct()
        Stream<String> strings = Stream.of("duck", "duck", "duck", "goose");
        strings.distinct().forEach(System.out::println);

//        Stream<T> limit(int maxSize)
//        Stream<T> skip(int n)
        //iterate
        //generate
        Stream<Integer> integers = Stream.iterate(1, n -> n + 1);
        List<Integer> collect1 = integers
                .skip(5)
                .limit(2).collect(Collectors.toList());
        System.out.println(collect1);

        Stream<Integer> generate = Stream.generate(new Random()::nextInt);
        List<Integer> collect2 = generate.limit(20).collect(Collectors.toList());
        System.out.println(collect2);

//        <R> Stream<R> map(Function<? super T, ? extends R> mapper)
        Stream<String> stream2 = Stream.of("monkey", "gorilla", "bonobo");
        stream2.map(String::toUpperCase).forEach(System.out::println);

//        <R> Stream<R> flatMap(Function<? super T, ? extends Stream<? extends R>> mapper)
        List<String> first = Collections.singletonList("Bonobo");
        List<String> second = Collections.singletonList("Mama Gorilla");
        List<String> third = Collections.singletonList("Baby Gorilla");
        Stream<List<String>> listStream = Stream.of(first, second, third);
        List<String> collect3 = listStream.flatMap(Collection::stream)
                .collect(Collectors.toList());
        System.out.println(collect3);

//        Stream<T> sorted()
//        Stream<T> sorted(Comparator<? super T> comparator)
        Stream<String> s = Stream.of("brown-", "bear-");
        s.sorted().forEach(System.out::println); // bear-brown-

        Stream<String> s2 = Stream.of("brown bear-", "grizzly-");
        s2.sorted(Comparator.reverseOrder())
                .forEach(System.out::println); // grizzly-brown bear
    }
}
