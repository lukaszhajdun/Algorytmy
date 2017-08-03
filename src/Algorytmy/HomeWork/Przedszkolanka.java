package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;

/**
 * Created by Kroolik on 2017-08-03.
 */
public class Przedszkolanka extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Przedszkolanka";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int klasaA = Integer.parseInt(input[1]);
        int klasaB = Integer.parseInt(input[2]);

        int MinimalnaIloscCukierkow = (Integer) (klasaA * klasaB) / nwd(klasaB % klasaA, klasaA);
        System.out.printf("Nalezy kupic %d cukierków", MinimalnaIloscCukierkow);
    }

    private int nwd(int klasaA, int klasaB) {
        if (klasaA == 0)
            return klasaB;
        else {
            return nwd(klasaB % klasaA, klasaA);


        }
    }
}
