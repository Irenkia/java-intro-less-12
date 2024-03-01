package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CinemaHall {
    private String roomName;
    private String typeOfNumber;

    public CinemaHall(String roomName, String typeOfNumber) {
        this.roomName = roomName;
        this.typeOfNumber = typeOfNumber;
    }

    public String getTypeOfNumber() {
        return typeOfNumber;
    }

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

    public static Map<String, Long> getNumberOfRoomsOfEachType(List<CinemaHall> rooms) {
        Map<String, Long> countByType = rooms
                .stream()
                .collect(Collectors.groupingBy(
                        CinemaHall::getTypeOfNumber,
                        Collectors.counting()));
        return countByType;
    }

    @Override
    public String toString() {
        return roomName + " : " + typeOfNumber;
    }
}
