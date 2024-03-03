package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class DoctorsTest {

    @Test
    void mustGetUniqueListOfSpecializationsWithoutPrefix() {
        //given
        List<String> specializations = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra", "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");
        Stream<String> excepted = Stream.of("Chirurg", "Radiolog", "Chirurg Szczękowy", "Pediatra", "Internista", "Laryngolog");

        //when
        System.out.println("excepted : ");
        excepted.forEach(System.out::println);
        System.out.println();

        //then
        System.out.println("result : ");
        Stream<String> result = Doctors.getUniqueListOfSpecializationsWithoutPrefix(specializations);
    }

    @Test
    void mustGetUniqueListOfSpecializationsOtherSolution() {
        //given
        List<String> specializations = Arrays.asList("Szpital:Chirurg:Radiolog:Chirurg Szczękowy:Pediatra", "Przychodnia:Pediatra", "Przychodnia:Internista:Laryngolog:Pediatra");
        List<String> excepted = Arrays.asList("Chirurg", "Radiolog", "Chirurg Szczękowy", "Pediatra", "Internista", "Laryngolog");

        //when
        System.out.println("excepted : ");
        excepted.forEach(System.out::println);
        System.out.println();

        //then
        System.out.println("result : ");
        List<String> result = Doctors.getUniqueListOfSpecializationsOtherSolution(specializations);
        Assertions.assertEquals(excepted, result);
    }
}
