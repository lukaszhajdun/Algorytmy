package Algorytmy;

public abstract class AbstractAlgorithm {

    public AbstractAlgorithm () {
        System.out.printf("Konstruktor Abstract Algorithm");
    }

    public abstract String getName();
    public abstract void runAlgorithm(String [] input);

}
