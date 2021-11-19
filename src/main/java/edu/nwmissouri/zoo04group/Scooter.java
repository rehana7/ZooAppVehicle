package edu.nwmissouri.zoo04group;

/**
 * Scooter Class
 *
 * @author NIKHIL KUMAR AKARAPU
 */
public class Scooter extends Vehicle {

    public Scooter(String name) {
        super(name);
    }

    /**
     * color describes the color of Scooter
     */
    public void color() {
        System.out.println("Color of Scooter is Matgrey.");
    }

    /**
     * mileage describes the mileage of Scooter
     */
    public void mileage() {
        System.out.println(" mileage of Scooter is 100kmpl.");
    }

    /**
     * specifications describes the specifications of Scooter
     */
    public void specifications() {
       // System.out.println(" specifications of Scooter are:");
        System.out.println(" specifications of Scooter are: Displacement: 150cc Engine type: single cylinder MaxPower:2000rpm");
    }

    /**
     * price describes the amount charged to rent a Scooter
     */
    public void price() {
        double distance = 5.0;
        double gasprice = 8;
        double price = getVehiclePrice(distance, gasprice);
        System.out.printf(" Price to rent for ! %4.2f miles distance %4.2f$ gasprice is %4.2f $ \n", distance, gasprice, price);
    }

    public double getVehiclePrice(double a, double b) {

        try{
            double c;
            c=a/b;
            return c;
       }
       catch(ArithmeticException e){
           System.out.println("Please enter valid input");
       }
        
        return 0;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        var scooter = new Scooter("nikhil");
        
        int yearsOfManufactures[] = { 2000, 0, 2010,2020, 2021 };
        try {
                System.out.print(yearsOfManufactures[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nPlease enter the valid input");
        }
        finally{
         System.out.println("Thank you for visiting..");
      }

        scooter.color();
        scooter.mileage();
        scooter.specifications();
        scooter.price();

    }

}
