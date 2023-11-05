package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dealership {
    private String name;
    private String address;
    private String phone;

    static ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    private static void getVehiclesByPrice(min, max){
    }

    public static void getVehiclesByMakeModel(make, model) {
    }

    public static void getVehiclesByYear(min, max) {
    }
    public static void getVehiclesByColor(color) {
    }

    public static void getVehiclesByMileage(min, max) {
    }

    public static void getVehiclesByType(vehicleType) {
    }

    public static void getAllVehicles(ArrayList<Vehicle> inventory) {
        for (Vehicle vehicle : inventory) {
            System.out.println(vehicle);
        }
    }

    public static void addVehicle(ArrayList<Vehicle> inventory) {
        Scanner stanley = new Scanner(System.in);

        System.out.print("Enter vehicle vin: ");
        int vin = stanley.nextInt();

        System.out.print("Enter vehicle year: ");
        int year = stanley.nextInt();
        stanley.nextLine();

        System.out.print("Enter vehicle make: ");
        String make = stanley.nextLine();

        System.out.print("Enter vehicle model: ");
        String model = stanley.nextLine();

        System.out.print("Enter vehicle type: ");
        String type = stanley.nextLine();

        System.out.print("Enter vehicle color: ");
        String color = stanley.nextLine();

        System.out.print("Enter vehicle mileage: ");
        int odometer = stanley.nextInt();

        System.out.print("Enter vehicle price: ");
        double price = stanley.nextDouble();

        inventory.add(new Vehicle(vin, year, make, model, type, color, odometer, price));
    }

    public static void removeVehicle(vehicle) {
    }
}
