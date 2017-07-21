package OldProjects.day9;

/**
 * Created by RENT on 2017-07-07.
 */
public class Main {
    public static void main(String[] args) {
        printPositive(5);
        printPositive(0);
        printPositive(-6);

    }

    public static void printPositive(int i) {
//        if (i > 0) {
//            System.out.println(i);
//        } else {
//            System.out.println(0);
//        }

//        int x = (i > 0) ? i :  0;
        System.out.println((i > 0) ? i : 0);
    }
}
