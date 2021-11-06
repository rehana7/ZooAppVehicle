package edu.nwmissouri.zoo04group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Scooter
 *
 * @author NIKHIL KUMAR AKARAPU
 */
public class ScooterGroup {

    private static ArrayList<ScooterGroup> myGroup;

    /**
     * Create a static group of Scooter
     *
     * @return the number of vehicles in the group
     */
    public static int create(ScooterGroup Chethak) {
        myGroup = new ArrayList<>();
        Scooter obj = new Scooter("blue");
        myGroup.add(Chethak);
        return myGroup.size();
    }

    private void price() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void color() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void make() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
            Scooter.make();
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
