package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;
import com.sun.xml.internal.fastinfoset.util.CharArray;

public class BiednyCamelCase1 extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

        System.out.println("Algorytm Biedny Camel Case");

        int letters = 0;
        for (int wordsCounter = 1; wordsCounter < input.length; wordsCounter++) {
            String word = input[wordsCounter];
            char[] lettersInWord = word.toCharArray();
                for (int lettersCounter=0; lettersCounter < lettersInWord.length; lettersCounter++) {
                    if (letters % 2 ==0){
                        System.out.printf(Character.toString(word.charAt(lettersCounter)).toUpperCase());
                    } else {
                        System.out.printf(Character.toString(word.charAt(lettersCounter)).toLowerCase());
                    }
                    letters++;
                }
            System.out.println(" ");
        }
    }
}
