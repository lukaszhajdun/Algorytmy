package Algorytmy;

import Algorytmy.Algorithms.Test;

public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()) {
            case "test":
                return new Test();
            case "biednycamelcase":
                return new BiednyCamelCase();

            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }

}
