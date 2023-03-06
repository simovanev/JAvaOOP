package InterfacesAndAbstraction.CarShopExtend;

public class CarImpl implements Car{
    private String model;
    private String color;
    private int horsePower;
    private String country;

    public CarImpl(String model, String color, int horsePower, String country) {
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
        this.country = country;
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
}
