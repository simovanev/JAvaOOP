package _01_ClassBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        double length= Double.parseDouble(scanner.nextLine());
        double width= Double.parseDouble(scanner.nextLine());
        double height= Double.parseDouble(scanner.nextLine());

        Box box = null;
        try {
            box= new Box(length,width,height);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
            return;
        }
        //Surface Area - 52.00
        //Lateral Surface Area - 40.00
        //Volume – 24.00
        System.out.printf("Surface Area - %.2f\n",box.calculateSurfaceArea());
        System.out.printf("Lateral Surface Area - %.2f\n",box.calculateLateralSurfaceArea());
        System.out.printf("Volume - %.2f",box.calculateVolume());


    }
}
