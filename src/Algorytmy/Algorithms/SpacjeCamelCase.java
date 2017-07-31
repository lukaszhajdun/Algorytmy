package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class SpacjeCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Spacje Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int letters = 0;
        for (int wordsCounter = 1; wordsCounter < input.length; wordsCounter++) {
            String word = input[wordsCounter];
            char[] lettersInWord = word.toCharArray();


            System.out.println(lettersInWord);


//            for (int lettersCounter = 0; lettersCounter < lettersInWord.length; lettersCounter++) {
//                if ( letters == 0) {
//                    System.out.printf(Character.toString(word.charAt(lettersCounter)).toUpperCase());
//                } else {
//                    System.out.printf(Character.toString(word.charAt(lettersCounter)).toLowerCase());
//                }
//                letters++;
//            }

        }
    }
}
