package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;
import Struktury.KopiecKuba;

public class TestowanieKopcaKuby extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Testowanie kopca Kuby";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length -1;
        KopiecKuba kopiec = new KopiecKuba(n);

        for (int i=1; i <input.length; i++) {
            int newElement = Integer.parseInt(input[i]);
            kopiec.addNewElement(newElement);
        }

        kopiec.printAllElements();

        kopiec.sort();

    }
}
