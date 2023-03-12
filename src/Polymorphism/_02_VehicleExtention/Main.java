package Polymorphism._02_VehicleExtention;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Vehicles> vehicleMap = new LinkedHashMap<>();
        for (int i = 0; i < 3; i++) {
            String[] vehicleInfo = scanner.nextLine().split("\\s+");
            Vehicles vehicle = null;
            if (vehicleInfo[0].equals("Car")) {
                vehicle = new Car(Double.parseDouble(vehicleInfo[1]), Double.parseDouble(vehicleInfo[2]), Integer.parseInt(vehicleInfo[3]));
            } else if (vehicleInfo[0].equals("Truck")) {
                vehicle = new Truck(Double.parseDouble(vehicleInfo[1]), Double.parseDouble(vehicleInfo[2]), Integer.parseInt(vehicleInfo[3]));
            } else if (vehicleInfo[0].equals("Bus")) {
                vehicle = new Bus(Double.parseDouble(vehicleInfo[1]), Double.parseDouble(vehicleInfo[2]), Integer.parseInt(vehicleInfo[3]));
            }
            vehicleMap.put(vehicleInfo[0], vehicle);

        }
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] travelInfo = scanner.nextLine().split("\\s+");
            String command = travelInfo[0];
            String vehicleType = travelInfo[1];
            double distanceOrFuel = Double.parseDouble(travelInfo[2]);

            switch (command) {
                case "Drive":
                    for (String vehicle : vehicleMap.keySet()) {
                        if (vehicle.equals(vehicleType)) {
                            vehicleMap.get(vehicle).drive(distanceOrFuel);
                        }
                    }

                    break;
                case "Refuel":
                    try {

                        for (String vehicle : vehicleMap.keySet()) {
                            if (vehicle.equals(vehicleType)) {
                                vehicleMap.get(vehicle).reFuel(distanceOrFuel);
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());

                    }
                    break;
                case "DriveEmpty":
                    vehicleMap.get("Bus").driveEmpty(distanceOrFuel);
            }

        }
        vehicleMap.values().forEach(System.out::println);
    }
}
