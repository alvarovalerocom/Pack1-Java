package com.company.vehicles;

public class AirVehicle extends Vehicle {


    private int cruiseSpeed;
    private int takeOffSpeed;
    private boolean hasJetEngine;

    public AirVehicle(String name, int maxSpeed, int cruiseSpeed, int takeOffSpeed, boolean hasJetEngine) {
        super(name, maxSpeed);
        this.cruiseSpeed = cruiseSpeed;
        this.takeOffSpeed = takeOffSpeed;
        this.hasJetEngine = hasJetEngine;
    }

    public int getCruiseSpeed() {
        return cruiseSpeed;
    }

    public void setCruiseSpeed(int cruiseSpeed) {
        this.cruiseSpeed = cruiseSpeed;
    }

    public int getTakeOffSpeed() {
        return takeOffSpeed;
    }

    public void setTakeOffSpeed(int takeOffSpeed) {
        this.takeOffSpeed = takeOffSpeed;
    }

    public boolean isHasJetEngine() {
        return hasJetEngine;
    }

    public void setHasJetEngine(boolean hasJetEngine) {
        this.hasJetEngine = hasJetEngine;
    }

    @Override
    public String getVehicleType() {
        return "This is an air vehicle";
    }
}
