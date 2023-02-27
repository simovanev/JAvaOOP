package Abstractions._03_CardsWithPower;

public class Card {
    Suitt suit;
    Rankk rank;
    public String getName() {
        return rank+"";
    }
    public Card(Suitt siut, Rankk rank) {
        this.suit = siut;
        this.rank = rank;
    }

    public String getPower() {
        return suit+"";
    }

    enum Suitt {
        CLUBS(0),
        DIAMONDS(13),
        HEARTS(26),
        SPADES(39);

        private int power;

        Suitt(int power) {
            this.power = power;
        }

        public int getPoints() {
            return power;
        }
    }


    enum Rankk {
        ACE(14),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private int strength;

        Rankk(int strength) {
            this.strength = strength;
        }

        public int getPoints() {
            return strength;
        }

    }

}
