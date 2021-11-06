/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

/**
 * Electric Car Class (derived subclass of the superclass Vehicle)
 * @author Rehana Naguru
 */
public class ElectricCar extends Vehicle {

     /*
    ElectricCar Constructor 
    @param name -the name of this ElectricCar
    */
     public ElectricCar(String name){
       super(name);
    }
    
    @Override
    public void location(){
        System.out.println("The path to travel is connected to GPS.");
    } 
    @Override
    public void type(){
        System.out.println("This is of land vehicle used to see Terrestrial Animals.");
    } 
 
    public void model(){
        System.out.println("Model of your chosen car is :Toyoto.");
    }
    // make method
    public void make(){
        System.out.println("Make of car is Camry.");
    }  
    // color method
    public void color(){
        System.out.println("The color of car you chosen is Red.");
    } 
    // price method to calculate the rent price.
    public void price() {
        double distance = 8.0;
        double gasprice = 4;
        double price = getVehiclePrice(distance, gasprice);
        System.out.printf("Price to rent for ! %4.2f miles distance %4.2f$ gasprice is %4.2f $ \n", distance, gasprice,price );
    }
     public double getVehiclePrice(double a, double b) { 
        
         return a*b;
    }
    
    
     public static void main(String[] args) {
        var car = new ElectricCar("Rehana");
        car.model();
        car.make();
        car.color();
        car.location();
        car.type();
        car.price();
        
        }
        
} 

