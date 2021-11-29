
package edu.nwmissouri.zoo04group;


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
            @RequestParam(name = "id", required = false, defaultValue = "0") String idParam,
            Model model) {
        model.addAttribute("id", idParam);
        model.addAttribute("name", "World");
        model.addAttribute("greeting", GREETING_MESSAGE); 
       // model.addAttribute("vehicleMap", ZooBuildSwitch.getAllVehicleMap());
       // model.addAttribute("animalMap", ZooBuildSwitch.getAllAnimalMap());
       // model.addAttribute("customVehicleGroup", getCustomVehicleGroup(idParam));
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
        model.addAttribute("animalMap", getAllAnimalMap());
        model.addAttribute("animalOutput", getAnimalOutput(idParam));
     //   model.addAttribute("animalImage", getAnimalImageLink(idParam));
        return "animal";
    }

       /**
     * Dynamically calls an Animal's run() function by class name
     * 
     * @param className     The name of the Animal Class we want
     * @param animalName    The animal's name required in its constructor
     */
    private static void callAnimalRun(String className, String animalName) {
        String myPackage = "edu.nwmissouri.zoo04group";
        Class[] cArg = new Class[1];
        cArg[0] = String.class;
        Class noparams[] = {};

        String fullClass = myPackage + "." + className.replace(" ", "");
        try {
            Class<?> animalClass = Class.forName(fullClass);
            Object obj = animalClass.getDeclaredConstructor(cArg).newInstance(animalName);
            Method method = animalClass.getDeclaredMethod("run", noparams);
            method.invoke(obj, null);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Gets the output of the animal's run() function
     * Puts it in its own output stream to return to the view
     * 
     * @param id    The index of the animal we want
     * @return      The output of the run() function as a string from the printStream
     */
    private String getAnimalOutput(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);

        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);
/*
        var intID = Integer.parseInt(id);
        var myList = Animal.getAnimalList();

        if ((intID > 0) && (intID <= myList.length)) {
            callAnimalRun(myList[intID - 1], myList[intID - 1] + " Tester");
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return formatLineBreaks( stringOutput);
    }

    /**
     * Returns a Map with key value pairs of our animals and their IDs
     * 
     * @return  The map of ID and animal key value pairs
     */
 /*   public static Map<Integer, String> getAllAnimalMap() {
        String[] animals = Animal.getAnimalList();
        int animalCount = animals.length;
        Map animalMap = Collections.synchronizedMap(new TreeMap<Integer, String>());

        for (int n = 0; n < animalCount; n++) {
            animalMap.put((n + 1), animals[n]);
        }
        return animalMap;
    }

   */
    
    /**
     * Returns a String for the name of an animal's Image
     * 
     * @param id    The ID of the index for the animal
     * @return      Return the file name of the animal's image
     */
    private String getCustomVehicleGroup(String id) {
        // Create a stream to hold the output
        var newStream = new ByteArrayOutputStream();
        var newPrintStream = new PrintStream(newStream);
        // IMPORTANT: Save the old System.out!
        PrintStream old = System.out;
        // Tell Java to use your special stream
        System.setOut(newPrintStream);
        
        var intID = Integer.parseInt(id);

        switch (intID) {

            case 1 -> {
                BikeGroup.create();
                BikeGroup.run();
            }
            case 2 ->{
                 BusGroup.create();
                 BusGroup.run();
            }
            case 3 -> {
                 CoalTrainGroup.create();
                 CoalTrainGroup.run();
            }
            case 4 -> {
                ElectricCarGroup.create();
                ElectricCarGroup.run();
            }
            case 5 -> {
                ScooterGroup.create();
               ScooterGroup.run();
            }
            case 6 -> {
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
}
