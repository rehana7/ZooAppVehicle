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
        
        try {
            int[] myNumbers = {1,0, 2, 3,7};
            int num = Integer.parseInt ("Rehaman") ;
            
            System.out.println(myNumbers[10]);
            int c = myNumbers[2]/myNumbers[1];
            System.out.println(num);
        }
      catch (ArithmeticException e) {
         System.out.println("ArithmeticException is handled");
         
      }
       catch(ArrayIndexOutOfBoundsException e) {
         System.out.println("Please enter an index number between 0 and 4");
    } 
        
        catch(NumberFormatException e) {
            System.out.println("Number format exception is handled");
        }
        
        finally {
            
           System.out.println("All Exceptions handled");
        }
        
     }
}
