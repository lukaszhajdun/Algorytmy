package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class NajwiekszyWspolnyDzielnik extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Najwiekszy wspolny dzielnik";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int k = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        System.out.println("Dla liczb " + k + " i " + n + " NWD to " + nwd(k, n));
    }

    private int nwd(int k, int n) {
        if (k == 0)
            return n;
        else
            return nwd(n % k, k);
    }


}

