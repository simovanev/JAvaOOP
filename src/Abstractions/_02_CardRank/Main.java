package Abstractions._02_CardRank;

public class Main {
    public static void main(String[] args) {

        CardRank[] cards = CardRank.values();
        System.out.println("Card Ranks:");
        for (CardRank item : cards) {
            System.out.printf("Ordinal value: %d; Name value: %s%n", item.ordinal(), item);
        }
    }
}
