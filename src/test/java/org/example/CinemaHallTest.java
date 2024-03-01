package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class CinemaHallTest {
    public static void print(Map<String, Long> map) {
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    @Test
    void mustGetNumberOfRoomsOfEachType() {
        List<CinemaHall> rooms = CinemaHall.createRooms();
        Map<String, Long> excepted = Map.of("2D", 3L, "3D", 3L, "4D", 4L);
        System.out.println("excepted :");
        print(excepted);

        //when
        Map<String, Long> result = CinemaHall.getNumberOfRoomsOfEachType(rooms);

        //then
        Assertions.assertEquals(excepted, result);
        System.out.println();
        System.out.println("result :");
        print(result);
    }

}
