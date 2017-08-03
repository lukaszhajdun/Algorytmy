package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;

public class SpacjeCamelCaseOdwrotnosc extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Spacje Camel Case Odwrotnosc";
    }

    @Override
    public void runAlgorithm(String[] input) {
        String sms = input[1].toString();
        System.out.println(sms);
        char[] znaki = sms.toCharArray();
        Character separator;
        Character reszta;

        for (int i = 0; i < znaki.length; i++) {
            if (znaki[i] <= 'Z' && znaki[i] >= 'A') {

                separator = znaki[i];

                System.out.print(" ");
                System.out.print(separator);
            } else {
                reszta = znaki[i];
                System.out.print(reszta);
            }

        }

    }
}