/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.util.ArrayList;

/**
 * Provides methods to create and run a group of Wheelchairs
 * @author REHAMAN NAGURU ABDUR
 */
public class WheelChairGroup {
    
    private static ArrayList<WheelChair> myGroup;

    /**
     * Create a static group of WheelChair
     * @return the number of WheelChairs in the group
     */
    public static int create() {
        myGroup = new ArrayList<>();
        
        WheelChair a = new WheelChair("CHAIRS");
        myGroup.add(a);

        return myGroup.size();
    }

    /**
     * Enumarated types for donation for wheel chairs
     */ 
    public enum Donate {
       ManualWheelChairs,
       RemoteWheelChairs,
       WalkingSticks,
       Money;
    }
    public static void run() {
        System.out.println("####################################");
        System.out.println("Here are some wheelchairs");
        myGroup.forEach(WheelChair -> {
            WheelChair.location();
            WheelChair.type();
            WheelChair.wheelchairId();
            WheelChair.time();
            WheelChair.price();
        });
        System.out.println("Nice WheelChair it helped me a lot to explore in the zoo");
        System.out.println("####################################");
       
        Donate don = Donate.ManualWheelChairs;
        switch(don) {
            case ManualWheelChairs:
                System.out.println("! Hurray, you donated  a Manual wheel chair");
 
                break;
            case RemoteWheelChairs: 
                System.out.println("Thanks for donating Remote wheel chair");
                break;
            case WalkingSticks:
                System.out.println("Thank you for donating walking sticks");
                break;
            case Money:
                System.out.println("Thank you for donating money");
                break;    
        }
            }
}

