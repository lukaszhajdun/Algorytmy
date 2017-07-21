package OldProjects.day9.zad3;

/**
 * Created by sp0rk on 07/07/17.
 */
public class Main {
    public static void main(String[] args) {
        Dictionary polEngDict = new Dictionary();

        polEngDict.addWord("Bakłażan", "Eggplant");
        polEngDict.addWord("Pies", "Dog");
        polEngDict.addWord("Kot", "Cat");

        polEngDict.addWord("Pies", "Hound");

        polEngDict.replaceWord("Kot", "Kitten");
        polEngDict.replaceWord("Lis", "Fox");

        polEngDict.removeWord("Bakłażan");

        polEngDict.removeTranslation("kitten");

        System.out.println("dict");
        polEngDict.printDictionary();

        System.out.println("betterDict");
        BetterDictionary betterDictionary = new BetterDictionary();
        betterDictionary.addWord("Kot", "Cat");
        betterDictionary.addWord("Kot", "Kitten");
        betterDictionary.addWord("Pies", "Dog");

        betterDictionary.printDictionary();


    }
}
