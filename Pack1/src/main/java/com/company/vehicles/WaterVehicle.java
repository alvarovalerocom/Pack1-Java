package com.company.vehicles;

public class WaterVehicle extends Vehicle {
    private boolean hasSails;

    public WaterVehicle(String name, int maxSpeed, boolean hasSails) {
        super(name, maxSpeed);
        this.hasSails = hasSails;
    }

    public boolean isHasSails() {
        return hasSails;
    }

    public void setHasSails(boolean hasSails) {
        this.hasSails = hasSails;
    }

    @Override
    public String getVehicleType() {
        return "This is a water vehicle.";
    }
}
