package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class MinMax extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Wyszukiwanie min i max";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = (input.length-1);
        int[] tablicaLiczb = new int[n];

        for (int i = 0; i < tablicaLiczb.length; i++) {
            tablicaLiczb[i] = Integer.parseInt(input[i + 1]);
        }
        int min = 0;
        int max = 0;

        for (int i=0; i < tablicaLiczb.length; i++) {
            if (tablicaLiczb[i] < tablicaLiczb[min])
                min = i;
            if (tablicaLiczb[i] > tablicaLiczb[max])
                max = i;


        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

        }

    }

