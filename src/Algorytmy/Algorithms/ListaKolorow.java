package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

import java.util.ArrayList;

public class ListaKolorow extends AbstractAlgorithm{

    @Override
    public String getName() {
        return "Lista kolorow";
    }

    @Override
    public void runAlgorithm(String[] input) {
        ArrayList<String> listaKolorow = new ArrayList<String>();
        listaKolorow.add("niebieski");
        listaKolorow.add("czarny");
        listaKolorow.add("zolty");
        listaKolorow.add("fioletowy");

        listaKolorow.add(0,"rozowy");
        listaKolorow.add(listaKolorow.size(),"zielony");

        for(String element: listaKolorow) {
            System.out.println(element);
        }


    }
}
