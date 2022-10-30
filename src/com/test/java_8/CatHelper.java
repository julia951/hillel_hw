package com.test.java_8;

import java.util.Comparator;

public class CatHelper {
    public static int compareByWeight(Cat cat1, Cat cat2) {
        return cat1.getWeight() - cat2.getWeight();
    }

    public static void main(String[] args) {
        Comparator<Cat> byWeight = (cat1, cat2) -> CatHelper.compareByWeight(cat1, cat2);

        Comparator<Cat> byWeightReference = CatHelper::compareByWeight;
    }
}
