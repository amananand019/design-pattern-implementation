package strategyDesignPattern.vehicle;

import strategyDesignPattern.strategy.NormalDrive;

public class NormalVehicle extends Vehicle{
    public NormalVehicle(){
        super(new NormalDrive());
    }
}
