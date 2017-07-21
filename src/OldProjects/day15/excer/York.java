package OldProjects.day15.excer;

/**
 * Created by sp0rk on 17/07/17.
 */
public class York extends Dog implements Cute{
    public York(String name) {
        super(name);
    }

    @Override
    public void beCute() {
        System.out.println("woof woof i'm cute");
    }
}
