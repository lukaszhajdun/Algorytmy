package OldProjects.day15.excer;

/**
 * Created by sp0rk on 17/07/17.
 */
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("Woof");
    }
}
