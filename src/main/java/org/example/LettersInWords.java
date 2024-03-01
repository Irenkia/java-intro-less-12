package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class LettersInWords {
    public static List<Character> getLettersFromList(List<String> words) {
        String letters = words
                .stream()
                .filter((element) -> element.equalsIgnoreCase(element))
                .reduce("", (partialString, element) -> partialString + element)
                .toUpperCase();
        List<Character> characters = getLettersFromString(letters);
        return characters;
    }

    private static List<Character> getLettersFromString(String letters) {
        List<Character> characters = letters
                .chars()
                .mapToObj(c -> (char) c)
                .distinct()
                .collect(Collectors.toList());
        characters.forEach(System.out::println);
        return characters;
    }
}
