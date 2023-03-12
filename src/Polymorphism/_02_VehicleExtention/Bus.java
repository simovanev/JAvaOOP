package Polymorphism._02_VehicleExtention;

public class Bus extends Vehicles{
    public Bus(double fuel, double consumption, int tankCapacity) {
        super(fuel, consumption, tankCapacity);
    }

    @Override
    public double extraConsumption() {
        return 1.4;
    }

    @Override
    public double specificRefueling() {
        return 1;
    }
}
