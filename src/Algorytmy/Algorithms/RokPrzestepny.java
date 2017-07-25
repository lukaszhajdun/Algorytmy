package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class RokPrzestepny extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Rok przestępny";
    }

    @Override
    public void runAlgorithm(String[] input) {
        for(int i = 1; i<input.length; i++){
            int rok = Integer.parseInt(input[i]); //do zmiennej rok przypisuje sparsowany rok
            if(((rok % 4 == 0) && (rok % 100 != 0)) || (rok % 400 == 0)){
                System.out.printf("%d jest przestępny\n", rok);
            }
            else{
                System.out.printf("%d nie jest przestępny\n", rok);
            }
        }
    }
}
