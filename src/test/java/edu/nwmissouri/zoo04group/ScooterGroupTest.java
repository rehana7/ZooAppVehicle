
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


public class ScooterGroupTest {
    
    public ScooterGroupTest() {
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

    @Test
    public void testCreate() {
       System.out.println("create");
        int expResult = 1;
        int result = ScooterGroup.create();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of run method, of class HarpSealGroup.
     */
    @Test
    public void testRun() { 
        
         ScooterGroup.create();
        ScooterGroup.run();
        assertTrue(true);
       
       
    }
    
}