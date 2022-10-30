package com.test.java_8;

//import org.apache.commons.lang3.StringUtils;

public class FunctionalInterfacesWithLambdas {

    public static void print(String s, CheckNumber check) {
        if (check.test(s)) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
//        CheckNumber testFunc = s -> StringUtils.isAlpha(s);

//        print("123", s -> StringUtils.isNumeric(s));
//        print("abc", testFunc);
    }

    @FunctionalInterface
    interface CheckNumber {
        boolean test(String s);
    }
}
