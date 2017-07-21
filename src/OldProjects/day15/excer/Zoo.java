package OldProjects.day15.excer;

import java.util.HashSet;

/**
 * Created by sp0rk on 17/07/17.
 */
public class Zoo {
    private HashSet<Animal> animals = new HashSet<>();

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void listAnimals() {
        System.out.println("Zoo: " + animals);
    }

    void speakAll() {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    HashSet<Animal> getAnimals(){
        return animals;
    }
}
