package Polymorphism._01_Vehicles;

import java.text.DecimalFormat;

public abstract class Vehicles {
    private double fuel;
    private double consumption;

    protected Vehicles(double fuel, double consumption) {
        this.fuel = fuel;
        this.consumption = consumption;
    }

    public void drive(double distance) {
        double newFuel = 0;
        DecimalFormat df = new DecimalFormat("###.##");
        newFuel = this.fuel - distance * (this.consumption + extraConsumption());
        if (newFuel >= 0) {
            this.fuel = newFuel;
            System.out.printf("%s travelled %s km\n", getClass().getSimpleName(), df.format(distance));
        } else {
            System.out.println(getClass().getSimpleName() + " needs refueling");
        }
    }

    public abstract double extraConsumption();

    public double reFuel(double fuel) {
        return this.fuel += (fuel * specificRefueling());
    }

    public abstract double specificRefueling();

    @Override
    public String toString() {
        return String.format("%s: %.2f",getClass().getSimpleName(), this.fuel);
    }
}
