package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumbersDivisibleByThree {

    public static List<Integer> getNumbersDivisibleByThree(IntStream ints) {
        List<Integer> intsList = ints
                .filter(number -> number % 3 == 0)
                .mapToObj(Integer::valueOf)
                .collect(Collectors.toList());
        intsList.forEach(System.out::println);
        return intsList;
    }

}
