// Example 2

package Builder;

public class Room {
    private int numberOfDoors;
    private int numberOfWindows;
    private String effects;
    private String wallColor;
    private int floorNumber;

    Room(int numberOfDoors, int numberOfWindows, String effects, String wallColor, int floorNumber){
        this.numberOfDoors = numberOfDoors;
        this.numberOfWindows = numberOfWindows;
        this.effects = effects;
        this.wallColor = wallColor;
        this.floorNumber = floorNumber;

    }
}
