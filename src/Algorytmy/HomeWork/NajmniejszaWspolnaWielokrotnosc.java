package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;

public class NajmniejszaWspolnaWielokrotnosc extends AbstractAlgorithm {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public void runAlgorithm(String[] input) {
        int a = Integer.parseInt(input[1]);
        int b = Integer.parseInt(input[2]);
        int nww = (Integer)(a*b)/nwd(a,b);
        System.out.printf("Dla liczb " + a + " i " + b + " NWW to " + nww);
    }
    private int nwd (int a, int b) {
        if (a==0)
            return b;
        else {
            return nwd(b%a,a);
        }
    }
}

