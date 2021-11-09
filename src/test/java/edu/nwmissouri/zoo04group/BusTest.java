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
 * @author s545236
 */
public class BusTest {
        private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    
    public BusTest() {
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
     * Test of color method, of class Bus.
     */
    @Test
    public void testColor() {
        String expected = "Color of bus is Green .";
        var b = new Bus("ZooBus");
        b.color();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of type method, of class Bus.
     */
    @Test
    public void testType() {
        String expected = "Type of Bus is double decker.";
        var b = new Bus("ZooBus");
        b.type();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of numberOfSeats method, of class Bus.
     */
    @Test
    public void testNumberOfSeats() {
        
    int numberOfSeats = 10;
    }

    /**
     * Test of numberOfTickets method, of class Bus.
     */
    @Test
    public void testNumberOfTickets() {

        int numberOfTickets = 10;
    }
    

    /**
     * Test of cost method, of class Bus.
     */
    @Test
    public void testCost() {
        // set up test, figure out expected by hand
        int numberOfTickets = 8;
        int numberOfSeats = 10;
        double ticketBase_price = 5.00;
        double expected = 400.0;

        // call function to get the actual
        var b = new Bus("ZooBus");
        double cost = Math.round(ticketBase_price * numberOfTickets * numberOfSeats * 100.0) / 100.0;
        double actual = cost;
        System.out.println("Total cost for 10 is :400.0");
        assertEquals(expected, actual);
    }
    /**
     * Test of main method, of class Bus.
     */
    @Test
    public void testMain()   {
        System.out.println("main");
        String[] args = null;
        Bus.main(args);
    }
    
}
