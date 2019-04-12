// Example 2
package Builder;

import java.util.ArrayList;

public class RoomListBuilder {
    private ArrayList listOfRooms;

    public RoomListBuilder addList() {
        this.listOfRooms = new ArrayList();
        return this;
    }

    // second case of example 2
    public RoomListBuilder addRoom(Room room){
        listOfRooms.add(room);
        return this;
    }

    // third case of example 2
    public RoomBuilder addRoom(){
        return new RoomBuilder(this);
    }

    public ArrayList buildList() {
        return listOfRooms;
    }
}
