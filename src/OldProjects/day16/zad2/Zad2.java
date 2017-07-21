package OldProjects.day16.zad2;

/**
 * Created by RENT on 2017-07-18.
 */
public class Zad2 {
    public static void main(String[] args) {
        String longer = betterString("Ala", "Kotek", (s1, s2) -> s1.length() > s2.length());
        String hasCat = betterString("Kotek", "Piesek", (s1, s2) -> s1.contains("Kotek"));
        System.out.println("Longer: " + longer);
        System.out.println("hasCat: " + hasCat);

    }

    interface Better {
        boolean isBetter(String s1, String s2);
    }

    public static String betterString(String s1, String s2, Better better) {
//        if (better.isBetter(s1, s2)) {        //To samo co niżej
//            return s1;
//        } else {
//            return s2;
//        }
        return (better.isBetter(s1, s2)) ? s1 : s2;
    }

}
