package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class SortowanieWzgledemPunktu extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Sortowanie względem punktu";
    }

    @Override
    public void runAlgorithm(String[] input) {
        //WYWOŁANIE: sortowaniewzgledempunktu 3 1 0 0 3 5 5 2 1 -1

        int n = Integer.parseInt(input[1]); //pierwsza liczba po nazwie algorytmu oznacza liczbę przypadków testowych
        int tablicaPunktow[][] = new int[n][3]; //tworzymy nową tablicę dwuwymiarową. Możemy wyobrazić ją sobie jak
        //pole do gry w statki o rozmiarze n x 3, które będziemy uzupełniać danymi

        int iterator = 2; //posłuży nam do przechodzenia po inpucie
        for(int i = 0; i < n; i++) // idziemy po wszystkich przypadkach testowych
        {
            for(int j=0; j < 3; j++) //a na każdy przypadek testowy składają się trzy liczby
            {
                tablicaPunktow[i][j] = Integer.parseInt(input[iterator]);
                //Tablica dwuwymiarowa składa się z wierszy i kolumn
                //tablicaPunktow[wiersze][kolumny]
                //chcemy zapisać pojedynczy przypadek punktu w pojedynczym wierszu
                //tablicaPunktow[przypadek testowy][0] przechowuje numer przypadku
                //tablicaPunktow[przypadek testowy][1] przechowuje wartość x
                //tablicaPunktow[przypadek testowy][2] przechowuje wartość y

                iterator++; //po każdym przejśćiu pętli zwiększamy iterator, aby
                //odczytać kolejną wartość do sparsowania z input
            }
        }

        int tablicaWynikow[][] = new int[n][2]; //tworzę dwuwymiarową tablicę na przechowywanie wyników
        //ma ona rozmiar n x 2
        //tablicaWynikow[przypadek testowy][0] przechowuje numer przypadku
        //tablicaWynikow[przypadek testowy][1] przechowuje wyliczony wynik dla przypadku


        for(int i = 0; i < n; i++) //dla każdego przypadku testowego wyliczamy odległość względem punktu (0,0)
        {
            tablicaWynikow[i][0] = tablicaPunktow[i][0]; //zapisujemy numer punktu do tablicy z wynikami
            double x = Math.pow((double)tablicaPunktow[i][1], 2d); //liczymy x do kwadratu
            double y = Math.pow((double)tablicaPunktow[i][2], 2d); //liczymy y do kwadratu
            double sqrt = Math.sqrt(x+y); //liczymy pierwiastek
            int round = (int)Math.round(sqrt); //zaokrąglamy i rzutujemy do int
            tablicaWynikow[i][1] = round; //przypisujemy wynik do przypadku, który rozpatrujemy w tablicy wyników
        }


        //Przeprowadzamy sortowanie bąbelkowe
        for(int i =0; i < n; i++) //Rozpoczynamy przeglądanie od początku tablicy wyników, naszym ograniczeniem
            //jest liczba przypadków testowych, które rozpatrujemy
        {
            for (int j =0; j < n-1; j++) //Za każdym razem rozpoczynamy przeglądanie tablicy wartości od początku
            {
                if(tablicaWynikow[j][1] > tablicaWynikow[j+1][1]) //sortujemy po wyniku,
                    //sortowanie po tablicaWynikow[j][0] sprawiłoby, że posortowalibyśmy
                    //rosnąco numery punktów, a nie wyniki
                {
                    //SWAP
                    int temp[] = new int[2]; //tworzymy sobie tymczasową tablicę, aby w niej przechowywać
                    // tymczasowo wartości do przenoszenia - reszta algorytmu działa analogicznie dla swapa
                    // ze zwykłego sortowania bąbelkowego
                    temp[0] = tablicaWynikow[j][0];
                    temp[1] = tablicaWynikow[j][1];

                    tablicaWynikow[j][0] = tablicaWynikow[j+1][0];
                    tablicaWynikow[j][1] = tablicaWynikow[j+1][1];

                    tablicaWynikow[j+1][0] = temp[0];
                    tablicaWynikow[j+1][1] = temp[1];
                }
            }
        }

        for(int i=0; i < n; i++)//przechodzimy po wszystkich przypadkach testowych
        {
            int punkt = tablicaWynikow[i][0]; //zapisujemy sobie numerek punktu
            for(int j=0; j<n; j++) //przeszukujemy tablicePunktow, aby znaleźć numer punktu, który odpowaida temu,
                //który obecnie mamy zapisany w zmiennej punkt -> przeszukiwanie tablicy
            {
                if(punkt == tablicaPunktow[j][0]) //jeżeli udało nam się odnaleźć przypadek na podstawie numeru punktu
                    System.out.printf("Punkt: %d; X: %d; Y: %d\n",
                            punkt, tablicaPunktow[j][1], tablicaPunktow[j][2]); //drukujemy rozwiązanie
            }
        }
    }
}
