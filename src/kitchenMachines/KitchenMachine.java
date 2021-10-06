package kitchenMachines;

public abstract class KitchenMachine {
    protected String brand;
    protected String color;
    protected boolean isOn;

    public KitchenMachine(String brand, String color){
        this.brand = brand;
        this.color = color;
        this.isOn = false;
    }

    public void switchOn(){
        if (!isOn){
            isOn = true;
        }
    }

    public void switchOff(){
        if (isOn){
            isOn = false;
        }
    }

    @Override
    public abstract String toString();
}
