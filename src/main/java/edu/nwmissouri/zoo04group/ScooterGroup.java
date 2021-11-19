package edu.nwmissouri.zoo04group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Scooter
 *
 * @author NIKHIL KUMAR AKARAPU
 */
public class ScooterGroup {

    private static ArrayList<Scooter> myGroup;

    /**
     * Create a static group of Scooter
     *
     * @return the number of vehicles in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Scooter e = new Scooter("blu");
        myGroup.add(e);
      // myGroup.add(new ElectricCar("red"));
      //  myGroup.add(new ElectricCar("grey"));

        return myGroup.size();
    }

    

    

    

   
    /**
     * Illustrates enumerated types (simple Java enum) Good for attributes
     * selected from a drop-down list Run (simulate) the group doing things
     *
     */
    public enum Color {
        Red,
        Grey,
        Blue,
        Black;
    }

    public static void run() {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Look at the Scooter!");
         myGroup.forEach(Scooter -> {
             Scooter.location();
            Scooter.type();
            Scooter.mileage();
            Scooter.color();
            Scooter.price();
          
        });
        System.out.println("Nice Scooter - that was a nice ride!");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n");

        Color col = Color.Grey;
        switch (col) {
            case Red:
                System.out.println("***********Your vehicle color is Red***************");
                System.out.println("____________________________________________________");
                break;
            case Grey:
                System.out.println("____________________________________________________");
                System.out.println("***********Your vehicle color is Grey***************");
                System.out.println("____________________________________________________");
                break;
            case Blue:
                System.out.println("***********Your vehicle color is Blue****************");
                break;
            case Black:
                System.out.println("***********Your vehicle color is Black***************");
                break;
        }
    }

}
