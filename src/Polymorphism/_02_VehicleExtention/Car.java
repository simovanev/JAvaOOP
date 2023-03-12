package Polymorphism._02_VehicleExtention;

public class Car extends Vehicles {
    public Car(double fuel, double consumption, int tankCapacity) {
        super(fuel, consumption, tankCapacity);
    }

    @Override
    public double extraConsumption() {
        return 0.9;
    }

    @Override
    public double specificRefueling() {
        return 1.0;
    }
}
