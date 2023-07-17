package com.mycompany.r6_update;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JsonReader {
    public static void main(String[] args) {
        /*Primary*/
            try (BufferedReader pw = new BufferedReader(new FileReader("PrimaryWeapons.json", StandardCharsets.UTF_8))) {
                String radek = pw.readLine();
                while (radek != null) {
                    System.out.println(radek);
                    radek = pw.readLine();
                }
                pw.close();
            } catch (IOException ex) {
                Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Chyba při čtení!");
            /*Secondary*/    
            }try (BufferedReader sw = new BufferedReader(new FileReader("SecondaryWeapons.json", StandardCharsets.UTF_8))) {
                String radek = sw.readLine();
                while (radek != null) {
                    System.out.println(radek);
                    radek = sw.readLine();
                }
                sw.close();
            } catch (IOException ex) {
                Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Chyba při čtení!");
            }
            /*Attackers*/
            try (BufferedReader at = new BufferedReader(new FileReader("Attackers.json", StandardCharsets.UTF_8))) {
                String radek = at.readLine();
                while (radek != null) {
                    System.out.println(radek);
                    radek = at.readLine();
                }
                at.close();
            } catch (IOException ex) {
                Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Chyba při čtení!");
            }
            /*Defenders*/
            try (BufferedReader de = new BufferedReader(new FileReader("Defenders.json", StandardCharsets.UTF_8))) {
                String radek = de.readLine();
                while (radek != null) {
                    System.out.println(radek);
                    radek = de.readLine();
                }
                de.close();
            } catch (IOException ex) {
                Logger.getLogger(JsonReader.class.getName()).log(Level.SEVERE, null, ex);
                System.err.println("Chyba při čtení!");
            }
    }
}
