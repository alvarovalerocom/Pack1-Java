package com.company.vehicles;

public class GroundVehicle extends Vehicle {
    private int PS;
    private int numberOfWheels;

    public GroundVehicle(String name, int maxSpeed, int PS, int numberOfWheels) {
        super(name, maxSpeed);
        this.PS = PS;
        this.numberOfWheels = numberOfWheels;
    }

    public int getPS() {
        return PS;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    @Override
    public String getVehicleType() {
        return "This is a ground vehicle.";
    }
}
