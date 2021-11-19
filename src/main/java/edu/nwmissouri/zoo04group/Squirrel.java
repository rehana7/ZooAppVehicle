/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

enum DaysofWeek{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THRUSDAY,
    FRIDAY,
    SATURDAY
}

/**
 * Squirrel class (derived from subclass of superclass Animal)
 * @author Nithin Reddy Kumbham
 */
public class Squirrel extends Animal{
    /**
     * Squirrel constructor
     * @param name1 -the name of this Squirrel 
     */
    public Squirrel(String name1){
        super(name1);
    }
    
    /**
     * Method which defines type of animal with name
     * @param name - String name of Squirrel
     */
    public void typeofAnimal(String name){
        System.out.println("Hey I am herbivores and my name is "+name+", I eat only plants ");
    }
    
    /**
     * Method which defines age of animal
     */
    public void age(){
        System.out.println("My age is 6 years");
    }
    
    /**
     * Method which defines height of animal
     */
    public void height(){
        System.out.println("My height is 14.3 cm");
    }
    
    /**
     * Method which defines weight of animal
     */
    public void weight(){
        System.out.println("My weight is 16 lbs");
    }
    
    /**
     * A method which returns height and weight of an animal combined in double
     * @param height of animal
     * @param weight of animal
     * @return height and weight of animal
     */
    
    public double heightweight(double height, double weight){
        return height + weight;
    }
    
    /**
     * Method which defines animal is disabled or not
     */
    public void isDisabled(){
        System.out.println("Are u kidding !, I am perfectly alright");
    }
    
    @Override
    public void speak(){
        System.out.println("I make a keech keech Sound");
    }
    
    @Override
    public void move(){
        System.out.println("I move with four legs");
    }
    
    /**
     * Method which defines how much time animal sleeps
     */
    public void sleep(){
        System.out.println("I njoy my sleep, I sleep for 10 hours");
    }
    
    /**
     * Method which defines gender of animal 
     */
    public void gender(){
        AnimalGender G = AnimalGender.FEMALE;
        System.out.println("I am "+G);
    }
    
    /**
     * Method which multiplies two numbers
     */
    public void functionMultiply(){
        int a = 10;
        int b = 15;
        System.out.println("Result of a*b is : "+a*b);
    }
    
    public static void main(String args[]){
        Squirrel pinto = new Squirrel("pinto");
        double height = 5.4;
        double weight = 15.9;
        double result = pinto.heightweight(height,weight);
        pinto.typeofAnimal("pinto");
        pinto.age();
        pinto.move();
        pinto.speak();
        pinto.isDisabled();
        pinto.functionMultiply();
        pinto.gender();
        System.out.println("Height and weight of me combined is : "+result);
        
        //enum
        DaysofWeek monday = DaysofWeek.MONDAY;
        DaysofWeek sunday = DaysofWeek.SUNDAY;
        if(DaysofWeek.MONDAY == monday){
            System.out.println("Today is Monday, Gotta rush to work");
        }
        if(DaysofWeek.SUNDAY == sunday){
            System.out.println("Today is Sunday, The weekend is gonna complete");
        }
        
        
        //Exception handling
        try {
            File file1 = new File("Squirrel.txt");
            try (Scanner scan2 = new Scanner(file1)) {
                while (scan2.hasNext()) {
                    String new1 = scan2.nextLine();
                    //scan2.next();
                    int new2 = scan2.nextInt();
                    double new3 = scan2.nextDouble();
                    double new4 = new2 * new3;
                    System.out.println("==============================================");
                    System.out.println("" + new1 + " worked " + new2 + " hours at " + new3 + " per hour and earned a total of $ " + new4);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Squirrel.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
        
        System.out.println("===============================================");
        
        try {
            File file1 = new File("Squirrel1.txt");
            try (Scanner scan2 = new Scanner(file1)) {
                while (scan2.hasNext()) {
                    String new1 = scan2.nextLine();
                    //scan2.next();
                    int new2 = scan2.nextInt();
                    double new3 = scan2.nextDouble();
                    double new4 = new2 * new3;
                    System.out.println("==============================================");
                    System.out.println("" + new1 + " worked " + new2 + " hours at " + new3 + " per hour and earned a total of $ " + new4);
                }
            }
        } catch (IOException ex) {
            System.out.println("ERROR toString():       " + ex.toString());
            System.out.println("ERROR class:            " + ex.getClass());
            System.out.println("ERROR localized message:" + ex.getClass());
            System.out.println("ERROR message:          " + ex.getMessage());
            System.out.println("ERROR stacktrace:     \n" + Arrays.toString(ex.getStackTrace()));
        }
    }
    
    
}
    
