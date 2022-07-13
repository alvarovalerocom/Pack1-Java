package com.company;


import com.company.vehicles.*;

class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.

        WaterVehicle ship = new WaterVehicle("Ship", 30, true);
        GroundVehicle car = new GroundVehicle("Car", 180, 75, 4);
        AirVehicle plane = new AirVehicle("Plane", 500, 400,120,false);
        Vehicle vehicleStartingList[] = {ship,car,plane};
        VehicleDBClass vehicleDB = new VehicleDBClass(vehicleStartingList);
        
    }
}