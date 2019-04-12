// DIRECTOR - Architect class
// DIRECTOR is used for building objects using BUILDER (Bedroom class)
// PRODUCT is the complex object that is being created
package Builder;

import java.util.ArrayList;

public class Architect {
    public static void main(String[] args){
/*
         PRODUCT
         this is the case when the constructor has numerous parameters
         tedious to enter all the parameters
         is problematic if order of arguments is missed
         Bedroom br = new Bedroom("2d", 40, 3, "blue", 4, 1, true, true);

 */

        // this is the object creation after applying BUILDER pattern
        Bedroom br1 = new BedroomBuilder().setDimensions("3d")
                .setCeilingHeight(40).setFloorNumber(2)
                .setWallColor("blue").setNumberOfWindows(4)
                .setNumberOfDoors(1).setIsDouble(true)
                .setHasEnsuite(true).createBedroom();
        Bedroom br2 = new BedroomBuilder().setFloorNumber(1).setIsDouble(false).setNumberOfDoors(2).createBedroom();

        // EXAMPLE 2

        /*
         * Creating Room objects prior to applying an effective Builder pattern
         * */
//        Room r1 = new RoomBuilder().setNumberOfDoors(1).setNumberOfWindows(3).setEffects("sunlight").setWallColor("white").setFloorNumber(1).createRoom();
//        Room r2 = new RoomBuilder().setNumberOfDoors(2).setNumberOfWindows(2).setEffects("dust prone").setWallColor("yellow").setFloorNumber(2).createRoom();
//
//        ArrayList<Room> rooms = new ArrayList<>();
//        rooms.add(r1);
//        rooms.add(r2);
//        House h1 = new House(rooms);


        /* After using RoomListBuilder,
        *  a simpler way of adding rooms to the list in a single line
        * */
//        Room r1 = new RoomBuilder().setNumberOfDoors(1).setNumberOfWindows(3).setEffects("sunlight").setWallColor("white").setFloorNumber(1).createRoom();
//        Room r2 = new RoomBuilder().setNumberOfDoors(2).setNumberOfWindows(2).setEffects("dust prone").setWallColor("yellow").setFloorNumber(2).createRoom();
//
//        ArrayList<Room> rooms = new RoomListBuilder().addList()
//                .addRoom(r1)
//                .addRoom(r2)
//                .buildList();
//        House h1 = new House(rooms);

        /*
        * Can be made simpler skipping the room object creations,
        * by incorporating the room object creation in the RoomListBuilder class
        *  */

        // addList() creates the an empty ArrayList in RoomListBuilder class
        // then rooms are created, firstly by creating the empty rooms,
        // then adding their respective properties, and finally adding that room to the list
        // then RoomListBuilder is built from the list created

        ArrayList rooms = new RoomListBuilder().addList()
                .addRoom().setFloorNumber(1).setEffects("sunlight").addRoomToList()
                .addRoom().setFloorNumber(2).setEffects("dust prone").addRoomToList()
                .buildList();
        House h1 = new House(rooms);



    }
}
