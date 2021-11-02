/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

/**
 * Electric Car Class
 * @author Rehana Naguru
 */
public class ElectricCar {

    private ElectricCar(String rehana) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
/*    public ElectricCar(String name){
       super(name);
    }
  */  
 //   @Override
    public void model(){
        System.out.println("Model of your choosen car is :Toyoto.");
    }
  //  @Override
    public void make(){
        System.out.println("Make of car is Camry.");
    } 
    public void color(){
        System.out.println("Red.");
    }
    
    public void location(){
        System.out.println("The path to travel is connected to GPS.");
    } 
    
    public void type(){
        System.out.println("This is of land vehicle used to see Terrestrial Animals.");
    } 
    public void Price() {
        double distance = 8.0;
        int gasprice = 4;
        double price = getVehicelPrice(distance, gasprice);
        System.out.printf("The Price to rent Electric Car is \n", price );
    }
     public double getVehicelPrice(double a, int b) { 
        
         return a*b;
    }
    
    
     public static void main(String[] args) {
        var car = new ElectricCar("Rehana");
        car.model();
        car.make();
        car.color();
        car.location();
        car.type();
        car.Price();
        
        }
        
} 

