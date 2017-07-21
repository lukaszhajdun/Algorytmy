package OldProjects.day15.excer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by sp0rk on 17/07/17.
 */
//Schronisko dla T, gdzie T jest zwierzęciem. Możemy zrobić schronisko Kotów, Psów, Yorków, ale nie Integerów
public class Shelter<T extends Animal> {
    private HashSet<T> animals = new HashSet<>();
    private HashMap<T, LocalDateTime> adoptions = new HashMap<>();

    void add(T animal) {
        animals.add(animal);
    }

    void listAnimals() {
        System.out.println("Shelter: " + animals);
    }

    void adopt(T animal) throws AnimalNotFoundException, SpikeAdoptionException {
        if (animal.getName().equals("Spike")) { //idiotyczny przykład DYDAKTYCZNY.
            throw new SpikeAdoptionException();
        }
        if (animals.contains(animal)) {
            animals.remove(animal);
            adoptions.put(animal, LocalDateTime.now());
        } else {
            throw new AnimalNotFoundException();
        }
    }

    void whenAdopted(T animal){
        System.out.println(adoptions.get(animal));
    }

    public static class AnimalNotFoundException extends Exception {
    }
}
