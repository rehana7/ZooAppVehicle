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
 * @author S545236
 */
public class PandaTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    public PandaTest() {
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
     * Test of speak method, of class Panda.
     */
    @Test
    public void testSpeak() {
        // System.out.println("speak");
        String expected = "Hi I am a Panda1! I Squeak..";
        var p = new Panda("Panda1");
        p.speak();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of move method, of class Panda.
     */
    @Test
    public void testMove() {
        //System.out.println("move");
        String expected = "I am a lazy animal and love to roll on ground";
        var p = new Panda("Panda1");
        p.move();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of look method, of class Panda.
     */
    @Test
    public void testLooks() {
        // System.out.println("speak");
        String expected = "Hi I am a Panda1! i am black and white with fur..";
        var p = new Panda("Panda1");
        p.looks();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of eat method, of class Panda.describes what panda likes to eat
     */
    @Test
    public void testEat() {
        //System.out.println("move");
        String expected = "I like eating bamboo!";
        var p = new Panda("Panda1");
        p.eat();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of full name method, of class Panda.
     */
    @Test
    public void testFullname() {
        System.out.println("fullname");
        String fname = "RED";
        String lname = "PANDA";
        String expResult = "REDPANDA";
        var p = new Panda("Panda1");
        String result = p.fullname(fname, lname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Panda.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Panda.main(args);
    }
}
