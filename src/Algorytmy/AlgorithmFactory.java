package Algorytmy;

import Algorytmy.Algorithms.*;

public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()) {
            case "test":
                return new Test();

            case "biednycamelcase":
                return new BiednyCamelCase();

            case "sumowanieliczbnaturlnych":
                return new SumowanieLiczbNaturalnych();

            case "sumapodanychliczb":
                return new SumaPodanychLiczb();

            case "wyplacaniekasy":
                return new WyplacanieKasy();

            case "kodcezara":
                return new KodCezara();

            case "silnia":
                return new Silnia();

            case "sumakolejnychliczb":
                return new SumaKolejnychLiczb();

            case "cyfrysilni":
                return new CyfrySilni();

            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }

}
