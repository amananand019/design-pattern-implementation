package strategyDesignPattern;

import strategyDesignPattern.vehicle.NormalVehicle;
import strategyDesignPattern.vehicle.SportsVehicle;
import strategyDesignPattern.vehicle.Vehicle;

public class Garage {
    public static void main(String[] args) {
        Vehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        Vehicle normalVehicle = new NormalVehicle();
        normalVehicle.drive();
    }
}