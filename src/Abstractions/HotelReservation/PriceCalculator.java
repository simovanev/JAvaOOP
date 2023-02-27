package Abstractions.HotelReservation;

public class PriceCalculator {
    public  static double Calculator(double pricePerDay,int days, Season season,Discount discount){
        double totalPrice=days*pricePerDay;
        int multiplier= season.getValue();
        double discountAmount=discount.getPercent();
        return totalPrice*multiplier*discountAmount;

    }
}
