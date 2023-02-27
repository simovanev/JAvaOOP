package Abstractions._03_CardsWithPower;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String rank= scanner.nextLine();
        String suit= scanner.nextLine();
        Card.Rankk currentRank = Card.Rankk.valueOf(rank);
        Card.Suitt currentSuit= Card.Suitt.valueOf(suit);
        Card card= new Card(currentSuit,currentRank);

        System.out.printf("Card name: %s of %s; Card power: %d",card.getName(),card.getPower(),points(card) );

    }

    private static int points(Card card) {
        return card.rank.getPoints()+card.suit.getPoints();

    }


}
