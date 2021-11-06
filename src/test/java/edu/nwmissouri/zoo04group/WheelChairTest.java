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
 * @author REHAMAN NAGURU ABDUR
 */
public class WheelChairTest {
     private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    public WheelChairTest() {
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
     * Test of location method, of class WheelChair.
     */
    @Test
    public void testLocation() {
        
        String expected = "wheel chairs are available at every zoo entrance gate.";
        var wheelChair = new WheelChair("wheel");
        wheelChair.location();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of type method, of class WheelChair.
     */
    @Test
    public void testType() {
        String expected = "zoo provides both manual and remote control wheelchairs";
        var wheelchair = new WheelChair("wheel");
        wheelchair.type();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of wheelchairId method, of class WheelChair.
     */
    @Test
    public void testWheelchairId() {
        String expected = "scan barcode on the wheel chair to get ID";
        var wheelchair = new WheelChair("wheel");
        wheelchair.wheelchairId();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of time method, of class WheelChair.
     */
    @Test
    public void testTime() {
        String expected = "Wheelchair rental is only on hourly basis";
        var wheelchair = new WheelChair("wheel");
        wheelchair.time();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of price method, of class WheelChair.
     */
    @Test
    public void testPrice() {
        String expected = "5$ per hour for manual wheel chair and 8$ per hour for remote control";
        var wheelchair = new WheelChair("wheel");
        wheelchair.price();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class WheelChair.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        WheelChair.main(args);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}

