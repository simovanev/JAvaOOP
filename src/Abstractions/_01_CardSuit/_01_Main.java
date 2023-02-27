package Abstractions._01_CardSuit;

import java.util.Scanner;

public class _01_Main {
    enum CardSuit{
        CLUBS, DIAMONDS, HEARTS, SPADES

    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        CardSuit[] values= CardSuit.values();
        System.out.println("Card Suits:");
        for (CardSuit item: values){
            System.out.printf("Ordinal value: %d; Name value: %s\n",item.ordinal(),item);
        }
    }
}
