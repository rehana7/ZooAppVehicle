/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * CoalTrain test using JUnit
 * @author Nithin Reddy Kumbham
 */
public class CoalTrainTest {
    
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public CoalTrainTest() {
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
     * Test of location method, of class CoalTrain.
     */
    @Test
    public void testlocation() throws Exception {
        String expected = "you can track me by using GPRS";
        var coaltrain = new CoalTrain("El-to-Rado");
        coaltrain.location();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of runType method, of class CoalTrain.
     */
    @Test
    public void testrunType() throws Exception {
        String expected = "I run by using coal";
        var coaltrain = new CoalTrain("El-to-Rado");
        coaltrain.runType();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

    /**
     * Test of purpose method, of class CoalTrain.
     */
    @Test
    public void testpurpose() throws Exception {
        String expected = "You can use me to roam in the zoo watching all the animals";
        var coaltrain = new CoalTrain("El-to-Rado");
        coaltrain.purpose();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }
    
    /**
     * Test of speed method, of class CoalTrain.
     */
    @Test
    public void testspeed() throws Exception {
        String expected = "I travel slowly and my speed is 10kmph";
        var coaltrain = new CoalTrain("El-to-Rado");
        coaltrain.speed();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

}
