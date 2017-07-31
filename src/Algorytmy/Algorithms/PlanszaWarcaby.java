package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

/**
 * Created by jake on 28.07.2017.
 */
public class PlanszaWarcaby extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Plansza od warcab";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int m = Integer.parseInt(input[1]);
        int n = Integer.parseInt(input[2]);
        String kolor = input[3];
        int licznik = 0;

        if(kolor.equals("B")) {
            licznik = 1;
        }
        String[][] plansza = new String[m][n];

        for(int wiersz = 0; wiersz < m; wiersz++){
            for(int kolumna = 0; kolumna < n; kolumna++){

                if (wiersz == 0 && kolumna == 0)
                    plansza[wiersz][kolumna] = kolor;

                else if(kolumna==0) {
                    if(plansza[wiersz-1][kolumna].equals("B")) {
                        plansza[wiersz][kolumna] = "C";
                        licznik = 0;
                    } else {
                        plansza[wiersz][kolumna] = "B";
                        licznik = 1;
                    }
                }else {
                    if(licznik % 2==0) {
                        plansza[wiersz][kolumna] = "C";
                    } else{
                        plansza[wiersz][kolumna] = "B";
                    }
                }
                licznik++;
            }
        }
        for(int i= 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + plansza[i][j]);
            }
            System.out.printf("\n");

        }
    }
}