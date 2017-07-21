package OldProjects.day15.excer;

/**
 * Created by sp0rk on 17/07/17.
 */
public class Main {
    public static void main(String[] args) {
        Doberman pies = new Doberman("Max");
        Doberman pies2 = new Doberman("Max");
        York pies3 = new York("Mark");
        Dog pies4 = new Dog("Speed");
        Cat kot = new Cat("Spike");

        Zoo zoo = new Zoo();

        zoo.addAnimal(pies);
        zoo.addAnimal(pies2);
        zoo.addAnimal(pies3);
        zoo.addAnimal(pies4);
        zoo.addAnimal(kot);

        zoo.listAnimals();
        zoo.speakAll();

//        Shelter<Dog> dogShelter = new Shelter<>();
//        dogShelter.add(pies);
//        dogShelter.add(pies2);
//        dogShelter.add(pies3);
//        dogShelter.add(pies4);
////        dogShelter.add(kot); // Wyjątek bo kot nie jest Psem
//
//        dogShelter.listAnimals();
//
//        try {
//            dogShelter.adopt(pies);
//            System.out.println("Udana adopcja");
//        } catch (Shelter.AnimalNotFoundException e) {
//            System.out.println("Nieudana adopcja");
//        } catch (SpikeAdoptionException e) {
//            System.out.println("Nie można adoptować Spike'a");
//        }
//
//
//        try {
//            dogShelter.adopt(pies2);
//            System.out.println("Udana adopcja");
//        } catch (Shelter.AnimalNotFoundException e) {
//            System.out.println("Nieudana adopcja");
//        } catch (SpikeAdoptionException e) {
//            System.out.println("Nie można adoptować Spike'a");
//        }
//
//        dogShelter.listAnimals();
//
//        dogShelter.whenAdopted(pies);

//
//
        System.out.println("-----");

        for (Animal animal : zoo.getAnimals()) {
            if (animal instanceof Cute) {//instanceof zwraca true jeśli obiekt jest danej klasy lub implementuje dany interfejs
                Cute cutie = (Cute) animal;
                cutie.beCute();
            } else {
                System.out.println("I'm not cute");
            }
        }

    }

}
