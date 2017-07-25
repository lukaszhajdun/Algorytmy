package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

/**
 * Created by RENT on 2017-07-25.
 */
public class Silnia extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Liczenie silni: ";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println("Dla n = " + n);
        System.out.println("Silnia = " + Silnia(n));


    }

    private int Silnia(int n) {
        if (n < 2)
            return 1;

        return n * Silnia(n-1);
    }
}
