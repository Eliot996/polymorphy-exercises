package kitchenMachines;

import java.time.LocalTime;
import java.util.ArrayList;

public class TestKitchenMachines {

    public static void main(String[] args) {
        // make a microwave
        MicrowaveOven microwaveOven = new MicrowaveOven("Siemens", "brown", 1000, 1);
        // make a coffemaker
        CoffeMaker coffeMaker = new CoffeMaker("Black & Decker", "blue", 1, LocalTime.of(13,0));

        // make arrayList of kitchenMachines
        ArrayList<KitchenMachine> kitchenMachines = new ArrayList<>();

        // add the machines to the arraylist
        kitchenMachines.add(microwaveOven);
        kitchenMachines.add(coffeMaker);

        //prints all the machines in the array
        for (KitchenMachine machine : kitchenMachines){
            System.out.println(machine);
        }

        // switch all the machines on
        for (KitchenMachine machine : kitchenMachines){
            machine.switchOn();
        }

        // add linebreak
        System.out.println();

        // print all the machines agian, to check if all the machines were switched on
        for (KitchenMachine machine : kitchenMachines){
            System.out.println(machine);
        }
    }
}
