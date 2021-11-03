/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

/**
 *
 * @author Preethi
 */
public class Bus {

    /**
     * color describes the color of vechile
     */
    public void color() {
        System.out.println(" Color of bus.");
    }

    /**
     * describes the type mini van or bus
     */
    public void type() {
        System.out.println("Type of Bus .");
    }

    /**
     * takes in the number of seats by user
     */
    public void numberOfSeats() {
        System.out.println("No of seats input by user");
    }

    /**
     * takes in the no of tickets by user
     */
    public void numberOfTickets() {

        System.out.println("no of tickets input by user ");
    }

    /**
     * calculates the cost of ticket and bus fair
     */
    public void cost() {
        System.out.println("Prints the cost bases on seat and tickets");
    }

    public static void main(String[] args) {
        var bus = new Bus();

        bus.color();
        bus.type();
        bus.cost();

    }

}
