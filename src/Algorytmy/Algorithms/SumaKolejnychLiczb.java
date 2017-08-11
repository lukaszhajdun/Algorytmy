package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class SumaKolejnychLiczb extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Suma kolejnych liczb:";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println("Dla n = " + n);
        System.out.print("Suma = ");
        System.out.println(suma(n));
    }
        private int suma(int n) {
        if (n < 2)
            return 1;

            return n + suma(n-1);

    }


}
