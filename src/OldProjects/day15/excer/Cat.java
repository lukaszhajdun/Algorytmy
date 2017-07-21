package OldProjects.day15.excer;

/**
 * Created by sp0rk on 17/07/17.
 */
public class Cat extends Animal implements Cute {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Meow");
    }

    @Override
    public void beCute() {
        System.out.println("purrrr");
    }
}
