package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;
import com.sun.org.apache.xpath.internal.SourceTree;

public class CyfrySilni extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Cyfry dziesiątek i jedności w silni:";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int n = Integer.parseInt(input[1]);
        System.out.println("Dla n = " + n);
        System.out.println("Cyfry dziesiątek i jedności to:");

        switch (n) {
            case 1:
                System.out.println("0 1");
                break;
            case 2:
                System.out.println("0 2");
                break;
            case 3:
                System.out.println("0 6");
                break;
            case 4:
                System.out.println("2 4");
                break;
            case 5:
            case 6:
            case 8:
                System.out.println("2 0");
                break;
            case 7:
                System.out.println("4 0");
                break;
            case 9:
                System.out.println("8 0");
                break;
            case 10:
                System.out.println("0 0");
                break;

                default:
                System.out.println("0 0");






        }

    }
}
