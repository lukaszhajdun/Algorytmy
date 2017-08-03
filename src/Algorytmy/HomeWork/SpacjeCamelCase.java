package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;

public class SpacjeCamelCase extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Spacje Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {

        for (int wordsCounter = 1; wordsCounter < input.length; wordsCounter++) {
            String word = input[wordsCounter];
            char[] lettersInWord = word.toCharArray();

            char pierwsza = lettersInWord[0];
            System.out.print(Character.toString(pierwsza).toUpperCase());

            for (int lettersCounter = 1; lettersCounter < lettersInWord.length; lettersCounter++) {

                    System.out.printf(Character.toString(word.charAt(lettersCounter)).toLowerCase());
                }




            }
        }

    }
