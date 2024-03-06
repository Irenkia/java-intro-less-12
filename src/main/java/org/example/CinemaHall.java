package org.example;

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
