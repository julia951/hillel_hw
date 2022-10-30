package com.test.java_8;

@FunctionalInterface
public interface DefaultInterfaceMethods {
    default void print(String s) {
        System.out.println(s);
    }

    void abstractMethod();
}
