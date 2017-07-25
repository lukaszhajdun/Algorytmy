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

            String word = input [wordCounter];

            char[] lettersInWord = word.toCharArray();
            int length = lettersInWord.length;
            for (int i = 0 ; i< lettersInWord.length; i++) {
                char letter = word.charAt(i);
                if (letter >= 'a' && letter<= 'x') {
                    letter +=2;


                } else {
                    if (letter == 'x') {
                        letter = 'a';
                    }
                    if (letter == 'y') {
                        letter = 'b';
                    }
                    if (letter == 'z') {
                        letter = 'c';
                    }
                }
                System.out.println(letter);



            }
            System.out.println(word);




        }

    }
}
