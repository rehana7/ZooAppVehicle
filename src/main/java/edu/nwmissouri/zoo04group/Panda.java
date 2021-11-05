package edu.nwmissouri.zoo04group;

/**
 * Panda animal class extends Animal Class
 *
 * @author Preethi Jadhav
 */
public class Panda extends Animal {

    /**
     * Panda constructor
     *
     * @param name - the name of this Panda
     */
    public Panda(String name) {
        super(name);
    }

    /**
     * speak overrides function in animal class
     */
    @Override
    public void speak() {
        System.out.println("Hi I am a " + this.name + "! I Squeak.. ");
    }

    /**
     * move overrides function in animal class
     */
    @Override
    public void move() {
        System.out.println("I am a lazy animal and love to roll on ground");
    }

    /**
     * looks describe how the animal looks
     */
    public void looks() {
        System.out.println("Hi I am a " + this.name + "! i am black and white with fur..");
    }

    /**
     * eat describe what the animal eats
     */
    public void eat() {
        System.out.println("I like eating bamboo!");
    }

    /**
     * function pandaType
     */
    public void pandaType() {
        String firstName = "RED";
        String lastName = "PANDA";

        System.out.println("There are 2 types of panda, RED panda ,BLACK-WHITE pandas....");
        String fullName = fullname(firstName, lastName);
        System.out.println("My full name is : " + fullName);

    }

    /**
     *
     * @param fname
     * @param lname
     * @return
     */
    public String fullname(String fname, String lname) {
        return fname + lname;
    }

    /**
     *
     * @param args main class for panda
     */
    public static void main(String[] args) {
        var panda = new Panda("Test");
        panda.speak();
        panda.move();
        panda.looks();
        panda.eat();
        panda.pandaType();
    }

}
