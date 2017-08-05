package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;

//ZAPYTAC JAK DANE MAJA WCHODZIC

public class BajtockieSwietoTrojkata extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Bajtockie swieto trojkata";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int iloscOsob;
        double srednieZuzycieKredy;       //kg na m2
        int bokA,bokB,bokC;                        // boki trojkata

        int iloscProb = Integer.parseInt(input[1]);

        for (int i = 0; i < input.length; i++){
            iloscOsob = Integer.parseInt(input[(5*i)+2]);
            srednieZuzycieKredy = Double.parseDouble(input[(5*i)+3]);

            bokA = Integer.parseInt(input[(5*i)+4]);
            bokB = Integer.parseInt(input[(5*i)+5]);
            bokC = Integer.parseInt(input[(5*i)+6]);



        }



    }
}
