
package edu.nwmissouri.zoo04group;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
        //model.addAttribute("vehicleMap", ZooBuildSwitch.getAllVehicleMap());
      //  model.addAttribute("animalMap", ZooBuildSwitch.getAllAnimalMap());
        //model.addAttribute("customVehicleGroup", getCustomVehicleGroup(idParam));
      //  model.addAttribute("customAnimalGroup", getCustomAnimalGroup(idParam));
        // associated with index.hmtl in src/main/resources/templates
        return "index";
    }

    /**
     * Map GET request to "/about" to about().
     *
     * @return filename from src/main/resources/templates folder
     */
    @GetMapping(path = "/about")
    public String about() {
        return "about";
    }

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

            case 1: {
                BikeGroup.create();
                BikeGroup.run();
            }
            case 2 :{
                 BusGroup.create();
                 BusGroup.run();
            }
            case 3 :{
                 CoalTrainGroup.create();
                 CoalTrainGroup.run();
            }
            case 4 : {
                ElectricCarGroup.create();
                ElectricCarGroup.run();
            }
            case 5 : {
                ScooterGroup.create();
               ScooterGroup.run();
            }
            case 6 :{
                 WheelChairGroup.create();
                 WheelChairGroup.run();
            }
            default : {
            }
        }

        // Put things back
        System.out.flush();
        System.setOut(old);
        String stringOutput = newStream.toString();
        return stringOutput;
    }
}
