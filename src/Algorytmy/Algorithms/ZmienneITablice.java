package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class ZmienneITablice extends AbstractAlgorithm  {
    @Override
    public String getName() {
        return "Tablice i zmienne";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int tablicaLiczb[] = new int[input.length-1];

        for (int i = 0; i < tablicaLiczb.length; i++) {
            tablicaLiczb[i] = Integer.parseInt(input[i+1]);
        }

        for (int i = 0; i < tablicaLiczb.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (tablicaLiczb[i] == tablicaLiczb [j]) {
                    System.out.printf("Powtarza sie element %d na indeksie i = %d, j = %d", tablicaLiczb[i], i, j);
                    return;
                }

                if (tablicaLiczb[i] != tablicaLiczb [j]) {
                    System.out.printf("Tablica nie ma powtarzajacych sie elementow.");
                    return;
                }


            }

        }

    }
}
