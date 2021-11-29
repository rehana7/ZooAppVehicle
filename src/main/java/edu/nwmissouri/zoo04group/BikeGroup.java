/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Bike
 * @author Maneesh sake
 */
public class BikeGroup {
    private static ArrayList<Bike> myGroup;

    /**
     * Create a static group of Bike
     * @return the number of vehicles in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        Bike b = new Bike("silver");
        myGroup.add(b);
      //  myGroup.add(new Bike("red"));
      //  myGroup.add(new Bike("black"));

        return myGroup.size();
    }

    private static String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /** Illustrates enumerated types (simple Java enum)
     * Good for attributes selected from a drop-down list
     * Run (simulate) the group doing things 
     * 
     */ 
    public enum Color {
       Red,
       Blue,
       Black;
    }
    public static void run() {
        System.out.println("-------------------------------------");
        System.out.println("Look at the Bike! it looks good");
        myGroup.forEach(Bike -> {
       Bike.model();
       Bike.cost();
       Bike.color();
       Bike.location();
       Bike.type();
        });
        System.out.println("Happy drive in Bike - Thanks for picking bike!");
        System.out.println("----------------------------------------- \n"); 
        
         Color col = Color.Black; 
        switch(col) {
            case Red: 
                System.out.println("--------Your Bike color is Red----------");
                System.out.println("____________________________________________________");
                break;
            case Black: 
                System.out.println("____________________________________________________");
                System.out.println("Your Bike color is Black");
                System.out.println("____________________________________________________");
                break;
            case Blue: 
                System.out.println("***********Your vehicle color is Blue****************");
                break;
              
        }
    }

    
}
