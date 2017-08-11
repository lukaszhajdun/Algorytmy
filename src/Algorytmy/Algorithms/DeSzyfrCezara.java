package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class DeSzyfrCezara extends AbstractAlgorithm{


    @Override
    public String getName() {
        return "Deszyfr Cezara";
    }

    String[] _letters = {"a","b,","c","d","e","f","g","h","i","j","k"
            ,"l","m","n","o","p","r","s","t","u","w","x","y","z"};

    @Override
    public void runAlgorithm(String[] input) {
        for (int words = 1; words < input.length; words++) {
            String word = input[words].toLowerCase();
            char lettersInWord[] = word.toCharArray();


            for (int letter = 0; letter < lettersInWord.length; letter++) {
                int position = getLetterPosition(Character.toString(lettersInWord[letter]));
                int lettersSize = _letters.length;
                int move = ((position + (lettersSize-3)) % _letters.length); //OD ROZMIARU TABLICY LETTERS ODEJMUJE 3 JEST 21
                System.out.printf("%s", _letters[move]);


            }
            System.out.print(" ");
        }
    }


    private int getLetterPosition(String letter) {
        for (int i = 0 ; i < _letters.length; i++)  {
            if (letter.equals(_letters[i])) {
                return i;
            }
        }
        return -1;
    }
}
