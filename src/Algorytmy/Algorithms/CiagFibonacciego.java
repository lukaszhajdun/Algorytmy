package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

import java.lang.invoke.SwitchPoint;

/**
 * Created by RENT on 2017-07-25.
 */
public class CiagFibonacciego extends AbstractAlgorithm{
    @Override
    public String getName() {
        return "Ciąg Fibonacciego";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println(Fib(n));


    }

    private int Fib(int n){
        switch (n) {
            case 0:
                return 0;

            case 1:
                return 1;


            default:
               return Fib(n-1) + Fib(n-2);


        }
    }
}
