package Algorytmy;

import Algorytmy.Algorithms.*;

public class AlgorithmFactory {
    public AbstractAlgorithm getAlgorithm(String name) throws Exception {
        switch (name.toLowerCase()) {
            case "test":
                return new Test();

            case "biednycamelcase1":
                return new BiednyCamelCase1();

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

            case "ciagfibonacciego":
                return new CiagFibonacciego();

            case "szyfrcezara1":
                return new SzyfrCezara1();

            case "szyfrcezara":
                return new SzyfrCezara();

            case "sortowaniebabelkowe1":
                return new SortowanieBabelkowe1();

            case "sortowaniebabelkowe":
                return new SortowanieBabelkowe();

            case "sortowaniewzgledempunktu":
                return new SortowanieWzgledemPunktu();

            case "sortowanieprzezzliczanie":
                return new SortowaniePrzezZliczanie();

            case "nwd":
                return new NajwiekszyWspolnyDzielnik();

            case "planszawarcaby":
                return new PlanszaWarcaby();

            default:
                throw new Exception("Nie ma takiego algorytmu");
        }
    }

}
