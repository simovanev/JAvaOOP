package Polymorphism._02_VehicleExtention;

import java.text.DecimalFormat;

public abstract class Vehicles {
    private double fuel;
    private double consumption;
    private int tankCapacity;

    protected Vehicles(double fuel, double consumption, int tankCapacity) {
        this.fuel = fuel;
        this.consumption = consumption;
        this.tankCapacity = tankCapacity;
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
        if (fuel <= 0) {
            throw new IllegalArgumentException("Fuel must be a positive number");

        }
        if (fuel + this.fuel > this.tankCapacity) {
            throw new IllegalArgumentException("Cannot fit fuel in tank");
        }
        return this.fuel += (fuel * specificRefueling());
    }

    public abstract double specificRefueling();

    @Override
    public String toString() {
        return String.format("%s: %.2f", getClass().getSimpleName(), this.fuel);
    }

    public void driveEmpty(double distance) {
        double newFuel = 0;
        DecimalFormat df = new DecimalFormat("###.##");
        newFuel = this.fuel - distance * this.consumption;
        if (newFuel >= 0) {
            this.fuel = newFuel;
            System.out.printf("%s travelled %s km\n", getClass().getSimpleName(), df.format(distance));
        } else {
            System.out.println(getClass().getSimpleName() + " needs refueling");
        }
    }
}

