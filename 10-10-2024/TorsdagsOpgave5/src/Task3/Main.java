package Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Room room1 = new Room(3, 2);
        Room room2 = new Room(1, 1);
        Room room3 = new Room(2, 4);
        Room room4 = new Room(3, 4);
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);
        rooms.add(room4);

        Building house1 = new Building(rooms, 4);
        Building house2 = new Building(rooms, 2);

        //Task3.k -- Testing methods
        System.out.println(countWindowsInBuilding(house1));
        System.out.println(countRoomsInBuilding(house1));
        System.out.println(isNormal(house1));
        System.out.println(isNormal(house2));
    }

    public static int countLampsInBuilding(Building building){
        int sum = 0;
        ArrayList<Room> rooms = building.getRooms();
        for (int i = 0; i < rooms.size(); i++) {
            Room thisRoom = rooms.get(i);
            sum = sum + thisRoom.getNumberOfLamps();
        }
        return sum;
    }

    public static int countWindowsInBuilding(Building building){
        int sum = 0;
        ArrayList<Room> rooms = building.getRooms();
        for (int i = 0; i < rooms.size(); i++) {
            Room thisRoom = rooms.get(i);
            sum = sum + thisRoom.getNumberOfWindows();
        }
        return sum;
    }

    public static int countRoomsInBuilding(Building building){
        int rooms = building.getRooms().size();
        return rooms;
    }

    public static boolean isNormal(Building building){
        int floors = building.getNumberOfFloors();
        int rooms = countRoomsInBuilding(building);
        if(floors >= rooms){
            return true;
        }
        else {
            return false;
        }
    }


}
