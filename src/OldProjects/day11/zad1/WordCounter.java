package OldProjects.day11.zad1;

import java.util.TreeMap;

/**
 * Created by RENT on 2017-07-11.
 */
public class WordCounter {

    public static TreeMap<String, Integer> countWords(String text) {
        TreeMap<String, Integer> counter = new TreeMap<>();

        String noWhitespaces = text.trim();
        String noSpecialChars = noWhitespaces.replaceAll("[.,/():;_\\-+?!&\\\\@]", " ");
        String noDoubleSpaces = noSpecialChars.replaceAll("\\s+", " ");
        String lowerCase = noDoubleSpaces.toLowerCase();
        String[] words = lowerCase.split(" ");

//        System.out.println(Arrays.toString(words));

        for (String word : words) {
            if (counter.containsKey(word)) {
                int occurrences = counter.get(word);
                counter.put(word, occurrences + 1);
            } else {
                counter.put(word, 1);
            }
        }

        return counter;
    }


    public static void main(String[] args) {
        printSorted(countWords(" \n    ab.cd a,b-s+d_f;d:AA@ssf-d?d?d))) a/dd?wfs\nEWEQg asa\\wsfEWE!sfsa&fg gd(ssha)d "));
    }

    private static void printSorted(TreeMap<String, Integer> map) {
        System.out.println(map);
    }
}
