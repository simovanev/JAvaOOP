package InterfacesAndAbstraction.CarShopExtend;

public class Audi extends CarImpl implements Rentable {
    private int minRentDay;
    private double pricePerDay;

    public Audi(String model, String color, int horsePower, String country, int minRentDay, double pricePerDay) {
        super(model, color, horsePower, country);
        this.minRentDay = minRentDay;
        this.pricePerDay = pricePerDay;
    }

    @Override
    public int getMinRentDay() {
        return this.minRentDay;
    }

    @Override
    public double getPricePerDay() {
        return this.pricePerDay;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires%nMinimum rental period of %d days. Price per day %f",
                getModel(),
                countryProduced(),
                TIRES,
                getMinRentDay(),
                getPricePerDay());
    }
}
