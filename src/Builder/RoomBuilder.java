// Example 2

package Builder;

public class RoomBuilder {
    private int numberOfDoors;
    private int numberOfWindows;
    private String effects;
    private String wallColor;
    private int floorNumber;
    private RoomListBuilder roomListBuilder;

    RoomBuilder() {

    }

    public RoomBuilder(RoomListBuilder roomListBuilder) {
        this.roomListBuilder = roomListBuilder;
    }

    public RoomBuilder setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
        return this;
    }

    public RoomBuilder setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
        return this;
    }

    public RoomBuilder setEffects(String effects) {
        this.effects = effects;
        return this;
    }

    public RoomBuilder setWallColor(String wallColor) {
        this.wallColor = wallColor;
        return this;
    }

    public RoomBuilder setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
        return this;
    }

    public Room createRoom() {
        return new Room(numberOfDoors, numberOfWindows, effects, wallColor, floorNumber);
    }

    // for the case when
    public RoomListBuilder addRoomToList() {
        //
        Room room = createRoom();
        this.roomListBuilder.addRoom(room);
        return roomListBuilder;

    }

}