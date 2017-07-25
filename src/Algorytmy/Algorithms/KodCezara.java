package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;


public class KodCezara extends AbstractAlgorithm{


    @Override
    public String getName() {
        return "Kod Cezara";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for(int wordCounter = 1; wordCounter<input.length; wordCounter++) {

            String word = (input [wordCounter]).toUpperCase();

            char[] lettersInWord = word.toCharArray();

            for (int i = 0 ; i< lettersInWord.length; i++) {
                char letter = word.charAt(i);
                if (letter >= 'A' && letter < 'X') {
                    letter +=3;


                } else {
                    if (letter == 'X') {
                        letter = 'A';
                    }
                    if (letter == 'Y') {
                        letter = 'B';
                    }
                    if (letter == 'Z') {
                        letter = 'C';
                    }

                }
                System.out.print(letter);



            }
            System.out.print(" ");




        }

    }
}
