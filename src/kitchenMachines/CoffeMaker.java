package kitchenMachines;

import java.time.LocalTime;

public class CoffeMaker extends KitchenMachine{
    int numberOfCups;
    LocalTime timer;

    public CoffeMaker(String brand, Color color, int numberOfCups, LocalTime timer){
        super(brand, color);
        this.numberOfCups = numberOfCups;
        this.timer = timer;
    }

    @Override
    public String toString() {
        return "CoffeMaker{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", numberOfCups=" + numberOfCups +
                ", timer=" + timer +
                '}';
    }
}
