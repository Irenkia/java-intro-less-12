package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Doctors {
    public static Stream<String> getUniqueListOfSpecializationsWithoutPrefix(List<String> specializations) {
        Stream<String> uniqueList = specializations.stream();
        uniqueList.flatMap((value) -> {
                    String[] split = value.split(":");
                    return Arrays.asList(split).stream();
                })
                .distinct()
                .skip(1)
                .filter(spec -> !spec.equals("Przychodnia"))
                .collect(Collectors.toList())
                .forEach((value) -> System.out.println(value));
        return uniqueList;
    }
}
