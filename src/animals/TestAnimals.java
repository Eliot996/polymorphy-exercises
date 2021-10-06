package animals;

import java.util.ArrayList;

public class TestAnimals {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Cow cow = new Cow();

        ArrayList<Animal> pets = new ArrayList<>();

        pets.add(cat);
        pets.add(cow);
        pets.add(dog);

        for (Animal pet : pets){
            System.out.println(pet.speak());
        }
    }
}
