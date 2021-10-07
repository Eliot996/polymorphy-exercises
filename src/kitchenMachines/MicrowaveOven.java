package kitchenMachines;

public class MicrowaveOven extends KitchenMachine{
    int wattage;
    int powerLevel;

    public MicrowaveOven(String brand, Color color, int wattage, int powerLevel){
        super(brand, color);
        this.wattage = wattage;
        this.powerLevel = powerLevel;
    }

    @Override
    public String toString() {
        return "MicrowaveOven{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", isOn=" + isOn +
                ", wattage=" + wattage +
                ", powerLevel=" + powerLevel +
                '}';
    }
}
