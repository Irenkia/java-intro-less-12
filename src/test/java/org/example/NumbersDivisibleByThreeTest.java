package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

class NumbersDivisibleByThreeTest {

    @Test
    void mustGetNumbersDivisibleByThree() {
        //given
        IntStream ints = IntStream.of(3, 4, 5, 6, 7, 9, 12);
        List<Integer> excepted = Arrays.asList(3, 6, 9, 12);

        //when
        List<Integer> list = NumbersDivisibleByThree.getNumbersDivisibleByThree(ints);

        //then
        Assertions.assertEquals(excepted, list);
    }
}
