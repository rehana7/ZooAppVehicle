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
        System.out.println(" specifications of Scooter are:");
        System.out.println(" Displacement: 150cc\n Engine type: single cylinder\n MaxPower:2000rpm");
    }

    public void price() {
        double distance = 5.0;
        double gasprice = 8;
        double price = getVehiclePrice(distance, gasprice);
        System.out.printf(" Price to rent for ! %4.2f miles distance %4.2f$ gasprice is %4.2f $ \n", distance, gasprice, price);
    }

    public double getVehiclePrice(double a, double b) {

        return a * b;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        var scooter = new Scooter("nikhil");

        scooter.color();
        scooter.mileage();
        scooter.specifications();
        scooter.price();

    }

}
