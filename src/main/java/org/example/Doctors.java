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
                .filter(spec -> !spec.equals("Szpital"))
                .filter(spec -> !spec.equals("Przychodnia"))
                .collect(Collectors.toList())
                .forEach((value) -> System.out.println(value));
        return uniqueList;
    }

    public static List<String> getUniqueListOfSpecializationsOtherSolution(List<String> specializations){
        List<String> uniqueList = specializations.stream()
                .map(spec -> spec.split(":"))
                .flatMap(array -> Arrays.stream(array))
                .distinct()
                .filter(spec -> !spec.equals("Szpital"))
                .filter(spec -> !spec.equals("Przychodnia"))
                .collect(Collectors.toList());
        uniqueList.forEach(System.out::println);
        return uniqueList;
    }

}
