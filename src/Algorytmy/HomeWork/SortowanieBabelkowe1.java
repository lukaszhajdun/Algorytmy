package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;

public class SortowanieBabelkowe1 extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sortowanie babelkowe";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int[] inputTab = new int[input.length-1];


        for (int i=0; i < inputTab.length; i++) {

            inputTab[i] = Integer.parseInt(input[i+1]);
        }

        for(int i=0; i < inputTab.length;i++)

            for (int j = 0; j < (inputTab.length - 1); j++) {

            if (inputTab[j] > inputTab[j + 1]) {
                int temp = inputTab[j];
                inputTab[j] = inputTab [j+1];
                inputTab[j+1] = temp;




            }





            }
        for(int i = 0; i < inputTab.length; i++)
            System.out.print(inputTab[i] + " ");


        }
        }

