/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

/**
 * Vehicle super class for traits shared by all vehicles. Abstract class 
 * general vehicle - only specific types. 
 * @author Rehana Naguru
 */
public abstract class Vehicle {
      /**
     * Vehicle color may be not known. 
     */
      protected String name = "no name";
     /**
     * Vehicle color is not known . 
     * Using enumerated
     */
    protected VehicleColor color;
    /**
     * Vehicle constructor
     *@param name - the name of this instance of a vehicle
     */
    public Vehicle(String name) {
        this.name = name;
        this.color = VehicleColor.UNKNOWN;

    }
    /**
     * location() - general method of location
     */
    public void location() {
        System.out.println("Generic vehicle location");
    }
    /**
     * type() - general method for vehicle type
     */
    public void type() {
        System.out.println("Generic vehicle type");
    }

    /**
     * Get vehicle's name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the vehicle gender.
     *
     * @see edu.nwmissouri.zoo04group.VehicleColor
     * @return the color
     */
    public VehicleColor getColor() {
        return color;
    }
    /**
     * Set the Vehicle color using an enumerated
     *
     * @param color the color to set
     */
    public void setColor(VehicleColor color) {
        this.color = color;
    }

}

