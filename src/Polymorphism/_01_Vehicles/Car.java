package Polymorphism._01_Vehicles;

public class Car extends  Vehicles{
    public Car(double fuel, double consumption) {
        super(fuel, consumption);
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
