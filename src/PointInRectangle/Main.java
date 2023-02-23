package PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] input = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Point bottomLeft = new Point(input[0], input[1]);
        Point topRight = new Point(input[2], input[3]);
        Rectangle rectangle= new Rectangle(bottomLeft,topRight);

        int count= Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < count; i++) {
            String[] inputPoint= scanner.nextLine().split(" ");
            int x= Integer.parseInt(inputPoint[0]);
            int y= Integer.parseInt(inputPoint[1]);
            Point currentPoint= new Point(x,y);
            System.out.println(rectangle.contains(currentPoint));

        }


    }
}
