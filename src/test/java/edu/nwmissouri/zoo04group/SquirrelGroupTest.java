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
 * SquirrelGroup Test class
 * @author Nithin Reddy Kumbham
 */
public class SquirrelGroupTest {
    
    public SquirrelGroupTest() {
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
     * Test of create method, of class SquirrelGroup.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        int expResult = 2;
        int result = SquirrelGroup.create();
        assertEquals(expResult, result);
    }

    /**
     * Test of run method, of class SquirrelGroup.
     */
    @Test
    public void testRun() {
        SquirrelGroup.create();
        SquirrelGroup.run();
        assertTrue(true);
    }
    
}
