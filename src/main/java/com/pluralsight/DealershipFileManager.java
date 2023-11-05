package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static com.pluralsight.Dealership.inventory;

public class DealershipFileManager {
    public static getDealership() {
        try {
            FileReader fileReader = new FileReader("dealership.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);
            String line = "";
            while ((line = bufReader.readLine()) != null) {
                String[] fields = line.split("\\|");
                Dealership dealership = new Dealership(fields[0], fields[1], fields[2]);
                inventory.add(Dealership);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveDealership() {

    }
}
