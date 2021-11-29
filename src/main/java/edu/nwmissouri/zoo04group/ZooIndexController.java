
package edu.nwmissouri.zoo04group;

import static edu.nwmissouri.zoo04group.ZooBuildSwitch.getAllAnimalMap;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.ResourceUtils;

/**
 * Controller that handles the default request ("/").
 *
 * Use the new Java 15 text blocks to provide our menu. Thymeleaf:
 * https://spring.io/guides/gs/serving-web-content/
 *
 *
 * @author Rehana Naguru
 */
@Controller
public class ZooIndexController {

    private static final String GREETING_MESSAGE = "Welcome to our Zoo App vehicle Group4!";
    private static final String GOODBYE_MESSAGE = "Thank you for visiting our zoo!";
    private static final int NUMBER_ANIMAL_TYPES = 6;

    /**
     * The @GetMapping annotation ensures that HTTP GET requests to / are mapped
     * to the index() method.Example:
     * https://spring.io/guides/gs/serving-web-content/
     *
     *
     * @param idParam - the id provided in the URL
     * @param model - the model that holds information from controller to view
     * @return
     */
    @GetMapping(path = "/")
    public String index(
            @RequestParam(name = "vehicleType", required = false, defaultValue = "") String vehicleTypeParam,
            @RequestParam(name = "animalType", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
       // model.addAttribute("vehicleMap", ZooBuildSwitch.getAllVehicleMap());
       // model.addAttribute("animalMap", ZooBuildSwitch.getAllAnimalMap());
        model.addAttribute("customVehicleGroup", getCustomVehicleGroup(vehicleTypeParam));
        model.addAttribute("customAnimalGroup", getCustomAnimalGroup(idParam));
         // model.addAttribute("customAnimalGroup", getCustomAnimalGroup(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "index";
    }

    /**
     * Map GET request to "/about" to about().
     *
     * @return  filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }
    /**
     * Map GET request to "/vehicle" to vehicle().
     *
     * @param typeParam - the type of person provided in the URL
     * @param model - the model that holds info from controller to view
     * @return filename from src/main/resources/templates folder
     */ 
     @GetMapping(path = "/vehicle")
    public String vehicle(
        @RequestParam(name = "vehicleType", required = true) String typeParam, Model model) {
        model.addAttribute("type", typeParam);
      //  model.addAttribute("vehicleName", getvehicleName(typeParam));
      //  model.addAttribute("vehicleDescription", getvehicleDescription(typeParam));
     //   model.addAttribute("vehicleDetails", getvehicleDetails(typeParam));
      //  model.addAttribute("vehicleAnimals", getvehicleAnimals(typeParam));
        return "vehicle";
    }
    
      /**
     * Map GET request to "/animal" to animal().
     *
     * @param animalTypeParam - the type of animal provided in the URL
     * @param idParam
     * @param model - the model that holds info from controller to view
     * @return filename from src/main/resources/templates folder
     * @throws java.io.FileNotFoundException
     */
    @GetMapping(path = "/animal")
    public String animal(
        @RequestParam(name = "animalType", required = false, defaultValue = "Arvicolinae") String animalTypeParam,
        @RequestParam(name = "id", required = false, defaultValue = "0") String idParam, Model model) throws FileNotFoundException {
        model.addAttribute("id", idParam);
        model.addAttribute("type", animalTypeParam);
     //   model.addAttribute("payment", getanimalPayment(animalTypeParam));
       // model.addAttribute("animalMap", getAllAnimalMap());
        //model.addAttribute("animalOutput", getAnimalOutput(idParam));
        return "animal";
    }
    
    private String getCustomVehicleGroup(String vType) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);
        
        switch (vType) {

            case "Bike" -> {
                BikeGroup.create();
                BikeGroup.run();
            }
            case "Bus" ->{
                 BusGroup.create();
                 BusGroup.run();
            }
            case "Coal Train" -> {
                 CoalTrainGroup.create();
                 CoalTrainGroup.run();
            }
            case "Electric Car" -> {
                ElectricCarGroup.create();
                ElectricCarGroup.run();
            }
            case "Scooter" -> {
                ScooterGroup.create();
               ScooterGroup.run();
            }
            case "Wheel Chair" -> {
                 WheelChairGroup.create();
                 WheelChairGroup.run();
            }
            default -> {
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }
    
    private String getCustomAnimalGroup(String aType) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);
        
        switch (aType) {

            case "Arvicolinae" -> {
                ArvicolinaeGroup.create();
                ArvicolinaeGroup.run();
            }
            case "Cat" ->{
                 CatGroup.create();
                 CatGroup.run();
            }
            case "HarpSeal" -> {
                 HarpSealGroup.create();
                 HarpSealGroup.run();
            }
            case "Panda" -> {
                PandaGroup.create();
                PandaGroup.run();
            }
            case "Squirrel" -> {
               SquirrelGroup.create();
               SquirrelGroup.run();
            }
            case "Walrus" -> {
                 WalrusGroup.create();
                 WalrusGroup.run();
            }
            default -> {
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }
}
