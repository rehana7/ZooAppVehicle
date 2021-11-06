/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

/**
 * Wheelchair class,derived subclass from the superclass Vehicle)
 * @author Rehaman Naguru Abdur
 */
public class WheelChair extends Vehicle{
    public WheelChair(String name){
       super(name);
    }
    
    @Override
    public void location(){
        System.out.println("wheel chairs are available at every zoo entrance gate.");
    } 
    @Override
    public void type(){
        System.out.println("zoo provides both manual and remote control wheelchairs");
    } 
 
    public void wheelchairId(){
        System.out.println("scan barcode on the wheel chair to get ID");
    }
  
    public void time(){
        System.out.println("Wheelchair rental is only on hourly basis");
    } 
    public void price(){
        System.out.println("5$ per hour for manual wheel chair and 8$ per hour for remote control");
    }
    
    
     public static void main(String[] args) {
        var wheel = new WheelChair("Rehaman");
        wheel.type();
        wheel.location();
        wheel.wheelchairId();
        wheel.time();
        wheel.price();
        }
        
}
