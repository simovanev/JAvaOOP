package Abstractions.HotelReservation;

public enum Discount {
    None(1),SecondVisit(0.9),VIP(0.8);
    private  double percent;

    Discount(double percent) {
        this.percent = percent;
    }

    public double getPercent() {
        return percent;
    }
}
