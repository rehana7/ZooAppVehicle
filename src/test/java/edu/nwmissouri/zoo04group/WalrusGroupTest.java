/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Walrus Group.
 * 
 * 
 * @Rehaman Naguru Abdur
 */
public class WalrusGroupTest {

    public WalrusGroupTest() {
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
     * Test of create method, of class WalrusGroup.
     */
    @Test
    public void testGroupCreate() {
        int expectedSize = 3;
        int actualSize = WalrusGroup.create();
        assertEquals(expectedSize, actualSize);
    }

    /**
     * Test of run method, of class WalrusGroup.
     */
    @Test
    public void testGroupRun() {
        WalrusGroup.create();
        WalrusGroup.run();
        assertTrue(true);
    }

}

