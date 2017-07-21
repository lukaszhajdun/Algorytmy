package OldProjects.day14;

/**
 * Created by RENT on 2017-07-14.
 */
public class Excercises {

    public static class Pair<T> {
        private final T first;
        private final T second;

        public Pair(T first, T second) {
            this.first = first;
            this.second = second;
        }

        public T getFirst() {
            return first;
        }

        public T getSecond() {
            return second;
        }
    }

    public static class Triple<T> extends Pair<T> {

        private final T third;

        public Triple(T first, T second, T third) {
            super(first, second);
            this.third = third;
        }

        public T getThird() {
            return third;
        }
    }


    public static void main(String[] args) {
//        Pair<String> name = new Pair<>("Dariusz", "Dąbrowski");
//        Pair<Double> gpsCourds = new Pair<>(51.0, 11.5);
//
//        System.out.println(name.getFirst() + name.getSecond());
//        System.out.printf("Lat:%.2f, Lon:%.2f", gpsCourds.getFirst(), gpsCourds.getSecond());

        Triple<String> words = new Triple<>("One ", "Two ", "Three ");
        System.out.printf("%s %s %s",words.getFirst(), words.getSecond(), words.getThird());
        Triple<Integer> triple = new Triple<>(1,2,3);
        System.out.printf("\n%d \n%d \n%d", triple.getFirst(), triple.getSecond(), triple.getThird());
    }
}
