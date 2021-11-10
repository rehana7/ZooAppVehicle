
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
 * @author Maneesh Sake
 */
public class BikeTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public BikeTest() {
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
     * Test of model method, of class Bike.
     */
    @Test
    public void testModel() {
        String expected = "Model of the bike:Bnw.";
        var bike = new Bike("bike");
        bike.model();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
        
    }
 /**
     * Test of Price method, of class Bike.
     */
    @Test
    public void testcost() {
        String expected = "Cost of the bike is 12 lakhs.";
        var bike = new Bike("bik");
        bike.cost();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    
    }

   /**
     * Test of color method, of class Bike.
     */
    @Test
    public void testColor() {
        String expected = "The color of Bike you chosen is silver..";
       var bike = new Bike("bik");
        bike.color();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    }

 @Test
    public void testLocation() throws Exception { 
        String expected = "travel is connected to GPS.";
        var bike = new Bike("bik");
        bike.location();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
    
        
    }
/**
     * Test of type method, of Bike.
     */
    @Test
    public void testType() {
        String expected = "This is of land vehicle used to see Terrestrial Animals.";
        var bike = new Bike("bike");
        bike.type();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
   
        
    }


    /**
     * Test of main method, of class Bike.
     */
    @Test
    public void testMain()   {
        System.out.println("main");
        String[] args = null;
        ElectricCar.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }

   
    
}
