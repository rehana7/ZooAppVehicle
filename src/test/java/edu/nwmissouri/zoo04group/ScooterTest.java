/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author NIKHIL KUMAR AKARAPU
 */
public class ScooterTest {
    
     private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public ScooterTest() { 
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        
        System.setOut(new PrintStream(outputStreamCaptor));
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of color method, of class Scooter.
     */
    @Test
    public void testColor() {
        String expected = "Color of Scooter is Matgrey.";
        var scooter = new Scooter("scoo");
        scooter.color();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of mileage method, of class Scooter.
     */
    @Test
    public void testMileage() {
        String expected = "mileage of Scooter is 100kmpl.";
        var scooter = new Scooter("scoo");
        scooter.mileage();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of specifications method, of class Scooter.
     */
    @Test
    public void testSpecifications() {
        String expected = "specifications of Scooter are:\n Displacement: 150cc\n Engine type: single cylinder\n MaxPower:2000rpm";
        var scooter = new Scooter("scoo");
        scooter.specifications();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of price method, of class Scooter.
     */
    @Test
    public void testPrice() {
        String expected = "Price to rent for ! 5.00 miles distance 8.00$ gasprice is 40.00 $";
        var scooter = new Scooter("scoo");
        scooter.price();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of getVehiclePrice method, of class Scooter.
     
    @Test
    public void testGetVehiclePrice() {
        System.out.println("getVehiclePrice");
        double a = 0.0;
        double b = 0.0;
        Scooter instance = null;
        double expResult = 0.0;
        double result = instance.getVehiclePrice(a, b);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }*/

    /**
     * Test of main method, of class Scooter.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Scooter.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
