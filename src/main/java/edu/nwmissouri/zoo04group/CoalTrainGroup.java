/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.util.ArrayList;

/**
 * CoalTrain Group class 
 * @author Nithin Reddy Kumbham
 */
public class CoalTrainGroup {
    private static ArrayList<CoalTrain> myGroup;

    /**
     * Create a static group of CoalTrain
     * @return the number of vehicles in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        CoalTrain a = new CoalTrain("El-to-Rado");
        myGroup.add(a);

        return myGroup.size();
    }

     /**
      * Enumerated color choice of train
      */
    public enum Color {
       Red,
       Grey,
       Blue,
       Black;
    }
    
    /**
     * Run (simulate) the group doing things
     */
    public static void run() {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("Look at the CoalTrain!");
        myGroup.forEach(CoalTrain -> {
            CoalTrain.location();
            CoalTrain.runType();
            CoalTrain.getvehicleColour();
            CoalTrain.purpose();
            CoalTrain.speed();
        });
        System.out.println("Coal Train - that was a hell of a ride!");
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
