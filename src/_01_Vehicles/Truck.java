package _01_Vehicles;

public class Truck extends Vehicles{
    public Truck(double fuel, double consumption) {
        super(fuel, consumption);
    }

    @Override
    public double extraConsumption() {
        return 1.6;
    }

    @Override
    public double specificRefueling() {
        return 0.95;
    }
}
