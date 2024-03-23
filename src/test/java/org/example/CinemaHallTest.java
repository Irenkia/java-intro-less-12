package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class CinemaHallTest {
    public static List<CinemaHall> createRooms() {
        List<CinemaHall> roomList = new ArrayList<>();
        roomList.add(new CinemaHall("One", "2D"));
        roomList.add(new CinemaHall("Two", "3D"));
        roomList.add(new CinemaHall("Three", "4D"));
        roomList.add(new CinemaHall("Four", "2D"));
        roomList.add(new CinemaHall("Five", "3D"));
        roomList.add(new CinemaHall("Six", "4D"));
        roomList.add(new CinemaHall("Seven", "2D"));
        roomList.add(new CinemaHall("Eight", "3D"));
        roomList.add(new CinemaHall("Nine", "4D"));
        roomList.add(new CinemaHall("Ten", "4D"));
        return roomList;
    }
    public static void print(Map<String, Long> map) {
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    @Test
    void mustGetNumberOfRoomsOfEachType() {
        List<CinemaHall> rooms = createRooms();
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
