package OldProjects.day14.task3;


import java.util.ArrayList;
import java.util.Collections;

public class ContainerUtils {

    public static <T> ArrayList<T> listOf(T... items) {
        ArrayList<T> list = new ArrayList<T>();
//        for (T item : items){
//            list.add(item);
//        }
        Collections.addAll(list, items);
        return list;
    }

}
