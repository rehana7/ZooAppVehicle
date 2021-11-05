/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;

import static edu.nwmissouri.zoo04group.ZooCheckFiles.getFileLines;
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

/**
 * Build our switch statement so we can see all the vehicle.
 *
 * @author Rehana Naguru
 */
public class ZooBuildSwitch {

    private static final String relativePathToPackage = "/src/main/java/edu/nwmissouri/zoo04group";
    private static final String nonVehicleFileString = "SOURCE_NON_VEHICLE_FILES.txt";

    public static Map<Integer, String> getAllVehicleMap() {

        // find the files that should be excluded
        ArrayList<String> ignoreList = getNonCustomVehicleFiles();

        // process all found files, outputing custom vehicle code
        File fileFolder = new File(getCustomVehiclePackagePathString());
        String[] filesArray = fileFolder.list();
        Arrays.sort(filesArray);

        // create local variables for n and vehicleMap (a data structure)
        int n = 1;
        // keep keys in order with TreeMap and be thread safe for deployment
        Map vehicleMap = Collections.synchronizedMap(new TreeMap<Integer, String>());
        
        // process the list and load the map
        for (String file : filesArray) {
            if (!ignoreList.contains(file)) {
                int fileLength = file.length();
                int lengthExtension = ".java".length();
                int fileNameLength = fileLength - lengthExtension;
                var justName = file.substring(0, fileNameLength);
                if (justName.endsWith("Group")) {
                    var vehicle = justName.replace("Group", "");
                   vehicleMap.put(n++, vehicle);
                }
            }
        }
        return vehicleMap;
    }

    public static void main(String args[]) throws IOException {

        // find the files that should be excluded
        ArrayList<String> ignoreList = getNonCustomVehicleFiles();
        System.out.println("Ignore these:");
        ignoreList.forEach(f -> System.out.println(f));

        // process all found files, outputing custom vehicle code
        System.out.println("From all these in the package:");
        File fileFolder = new File(getCustomVehiclePackagePathString());
        String filesArray[] = fileFolder.list();
        for (String s : filesArray) {
            System.out.println(s);
        }

        System.out.println("===============================");
        System.out.println("Generate Custom Vehicle Switch");
        System.out.println("===============================");
        int n = 1;
        for (String file : filesArray) {
            if (!ignoreList.contains(file)) {
                int fileLength = file.length();
                int lengthExtension = ".java".length();
                int fileNameLength = fileLength - lengthExtension;
                var justName = file.substring(0, fileNameLength);
                if (justName.endsWith("Group")) {

                  
                    System.out.println("case " + n++ + " -> {");
                    System.out.println(justName + ".create();");
                    System.out.println(justName + ".run();");
                    System.out.println("}");
                }
            }
        }

        System.out.println("===============================");
        System.out.println("Generate Custom Vehicle Menu");
        System.out.println("===============================");
        n = 1;
        for (String file : filesArray) {
            if (!ignoreList.contains(file)) {
                int fileLength = file.length();
                int lengthExtension = ".java".length();
                int fileNameLength = fileLength - lengthExtension;
                var justName = file.substring(0, fileNameLength);
                if (justName.endsWith("Group")) {
                    // output something like this - but in columns
                   
                    var vehicle = justName.replace("Group", "");
                    var numberAndVehicle = String.format("%2d.%-20s", n, vehicle);
                    var quote = "\"";
                    var sOpen = "System.out.print(";
                    var sOpenLN = "System.out.println(";
                    var sClose = ");";
                    var strOut = sOpen + quote + numberAndVehicle + quote + sClose;
                    var strOutLN = sOpenLN + quote + numberAndVehicle + quote + sClose;
                    var statement = (n % 4 == 0) ? strOutLN : strOut;
                    System.out.println(statement);
                    n++;
                }
            }
        }
        System.out.println("===============================");
        System.out.println("Update NUMBER_VEHICLE_TYPES = " + --n);
        System.out.println("===============================");

    }

    /**
     * Get a list of expected files in the root project directory.
     *
     * @return String[] of expected file names
     */
    private static ArrayList<String> getNonCustomVehicleFiles() {
        return getFileLines(nonVehicleFileString);
    }

    /**
     * Get our project package path as a String.
     *
     * @return project package String
     */
    private static String getCustomVehiclePackagePathString() {
        Path projectPath = Paths.get("").toAbsolutePath();
        String projectPathString = projectPath.normalize().toString() + relativePathToPackage;
        System.out.println(projectPathString);
        return projectPathString;
    }

    

}
