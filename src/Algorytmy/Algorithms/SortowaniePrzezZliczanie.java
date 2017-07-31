package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

/**
 * Created by jake on 27.07.2017.
 */
public class SortowaniePrzezZliczanie extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Sortowanie przez zliczanie";
    }

    @Override
    public void runAlgorithm(String[] input)
    {
        int n = input.length - 2; //pobieramy sobie długość ciągu jaki mamy posortować
        int max = Integer.parseInt(input[1]) + 1; //jako pierwszy agrument po nazwie algorytmu dany jest element maksymalny !!!!!!!!!!!DLACZEGO JEST +1
        int[] tabSparsowanychWejscia = new int[n]; //tworzymy nową tablicę, do której sparsujemy nasz wejściowy ciąg do posortowania

        for (int i = 0; i < n; i++)
        {
            tabSparsowanychWejscia[i] = Integer.parseInt(input[i+2]); //parsujemy po kolei wszystkie liczby
            //pobieramy z input wartości przesunięte o 2, ponieważ
            //pod input[0] siedzi nazwa alg, input[1] element maksymalny
            //więc +2 (rozpoczynamy iteracje od 0)
        }

        int[] tablicaDoZliacznia = new int[max]; //tworzymy sobie nową tablicę, która nam posłuży do zliczania
        //kolejnych elementów
        for (int i = 0; i < tabSparsowanychWejscia.length; i++ ) //przechodzimy po każdej liczbie którą chcemy zliczyć
        {
            int liczba = tabSparsowanychWejscia[i]; //pobieramy sobie tą liczbę
            tablicaDoZliacznia[liczba]++; //odwołujemy się do jej indeksu tablicy i zwiększamy o 1 wartość, \
            // która się kryje pod tym indeksem
        }

        for(int indeksTablicy = 0; indeksTablicy < tablicaDoZliacznia.length; indeksTablicy++) //przechodzimy po całej tablicy
            //służącej nam do zliczania
        {
            if(tablicaDoZliacznia[indeksTablicy] > 0) //Rozpatrujemy tylko przypadki, gdzie wystąpiły jakieś liczby
                for(int ileLiczb = tablicaDoZliacznia[indeksTablicy]; ileLiczb > 0; ileLiczb--)
                //pobieramy liczbę wystąpień danej liczby, a następnie zmniejszamy ją do 1 aż osiągnie 0 za każdym
                    //razem ją drukując
                {

                    System.out.printf("%d ", indeksTablicy); //drukujemy liczbę
                }
        }
    }
}
