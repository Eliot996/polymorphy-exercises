package kitchenMachines;

public abstract class KitchenMachine {
    protected String brand;
    protected Color color;
    protected boolean isOn;

    public KitchenMachine(String brand, Color color){
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
