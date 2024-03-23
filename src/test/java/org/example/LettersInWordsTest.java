package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class LettersInWordsTest {

    @Test
    void mustGetLettersFromList() {
        //given
        List<String> words = Arrays.asList("Lorem", "ipsum", "dolor", "sit", "amet", "elit");
        List<Character> excepted =Arrays.asList('L', 'O', 'R', 'E', 'M', 'I', 'P', 'S', 'U', 'D', 'T', 'A');

        //when
        List<Character> result = LettersInWords.getLettersFromList(words);

        //then
        Assertions.assertEquals(excepted, result);

    }
}