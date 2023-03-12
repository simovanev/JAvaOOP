package Polymorphism._01_Vehicles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split("\\s+");
        String[] truckInfo = scanner.nextLine().split("\\s+");

        Vehicles car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        Vehicles truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));



        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] travelInfo = scanner.nextLine().split("\\s+");
            String command = travelInfo[0];
            String vehicleType = travelInfo[1];
            double distanceOrFuel=Double.parseDouble(travelInfo[2]);

            switch (command){
                case "Drive":
                    if (vehicleType.equals("Car")){
                        car.drive(distanceOrFuel);

                    } else if (vehicleType.equals("Truck")) {
                        truck.drive(distanceOrFuel);
                    }
                    break;
                case "Refuel":
                    if (vehicleType.equals("Car")){
                        car.reFuel(distanceOrFuel);

                    } else if (vehicleType.equals("Truck")) {
                        truck.reFuel(distanceOrFuel);
                    }
                    break;
            }

        }
        System.out.println(car);
        System.out.println(truck);
    }
}
