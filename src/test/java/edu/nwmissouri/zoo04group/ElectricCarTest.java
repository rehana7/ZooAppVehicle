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
 * @author Rehana Naguru
 */
public class ElectricCarTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    
    public ElectricCarTest() {
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
     * Test of location method, of class ElectricCar.
     */
    @Test
    public void testLocation() throws Exception { 
        String expected = "The path to travel is connected to GPS.";
        var electriccar = new ElectricCar("car");
        electriccar.location();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
        
    }

    /**
     * Test of type method, of class ElectricCar.
     */
    @Test
    public void testType() {
        String expected = "This is of land vehicle used to see Terrestrial Animals.";
        var electriccar = new ElectricCar("car");
        electriccar.type();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of model method, of class ElectricCar.
     */
    @Test
    public void testModel() {
        String expected = "Model of your chosen car is :Toyoto.";
        var electriccar = new ElectricCar("car");
        electriccar.model();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of make method, of class ElectricCar.
     */
    @Test
    public void testMake() {
       String expected = "Make of car is Camry.";
        var electriccar = new ElectricCar("car");
        electriccar.make();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of color method, of class ElectricCar.
     */
    @Test
    public void testColor() {
        String expected = "The color of car you chosen is Red.";
        var electriccar = new ElectricCar("car");
        electriccar.color();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }

    /**
     * Test of Price method, of class ElectricCar.
     */
    @Test
    public void testPrice() {
        String expected = "Price to rent for ! 8.00 miles distance 4.00$ gasprice is 32.00 $";
        var electriccar = new ElectricCar("car");
        electriccar.price();
        String actual = outputStreamCaptor.toString().trim();
        assertEquals(expected, actual);
        
    }


    /**
     * Test of main method, of class ElectricCar.
     */
    @Test
    public void testMain()   {
        System.out.println("main");
        String[] args = null;
        ElectricCar.main(args);
        // TODO review the generated test code and remove the default call to fail.
       
    }
    
}
