package InterfacesAndAbstraction.CarShop;

public class Seat implements Car {
    private String model;
    private String color;
    private int horsePower;
    private String country;

     Seat(String leon, String gray, int i, String spain) {
        this.model = leon;
        this.color = gray;
        this.horsePower = i;
        this.color = spain;

    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getHorsePower() {
        return this.horsePower;
    }


    @Override
    public String countryProduced() {
        return this.country;
    }

    @Override
    public String toString() {
        return String.format("This is %s produced in %s and have %d tires",
                getModel(),
                countryProduced(),
                TIRES);
    }
}
