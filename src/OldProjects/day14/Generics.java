package OldProjects.day14;

import java.time.LocalDateTime;

/**
 * Created by sp0rk on 14/07/17.
 */
public class Generics {
    public static class ValueLogEntry<T> {
        private final LocalDateTime dateCreated = LocalDateTime.now();
        private final T value;

        public ValueLogEntry(T value) {
            this.value = value;
        }

        public LocalDateTime getDateCreated() {
            return dateCreated;
        }

        public T getValue() {
            return value;
        }
    }

    public static <T> T printAndReturn(T var){
        System.out.println(var);
        return var;
    }

    public static <T> void myPrint(T toPrint) {
        System.out.println(toPrint.toString());
    }

    public static void main(String[] args) {
        myPrint("Blabla");
        myPrint(5);
        myPrint(new Exception());


//        ValueLogEntry<String> entry = new ValueLogEntry<>("Test string");
//
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(3);
//        ValueLogEntry<List> listEntry = new ValueLogEntry<>(list);
//
//        System.out.println(entry.getDateCreated() + entry.getValue());
//        System.out.println(listEntry.getDateCreated() + listEntry.getValue().toString());

        System.out.println("------");
        System.out.println(printAndReturn("Eleven").length());
        System.out.println("-----");
        System.out.println(printAndReturn(15) + 20);
    }
}
