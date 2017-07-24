package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

/**
 * Created by RENT on 2017-07-24.
 */
public class SumaPodanychLiczb extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Suma podanych liczb naturalnych";
    }

    @Override
    public void runAlgorithm(String[] input) {
        System.out.println("Suma podanych liczb naturalnych");



        int sumaLiczb = 0;
        for (int i = 1; i < input.length; i++) {

            sumaLiczb += Integer.parseInt(input[i]);


        }
        System.out.println("Suma podanych liczb to " + sumaLiczb);



    }
}
