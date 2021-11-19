/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * HarpSeal class (derived subclass of the superclass Animal)
 * @author Rehana Naguru
 */
public class HarpSeal extends Animal{
    /*
    HarpSeal Constructor 
    @param name -the name of this HarpSeal
    */
    public HarpSeal(String name){
        super(name);
    }
    
    @Override
    public void speak(){
        System.out.println("I am HarpSeal and I communicate vocally by making noise with my throat and air.");
    }
    @Override
    public void move(){
        System.out.println("I swim in sea iceand I move on ice by pulling my front flippers, which have strong claws.");
    } 
    public void funfacts(){
        System.out.println("I am HarpSeal, I am more migratory and I can travel more than 3100 miles.");
    }
    // location method
    public void location(){
        System.out.println("I am native to northern part of Arctic Ocean and Atlantic Ocean.");
    } 
    
    public void food(){
        System.out.println("I eat many types of fish and invertibrates.");
    }  
    // calculate method to calculate the addition of two numbers
    public void calculate() {
        double p = 5.0;
        int q = 4;
        double r = getHarpSealAdd(p, q);
        System.out.printf("I know Addition ! %4.2f addition %d is %4.2f \n", p, q, r);
    }
     public double getHarpSealAdd(double a, int b) { 
        
         return a+b;
    } 
     
     
    
    
     public static void main(String[] args) {
        var a = new HarpSeal("Rehana");
        a.speak();
        a.move();
        a.funfacts();
        a.location();
        a.food();
        a.calculate(); 
        int foodconsumed_pounds =  70;
        int totalnoofdays = 0; 
        
     try{  
      String p = "This is HarpSeal"; 
      char q = p.charAt(20);
      System.out.println(q);     
      //code that may raise exception  
      int foodconsumedonaday=foodconsumed_pounds/totalnoofdays; 
      //declaring String of length 16 ;
     // catching Arithmetic Exception
      } 
     // Here, when I tried to divide a number by zero ,which throws an error. So I am handling this by catching the Arithmetic Exception. In this I am printing the output stating the name of exception.
     catch(ArithmeticException e)
      {
          System.out.println(e);
      }  
      // Catching StringIndexOutOfBoundsException :   In this I defined a string of length 16 characters. But I tried to call a character at 20 position , which throws an error. So I am catching this String Index Out Of Bounds Exception. 
      catch(StringIndexOutOfBoundsException e)
         { 
             System.out.println(e);
         }
     // Finally block will execute , even the exception is not caught.    
    finally {
            
           System.out.println("code executed successfully...");  
        }
  
        
     }
   
   
   
}     
        
        



