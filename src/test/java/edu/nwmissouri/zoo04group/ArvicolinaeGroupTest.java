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
 *
 * @author NIKHIL KUMAR AKARAPU
 */
public class ArvicolinaeGroupTest {
    
    public ArvicolinaeGroupTest() {
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
     * Test of create method, of class ArvicolinaeGroup.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        int expResult = 3;
        int result = ArvicolinaeGroup.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class ArvicolinaeGroup.
     */
    @Test
    public void testRun() {
      
        ArvicolinaeGroup.create();
        ArvicolinaeGroup.run();
        assertTrue(true);
    }
    
}
