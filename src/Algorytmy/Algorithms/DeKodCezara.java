package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

/**
 * Created by RENT on 2017-07-25.
 */
public class DeKodCezara extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        for(int KodCounter = 1; KodCounter<input.length; KodCounter++) {

            String kod = (input [KodCounter]).toLowerCase();

            char[] lettersInWord = kod.toCharArray();

            for (int i = 0 ; i< lettersInWord.length; i++) {
                char letter = kod.charAt(i);
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
