package com.test.java_8;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "1");
        map.put(2, "2");
        map.put(3, "3");

        List<String> collect = map.entrySet().stream()
                .filter(el -> el.getKey() > 1)
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
