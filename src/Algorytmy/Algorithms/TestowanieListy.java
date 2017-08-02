package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;
import Struktury.mList;


public class TestowanieListy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Testujemy liste";
    }

    @Override
    public void runAlgorithm(String[] input) {
        mList lista = new mList();

        lista.addElementAtBeginning(14, lista);
//        lista.addElementAtBeginning(26, lista);
//        lista.addElementAtBeginning(25, lista);
//        lista.addElementBeforeElement(45,14, lista);
        lista.printAllElements(lista);


    }
}
