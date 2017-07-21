package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class Test extends AbstractAlgorithm {

//    public Test () {
//        System.out.println("Konstruktor TEST");
//    }
    @Override
    public String getName() {
        return "Test";
    }

    @Override
    public void runAlgorithm(String[] input) {
        System.out.print("To jest algorytm testowy");
    }
}
