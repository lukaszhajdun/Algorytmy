package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumowanieLiczbNaturalnych extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sumowanie liczb naturalnych";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        int sumaLiczbNaturalnych = 0;
        int i=1;



        while (i <= n) {
            sumaLiczbNaturalnych += i;
            System.out.println(i + "=" + sumaLiczbNaturalnych);
            i++;

        }
        System.out.println("Dla i = " + i + " Suma liczb naturalnych wynosi " + sumaLiczbNaturalnych);


    }
}
