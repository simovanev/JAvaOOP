package ExceptionsAndErrorHandling;

import java.util.Scanner;

public class _02_SquareRoot {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String input = scanner.nextLine();
        try {
            double number= squareOf(input);
            System.out.printf("%.2f\n",number);
        }catch (RuntimeException e){
            System.out.println("Invalid");
        }finally {
            System.out.println("Goodbye");
        }
    }

    private static double squareOf(String input) {
        int number= Integer.parseInt(input);
        if (number>0){
            return Math.sqrt(number);
        }
        throw new RuntimeException();
    }
}
