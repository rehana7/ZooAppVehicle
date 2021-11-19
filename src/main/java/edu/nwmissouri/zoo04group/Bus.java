package edu.nwmissouri.zoo04group;

import java.lang.*;

/**
 * Bus class the extends Vehicle Class
 *
 * @author Preethi
 */
public class Bus extends Vehicle {

    public Bus(String name) {
        super(name);
    }
    private static final double ticketBase_price = 5.00;

    /**
     * color describes the color of vehicle
     */
    public void color() {
        System.out.println("Color of bus is Green .");
    }

    /**
     * describes the type mini van or bus
     */
    @Override
    public void type() {
        System.out.println("Type of Bus is double decker.");
    }

    /**
     * takes in the number of seats by user
     *
     * @return
     */
    public int numberOfSeats() {

//        System.out.println("No of seats input by user");
//        Scanner userInput = new Scanner(System.in);
//        System.out.println("How many Seats on the bus :");
//        int noOfSeats = userInput.nextInt();
        int noOfSeats = 10;

        return noOfSeats;
    }

    /**
     * takes in the no of tickets by user
     *
     * @return
     */
    public int numberOfTickets() {

//    System.out.println("no of tickets input by user ");
//    Scanner userInput1 = new Scanner(System.in);
//    System.out.println("How many tickets for the bus :");
//    int noOfTickets = userInput1.nextInt();
        int noOfTickets = 8;
        return noOfTickets;
    }

    /**
     * calculates the cost of ticket and bus fair
     *
     * @return
     */
    public double cost() {
        System.out.println("Prints the cost bases on seat and tickets");
        double cost = 0.0;
        cost = Math.round(ticketBase_price * this.numberOfTickets() * this.numberOfSeats() * 100.0) / 100.0;
        System.out.println("Total cost for " + this.numberOfSeats() + "seats is :" + cost);
        return cost;
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        var bus = new Bus("Zoo Bus");

        bus.color();
        bus.type();
        bus.cost();

        try {
            int arr[] = new int[4];
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            System.out.println("Access element 5 :" + arr[5]);
            

        } // matching ArrayIndexOutOfBoundsException
        catch (ArrayIndexOutOfBoundsException e) {
            // when trying to acces an element not available in array
            System.out.println("Exception thrown is  :" + e);
        } 
        try{
            int val1 = 20 ;
            int val2 = 0; 
            int result = val1/val2;
            System.out.println("division result is :" + result);

        }// matching ArithmeticException
        catch (ArithmeticException ex) {
            // getMessage will print description of exception(here / by zero)
            System.out.println("Exception thrown is  :" + ex);
        }

    }
}
