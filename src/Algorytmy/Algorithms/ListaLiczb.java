package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

import java.util.ArrayList;

public class ListaLiczb extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Lista Liczb";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int toDelete = Integer.parseInt(input[1]);
        ArrayList<Integer> listaLiczb = new ArrayList<>();

        for (int i = 2 ; i < input.length; i++) {
            listaLiczb.add(Integer.parseInt(input[i]));
        }
        System.out.println(listaLiczb);

        for (int i = 0 ; i < listaLiczb.size(); i++) {
            listaLiczb.removeIf(s -> s == toDelete);
        }

        System.out.println(listaLiczb);
    }
}
