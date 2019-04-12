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

    }
}
