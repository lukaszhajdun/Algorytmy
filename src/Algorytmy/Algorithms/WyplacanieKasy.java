package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

import java.util.Arrays;

/**
 * Created by RENT on 2017-07-24.
 */
public class WyplacanieKasy extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Wyplacanie kasy";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int zlotowki = Integer.parseInt(input[1]);
        int grosze = Integer.parseInt(input[2]);

        int[] zl  = {200,100,50,20,10,5,2,1};
        int[] gr = {50, 20, 10, 5, 2, 1};

        int[] wydamybanknoty = {0,0,0,0,0,0,0,0};
        int[] wydamymonety = {0,0,0,0,0,0};

        while (zlotowki > 0) {
            for (int i = 0; i < zl.length;i++){
                if (zlotowki >= zl[i]){
                    zlotowki = zlotowki - zl[i];
                    wydamybanknoty[i]++;
                    break;
                }
            }

        }
        while (grosze > 0 ) {
            for (int i = 0; i < gr.length; i++) {
                if (grosze >= gr[i]) {
                    grosze = grosze - gr[i];
                    wydamymonety[i]++;
                    break;
                }
            }
        }

        System.out.println("Wydano banknoty: " + Arrays.toString(wydamybanknoty));
        System.out.println("Wydano monety: " + Arrays.toString(wydamymonety));
    }
}
