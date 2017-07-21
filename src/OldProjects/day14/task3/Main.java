package OldProjects.day14.task3;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-07-14.
 */
public class Main {

    public static void main(String[] args) {

//        HeterogeneousPair<String, Integer> score = new HeterogeneousPair<>("Darek", 4);
//        String name = score.getFirst();
//        int theirScore = score.getSecond();
//        System.out.printf("%s %d points", name, theirScore);

        ArrayList<String> strings = ContainerUtils.listOf("a","b", "kajak", "kurs");
        ArrayList<Integer> num = ContainerUtils.listOf(1,2,3,4,5,6);
        System.out.println(strings);
        System.out.println(num);

    }
}
