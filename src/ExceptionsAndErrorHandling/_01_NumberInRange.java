package ExceptionsAndErrorHandling;

import java.util.Scanner;

public class _01_NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bounds = scanner.nextLine().split(" ");
        int lowerBound = Integer.parseInt(bounds[0]);
        int upperBound = Integer.parseInt(bounds[1]);
        System.out.printf("Range: [%d...%d]\n", lowerBound, upperBound);
        String input = scanner.nextLine();


        while (true) {
            int number;
            try {
                 number = readNumberInRange(input, lowerBound, upperBound);

                System.out.println("Valid number: "+number);
                return;

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid number: " + input);
            }

            input = scanner.nextLine();


        }
    }

    public static int readNumberInRange(String input, int lowerBound, int upperBound) {
        int number = Integer.parseInt(input);
        if (number >= lowerBound && number <= upperBound) {
            return number;
        }
        throw new IllegalArgumentException("Invalid Number: " + input);
    }
}

