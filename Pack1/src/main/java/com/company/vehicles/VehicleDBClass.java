package com.company.vehicles;

public class VehicleDBClass {
    private Vehicle[] vehicleList;

    public VehicleDBClass(Vehicle[] vehicleList) {
        this.vehicleList = vehicleList;
    }

    public Vehicle[] getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(Vehicle[] vehicleList) {
        this.vehicleList = vehicleList;
    }
}
