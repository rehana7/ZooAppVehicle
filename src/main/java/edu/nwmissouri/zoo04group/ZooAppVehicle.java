/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;
import java.util.Scanner;
/**
 * ZooAppVehicle is a Zoo simulation created by 05FA21 Group04
 * @author Rehana Naguru
 */
public class ZooAppVehicle {

    // Specify welcome message
    private static final String GREETING_MESSAGE = "Welcome to our Zoo Vehicle !";

    // Specify how to exit message
    private static final String ESCAPE_MESSAGE = "Hit Q to exit.";

    // Specify goodbye string
    private static final String GOODBYE_MESSAGE = "Thank you for renting our Zoo Vehicle!";

    // specify number of  VEHICLE types available 
    private static final int NUMBER_VEHICLE_TYPES = 6;

    /**
     * This main() method is the entry point for our application.
     *
     * @param args - inputs provided to the program (none required)
     */
    public static void main(String[] args) {

        // output welcome
        System.out.println(GREETING_MESSAGE);

        // output how to escape 
        System.out.println(ESCAPE_MESSAGE);

        // construct Scanner and begin interaction
        var scanner = new Scanner(System.in);

        // Prompt for topic: ask if they want to rent vehicles
        System.out.println("Do you want to rent vehicle (y/n)?");
        var vehicleInterestInput = scanner.next();

        // if yes, show list
        if (vehicleInterestInput.toUpperCase().startsWith("Y")) {

            // declare an int for the vehicle type number input
            int typeNumberInput;

            // declare a boolean for isValid
            boolean isValid;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to rent vehicle.
                System.out.println();
                System.out.println("What vehicle would you like to see?");
                System.out.println("Enter a number to choose, 0 to exit.");

                System.out.print(" 1.Bike            ");
                System.out.print(" 2.Bus          ");
                System.out.print(" 3.Coal Train         ");
                System.out.print(" 4.Electric Car    ");
                System.out.print(" 5.Scooter             ");
                System.out.println(" 6.Wheel Chair         ");
                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_VEHICLE_TYPES;

                // switch by VEHICLE type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput) {
                    case 1 -> {
                     //   BikeGroup.create();
                     //   BikeGroup.run();
                    }
                    case 2 -> {
                        BusGroup.create();
                        BusGroup.run();
                    }
                    case 3 -> {
                        CoalTrainGroup.create();
                        CoalTrainGroup.run();
                    }
                    case 4 -> {
                        ElectricCarGroup.create();
                        ElectricCarGroup.run();
                    }
                    case 5 -> {
                     //   ScooterGroup.create();
                      //  ScooterGroup.run();
                    }
                    case 6 -> {
                        WheelChairGroup.create();
                        WheelChairGroup.run();
                    }
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (isValid);

           
        } 
        
        // Prompt for topic: ask if they want to rent vehicles
        System.out.println("Do you want to see animal (y/n)?");
        var animalInterestInput = scanner.next();

        // if yes, show list
        if (animalInterestInput.toUpperCase().startsWith("Y")) {

            // declare an int for the animal type number input
            int typeNumberInput;

            // declare a boolean for isValid
            boolean isValid;

            // do the list prompt for the first time, loop back while valid
            do {
                // Prompt for type: ask if they want to see animals
                System.out.println();
                System.out.println("Now you are ready to see animals.");
                System.out.println("What animal would you like to see?");
                System.out.println("Enter a number to choose, 0 to exit.");

                System.out.print(" 1.Arvicolinae        ");
                System.out.print(" 2.Cat          ");
                System.out.print(" 3.HarpSeal        ");
                System.out.print(" 4.Panda         ");
                System.out.print(" 5.Squirrel        ");
                System.out.println(" 6.Walrus         ");
                try {
                    typeNumberInput = scanner.nextInt();
                } catch (Exception ex) {
                    typeNumberInput = 0;
                }

                isValid = typeNumberInput >= 1 && typeNumberInput <= NUMBER_VEHICLE_TYPES;

                // switch by animal type - autogenerate with ZooBuildSwitch.java
                switch (typeNumberInput) {
                    case 1 -> {
                     //   ArvicolinaeGroup.create();
                     //   ArvicolinaeGroup.run();
                    }
                    case 2 -> {
                     //   CatGroup.create();
                     //   CatGroup.run();
                    }
                    case 3 -> {
                        HarpSealGroup.create();
                        HarpSealGroup.run();
                    }
                    case 4 -> {
                        PandaGroup.create();
                        PandaGroup.run();
                    }
                    case 5 -> {
                        SquirrelGroup.create();
                        SquirrelGroup.run();
                    }
                    case 6 -> {
                        WalrusGroup.create();
                        WalrusGroup.run();
                    }
                    default -> {
                    }

                }

                // while the input is valid, we loop back
            } while (isValid);

           
        } 
        // Prompt for adventures: ask if they want to try an adventure
         //    System.out.println("Do you want to go on an adven (y/n)?");
        //        var adventureInterestInput = scanner.next();
        //        if (adventureInterestInput.toUpperCase().startsWith("Y")) {
        //            System.out.println("Sorry - this option is not yet available.");
        //        }
        // output goodbye
        System.out.println(GOODBYE_MESSAGE);

    }

}

