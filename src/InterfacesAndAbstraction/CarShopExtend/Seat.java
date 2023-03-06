package InterfacesAndAbstraction.CarShopExtend;

public class Seat extends CarImpl implements Sellable {

    private double price;

    public Seat(String model, String color, int horsePower, String country, double price) {
        super(model, color, horsePower, country);
        this.price = price;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires%n%s sells for %f",
                getModel(),
                countryProduced(),
                TIRES,
                getModel(),
                getPrice());
    }
}
