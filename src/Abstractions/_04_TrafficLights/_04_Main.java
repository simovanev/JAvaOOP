package Abstractions._04_TrafficLights;

import java.util.Scanner;

public class _04_Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String[] input= scanner.nextLine().split(" ");
       TrafficLight[] trafficLights= new TrafficLight[input.length];

        for (int i = 0; i < input.length; i++) {
            TrafficLight.Light light= TrafficLight.Light.valueOf(input[i]);
            trafficLights[i]= new TrafficLight(light);
        }

        int n= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            updateTrafficLight(trafficLights);
            printTrafficLight(trafficLights);
        }
    }

    private static void printTrafficLight(TrafficLight[] trafficLights) {
        for (TrafficLight light: trafficLights){
            System.out.print(light.getLight()+" ");
        }
        System.out.println();
    }

    private static void updateTrafficLight(TrafficLight[] trafficLights) {
        for (TrafficLight light: trafficLights){
            light.update();
        }
    }
}
