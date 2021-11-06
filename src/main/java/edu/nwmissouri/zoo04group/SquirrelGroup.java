/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.util.ArrayList;

/**
 * Squirrel Group class
 * @author Nithin Reddy Kumbham
 */
public class SquirrelGroup {
    private static ArrayList<Squirrel> myGroup;

    /**
     * Create a static group of Squirrel
     * @return the number of animals in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();

        Squirrel a = new Squirrel("Pinto");
        myGroup.add(a);
        myGroup.add(new Squirrel("Raphel"));

        return myGroup.size();
    }

    /**
      * Enumerated animals choice of animal
      */
    public enum Animals {
       Cow,
       HarpSeal,
       Walrus,
       Squirrel,
       Duck
    }
    
    /**
     * Run (simulate) the group doing things
     */ 
    public static void run() {
        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH");
        System.out.println("Look at the Squirrel!");
        myGroup.forEach(Squirrel -> {
            Squirrel.age();
            Squirrel.height();
            Squirrel.weight();
            Squirrel.isDisabled();
            Squirrel.speak();
            Squirrel.move();
            Squirrel.sleep();
            Squirrel.gender();
            Squirrel.functionMultiply();
        });
        System.out.println("Squirrel - that was awesome!");
        System.out.println("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH \n"); 

         Animals ani = Animals.Squirrel; 
        switch(ani) {
            case Cow: 

                System.out.println("***********Thank you for your choice of Cow*********");

                System.out.println("____________________________________________________");
                break;
            case HarpSeal: 
                System.out.println("____________________________________________________");
                System.out.println("|*******Thank you for your choice of HarpSeal*******|");
                System.out.println("____________________________________________________");
                break;
            case Walrus: 
                System.out.println("*******Thank you for your choice of Walrus*******");
                break;
            case Duck: 
                System.out.println("*******Thank you for your choice of Duck*******");
                break; 
             case Squirrel: 
                System.out.println("*******Thank you for your choice of Squirrel*******");
                break; 
        }
    }
    
}
