/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 * CoalTrain test class
 * @author Nithin Reddy Kumbham
 */
public class CoalTrainGroupTest {
    
    public CoalTrainGroupTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of create method, of class CoalTrainGroup.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        int expResult = 1;
        int result = CoalTrainGroup.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class CoalTrainGroup.
     */
     @Test
    public void testRun() { 

        CoalTrainGroup.create();
        CoalTrainGroup.run();
        assertTrue(true);

    }
    
}
