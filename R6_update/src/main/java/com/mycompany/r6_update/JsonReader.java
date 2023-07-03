package com.mycompany.r6_update;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonReader {
    public static void main(String[] args) {
        try {
            // Read JSON file into a string
            String json = new String(Files.readAllBytes(Paths.get("D:/GitHub projects/R6-operator-generator-update/R6_update/PrimaryWeapons.json")));

            // Access specific values from the JSON
            String name = getValue(json, "Name");
           String type = getValue(json, "Type");
            

            // Print the values
            System.out.println("Name: " + name);
            System.out.println("Type: " + type);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getValue(String json, String key) {
        int startIndex = json.indexOf("\"" + key + "\"") + key.length() + 3; // Adjust for quotes and colon
        int endIndex = json.indexOf("\"", startIndex);
        return json.substring(startIndex, endIndex);
    }
}
