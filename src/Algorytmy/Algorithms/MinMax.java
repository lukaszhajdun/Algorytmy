package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class MinMax extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Wyszukiwanie min i max";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] tablica = new int[Integer.parseInt(input[1])]; // długość tablicy

        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = Integer.parseInt(input[i + 2]);
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            if (tablica[i] < max) {
                max = i;            }




                if (tablica[i] > min) {
                    min = i;


                }






        }

    }
}
