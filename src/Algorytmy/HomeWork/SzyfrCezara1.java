package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;

public class SzyfrCezara1 extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Szyfr Cezara";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for (int wordCounter = 1; wordCounter < input.length; wordCounter++) {

            String word = (input[wordCounter]).toUpperCase();
            String alfabet = "ABCDEFGHIJKLMNOPRSTUWXYZ";

            char[] lettersInWord = word.toCharArray();
            literkiAlfabetu = alfabet.toCharArray();

            for (int i = 0; i < lettersInWord.length; i++) {
                int pozycja = letterposition(lettersInWord[i]);
                System.out.printf("%s", literkiAlfabetu[(pozycja+3)%literkiAlfabetu.length]);
            }
        }
    }

    char[] literkiAlfabetu;

    private int letterposition (char letter) {
        for (int i=0; i < literkiAlfabetu.length; i++) {
            if (letter == literkiAlfabetu[i]) {
                return i;
            }
        }
        return -1;
    }
}

