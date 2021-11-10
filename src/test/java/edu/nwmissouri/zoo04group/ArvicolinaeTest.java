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
public class ArvicolinaeTest {
    
     private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public ArvicolinaeTest() {
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
     * Test of profess method, of class Arvicolinae.
     */
    @Test
    public void testProfess() {
       String expected = "I know ArvicolinaeAddition! 2.50 plus 2 is 4.50";
        var ar = new Arvicolinae("scoo");
        ar.profess();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of getArvicolinaeAddition method, of class Arvicolinae.
     
    @Test
    public void testGetArvicolinaeAddition() {
        System.out.println("getArvicolinaeAddition");
        double valueOne = 6.0;
        int valueTwo = 5;
        Arvicolinae instance = null;
        double expResult = 0.0;
        double result = instance.getArvicolinaeAddition(valueOne, valueTwo);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }*/

    /**
     * Test of dance method, of class Arvicolinae.
     */
    @Test
    public void testDance() {
       String expected = "I will dance, When am happy";
        var ar = new Arvicolinae("scoo");
        ar.dance();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of speak method, of class Arvicolinae.
     */
    @Test
    public void testSpeak() {
       String expected = "I'm an Arvicolinae!";
        var ar = new Arvicolinae("scoo");
        ar.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Arvicolinae.
     */
    @Test
    public void testMove() {
        String expected = "When I move, I walk, walk, walk.";
        var ar = new Arvicolinae("scoo");
        ar.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of main method, of class Arvicolinae.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Arvicolinae.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
