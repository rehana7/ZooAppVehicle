/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

/**
 *  Animal super class for traits shared by all animals. Abstract class 
 * general animal - only specific types.
 * @author Rehana Naguru
 */
public abstract class Animal { 
    /**
     * Animal Gender may be not known. 
     */
      protected String name = "no name";
     /**
     * Animal gender is not known . 
     * Using enumerated
     */
    protected AnimalGender gender;
    /**
     * Animal constructor
     *@param name - the name of this instance of an animal
     */
    public Animal(String name) {
        this.name = name;
        this.gender = AnimalGender.UNKNOWN;

    }
    /**
     * speak() - general method of speak
     */
    public void speak() {
        System.out.println("Generic animal sound");
    }
    /**
     * move() - general method for animal movement
     */
    public void move() {
        System.out.println("Generic animal movement");
    }

    /**
     * Get animal's name.
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Get the animal gender.
     *
     * @see edu.nwmissouri.zoo04lab.AnimalGender
     * @return the gender
     */
    public AnimalGender getGender() {
        return gender;
    }
    /**
     * Set the animal gender using an enumerated
     *
     * @param gender the gender to set
     */
    public void setGender(AnimalGender gender) {
        this.gender = gender;
    }

}

