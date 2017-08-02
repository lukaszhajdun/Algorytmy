package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class DzienTygodnia extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Dzien tygodnia";

    }

    String[] _weekend = {"Pn", "Wt", "Sr", "Cz", "Pt", "Sb", "Nd"};


    @Override
    public void runAlgorithm(String[] input) {

        String myDay = input[1];
        int moveNumber = Integer.parseInt(input[2]);
        int nextDay;

        for (int i = 0; i < _weekend.length; i++) {
            if (myDay.equals(_weekend[i])) {
                nextDay = (i+ moveNumber)%_weekend.length;
                System.out.printf("%s", _weekend[nextDay]);


            }

        }
    }
}

