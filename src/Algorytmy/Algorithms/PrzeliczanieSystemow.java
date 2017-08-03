package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

import java.util.Stack;

public class PrzeliczanieSystemow extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Przeliczanie systemow";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<Integer> stosCyfr = new Stack<>();
        int liczbaDoZmiany = Integer.parseInt(input[1]);
        int podstawa = Integer.parseInt(input[2]);

        while (liczbaDoZmiany > 0) {
            stosCyfr.push(liczbaDoZmiany % podstawa);
            liczbaDoZmiany = Math.floorDiv(liczbaDoZmiany, podstawa);

        }

        while (!stosCyfr.empty()) {
            stosCyfr.peek();

            System.out.printf("%d", stosCyfr.peek());
            stosCyfr.pop();


        }

        }


    }

