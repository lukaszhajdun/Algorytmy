package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;

public class Pesel extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "PESEL";
    }

    @Override
    public void runAlgorithm(String[] input) {

        int[] pesel = new int[input.length - 1];

        System.out.print("Podano: ");
        for (int i = 1; i < input.length; i++) {
            pesel[i - 1] = Integer.parseInt(input[i]);
            System.out.print(pesel[i - 1]);

        }
        System.out.println();
        if (pesel.length != 11) {
            System.out.println("PESEL nie jest poprawny");

        } else {

            int sumaLiczb = pesel[0] * 1 + pesel[1] * 3 + pesel[2] * 7 + pesel[3] * 9 + pesel[4] * 1 + pesel[5] * 3
                    + pesel[6] * 7 + pesel[7] * 9 + pesel[8] * 1 + pesel[9] * 3 + pesel[10] * 1;

            if (sumaLiczb % 10 == 0) {
                System.out.println("PESEL jest poprawny");
            } else {
                System.out.println("PESEL nie jest poprawny");
            }
        }

    }
}
