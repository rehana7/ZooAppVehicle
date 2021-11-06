/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of ElectricCars
 * @author Rehana Naguru
 */
public class ElectricCarGroup {
    private static ArrayList<ElectricCar> myGroup;

    /**
     * Create a static group of ElectricCar
     * @return the number of vehicles in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        ElectricCar a = new ElectricCar("blue");
        myGroup.add(a);
      //  myGroup.add(new ElectricCar("red"));
      //  myGroup.add(new ElectricCar("grey"));

        return myGroup.size();
    }

    /** Illustrates enumerated types (simple Java enum)
     * Good for attributes selected from a drop-down list
     * Run (simulate) the group doing things 
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
        System.out.println("Look at the Electric Car!");
        myGroup.forEach(ElectricCar -> {
            ElectricCar.location();
            ElectricCar.type();
            ElectricCar.model();
            ElectricCar.make();
            ElectricCar.color();
            ElectricCar.price();
        });
        System.out.println("Nice Electric Car - that was a nice ride!");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> \n"); 
        
         Color col = Color.Grey; 
        switch(col) {
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


