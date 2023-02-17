package strategyDesignPattern.vehicle;

import strategyDesignPattern.strategy.DriveStrategy;

public class Vehicle {
    private final DriveStrategy driveObj;
    Vehicle(DriveStrategy driveObj){
        this.driveObj = driveObj;
    }

    public void drive(){
        driveObj.drive();
    }
}
