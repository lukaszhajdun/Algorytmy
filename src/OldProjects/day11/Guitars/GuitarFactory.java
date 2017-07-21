package OldProjects.day11.Guitars;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-11.
 */
public class GuitarFactory {
    String name;
    ArrayList<Guitar> guitarList = new ArrayList<>();

    public GuitarFactory(String name) {
        this.name = name;
    }

    public Guitar makeGuitar(String model, int price) {
        Guitar guitar = new Guitar(model, price);
        guitarList.add(guitar);
        return guitar;
    }

    public void testGuitars() {
        for (Guitar guitar : guitarList) {
            guitar.play();
        }
    }
}
