package edu.nwmissouri.zoo04group;

/**
 * Electric Bike Class
 * @author Maneesh
 */
    public class Bike extends Vehicle {

   /*private Bike(String Maneesh) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
     public Bike(String name){
       super(name);
    }
    
 //   @Override
    public void model(){
        System.out.println("Model of the bike:Bnw.");
    }
  //  @Override
    public void cost(){
        System.out.println("Cost of the bike is 12 lakhs.");
    } 
    public void color(){
        System.out.println("silver.");
    }

    
    public void location(){
        System.out.println(" travel is connected to GPS.");
    } 
    
    
    public void type(){
        System.out.println("This is of land vehicle used to see Terrestrial Animals.");
    } 
    
    public void Price() {
        double distancetravel = 6.0;
        int fuelprice = 3;
        double price = getVehicelPrice(distancetravel, fuelprice);
        System.out.printf("The Price to rent Bike is \n", price );
    }
     public double getVehicelPrice(double a, int b) { 
        
         return a*b;
    }
    
    
     public static void main(String[] args) {
       var bike = new Bike("Maneesh");
       bike.model();
       bike.cost();
       bike.color();
       bike.location();
       bike.type();
        
        }
        
} 


