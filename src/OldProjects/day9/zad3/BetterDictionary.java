package OldProjects.day9.zad3;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by RENT on 2017-07-07.
 */
public class BetterDictionary {
    private HashMap<String, ArrayList<String>> dictionary = new HashMap<>();

//    Domyślny konstruktor

    public void addWord(String polish, String english) {
        if (dictionary.containsKey(polish)) {
            ArrayList<String> translations = dictionary.get(polish);
            translations.add(english);
        } else {
            ArrayList<String> translations = new ArrayList<>();
            translations.add(english);
            dictionary.put(polish, translations);
        }

    }

    //    public void replaceWord(String polish, String english) {
//        if (dictionary.containsKey(polish.toLowerCase())) {
//            dictionary.put(polish.toLowerCase(), english.toLowerCase());
//        }
//    }
//
//    public void removeWord(String polish) {
//        dictionary.remove(polish.toLowerCase());
//    }
//
//    public void removeTranslation(String english) {
//        String toRemove = "";
//        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
//            if (entry.getValue().equals(english.toLowerCase())) {
//                toRemove = entry.getKey();
//                break;
//            }
//        }
//        removeWord(toRemove);
//    }
//
    public void printDictionary() {
        System.out.println(dictionary);
    }


}
