/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.zoo04group;
/**
 * Build a list of excluded files and authors from pom.xml.
 *
 * Note: pom.xml excludes each file twice once for compile exceptions once for
 * Javadoc exceptions
 *
 * @author Rehana Naguru
 */


import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class ZooBuildCodeIssues {

    private static final String relativePathToPackage = "/src/main/java/edu/nwmissouri/zoo04group/";

    public static void main(String args[]) {
        try {
            listFiles();
            listFilesAndAuthors();
        } catch (IOException ex) {
            System.out.println("Error: pom.xml could not be read.");
        }
    }

    private static void listFiles() throws IOException {
        System.out.println("==============");
        System.out.println("Excluded files ");
        System.out.println("===============");
        Files.lines(new File("pom.xml").toPath())
                .map(s -> s.trim())
                .filter(s -> s.contains("<exclude>"))
                .map(s -> s.replaceAll("<exclude>", ""))
                .map(s -> s.replaceAll("</exclude>", ""))
                .map(s -> s.replaceAll("edu/nwmissouri/zoo04group/", ""))
                .forEach(System.out::println); // Java 8 method reference
    }

    private static void listFilesAndAuthors() throws IOException {
        System.out.println("========================");
        System.out.println("Excluded files + authors");
        System.out.println("========================");
        Files.lines(new File("pom.xml").toPath())
                .map(s -> s.trim())
                .filter(s -> s.contains("<exclude>"))
                .map(s -> s.replaceAll("<exclude>", ""))
                .map(s -> s.replaceAll("</exclude>", ""))
                .map(s -> s.replaceAll("edu/nwmissouri/zoo04group/", ""))
                .forEach(s -> {
                    System.out.printf("%-25s", s);
                    try {
                        var codeFilePathString = getProjectPathString() + relativePathToPackage + s;
                        Files.lines(new File(codeFilePathString).toPath())
                                .map(l -> l.trim())
                                .filter(l -> l.contains("@author"))
                                .map(l -> l.replaceAll("@author", ""))
                                .forEach(System.out::print);

                    } catch (IOException ex) {
                        System.out.println("   No Author information found.");
                    }
                    System.out.println();
                });

    }

    /**
     * Get our project root directory as a String.
     *
     * @return project path string
     */
    private static String getProjectPathString() {
        Path projectPath = Paths.get("").toAbsolutePath();
        String projectPathString = projectPath.normalize().toString();
        return projectPathString;
    }

}
