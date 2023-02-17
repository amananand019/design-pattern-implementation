package strategyDesignPattern.vehicle;

import strategyDesignPattern.strategy.SportsDrive;

public class SportsVehicle extends Vehicle{

    public SportsVehicle() {
        super(new SportsDrive());
    }
}
