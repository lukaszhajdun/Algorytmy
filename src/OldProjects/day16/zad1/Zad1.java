package OldProjects.day16.zad1;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by RENT on 2017-07-18.
 */
public class Zad1 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>();
        Collections.addAll(people, "Jurec", "Hajdun", "Nowak", "Michalec", "Kowalski", "Wojt");
        people.stream()
                .map(s -> s.toUpperCase())
//                .sorted((s1, s2) -> new Character(s1.charAt(1)).compareTo(new Character(s2.charAt(1))))
                .sorted((s1, s2) -> {
                    char c1 = s1.charAt(1);
                    char c2 = s2.charAt(1);
                    if (c1 > c2)
                        return -1;
                    else if (c1 < c2)
                        return 1;
                    else
                        return 0;
                })
                .forEach(s -> System.out.println(s))
        ;
    }
}
