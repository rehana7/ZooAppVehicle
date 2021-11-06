/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;
import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Zoo Buses
 * @author Preethi Jadhav
 */
public class BusGroup {
    private static ArrayList<Bus> myBusGroup;
        /**
     * Create a static group of Buses
     *
     * @return the number of buses in the group
     */
    public static int create() {
        myBusGroup = new ArrayList<>();
        
        Bus b = new Bus("Bus1");
        myBusGroup.add(b);
        //BusGroup.add(new Panda("Bus2"));


        return myBusGroup.size();
    }
        /**
     * e num type of bus 
     */
    public enum type{
        miniVan,
        miniBus,
        doubleDecker,
    }
        /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("BUS BUS BUS BUS");
        System.out.println("Hey - look at the Zoo Buses !");
        myBusGroup .forEach(bus -> {
        bus.color();
        bus.type();
        bus.cost();
        });
        System.out.println("Nice Pandas - that was fun!");
        System.out.println("This Bus1 is of type  : "+BusGroup.type.miniVan);
        System.out.println("This Bus1 is of type  : "+BusGroup.type.miniBus);
        System.out.println("This Bus1 is of type  : "+BusGroup.type.doubleDecker);

        System.out.println("BUS BUS BUS BUS");
    }
}
