package Builder;

// this interface helps in creating rooms in more general way
// it has common properties that a room has be it Bedroom, kitchen, dining etc

public interface Builder {
    Builder setDimensions(String dimensions);

    Builder setCeilingHeight(int ceilingHeight);

    Builder setFloorNumber(int floorNumber);

    Builder setWallColor(String wallColor);

    Builder setNumberOfWindows(int numberOfWindows);

    Builder setNumberOfDoors(int numberOfDoors);
}
