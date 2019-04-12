// BUILDER - Bedroom class
package Builder;

public class Bedroom {
    private String dimensions;
    private int ceilingHeight;
    private int floorNumber;
    private String wallColor;
    private int numberOfWindows;
    private int numberOfDoors;
    private boolean isDouble;
    private boolean hasEnsuite;


    /* If not following the builder pattern this is the case for passing the members */
    public Bedroom(String dimensions, int ceilingHeight, int floorNumber, String wallColor, int numberOfWindows, int numberOfDoors, boolean isDouble, boolean hasEnsuite){
        this.dimensions = dimensions;
        this.ceilingHeight = ceilingHeight;
        this.floorNumber = floorNumber;
        this.wallColor = wallColor;
        this.numberOfWindows = numberOfWindows;
        this.numberOfDoors = numberOfDoors;
        this.hasEnsuite = hasEnsuite;
    }

}

