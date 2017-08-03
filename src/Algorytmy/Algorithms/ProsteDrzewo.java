package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

/**
 * Created by jake on 02.08.2017.
 */
public class ProsteDrzewo extends AbstractAlgorithm {


    @Override
    public String getName() {
        return "Proste drzewo";
    }

    String _tree[]; //Prywatna tablica (pole), które będzie przechowywać nasze drzewo
    int _level; //Prywatne pole, króre przechowuje poziom drzewa
    int _height; //Prywatne pole, które przechowuje wysokość drzewa

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length - 1; //ustawaim wielkość drzewa
        getLevel(n); //Metoda ustawia wysokość i poziom drzewa
        _tree = new String[n]; //Wcześniej zadeklarowałem pole drzewo, w tym momencie
        //ustawiam wskaźnik na świeżo utworzoną tablicę

        for(int i = 0; i < n; i++) //przepisuje elementy do drzewa
        {
            _tree[i] = input[i+1];
        }

        System.out.printf("Poziom drzewa: %d\n", _level);
        System.out.printf("Wysokość drzewa: %d\n", _height);

        System.out.printf("Korzeniem jest: %s\n", _tree[0]); //Z definicji drzewa korzeń musi być zapisany w 0

        for(int j = 0; j < _tree.length; j++) //Iterujemy przez całą tablicę i sprawdzamy przy pomocy try-catch
            //czy dany węzeł (element) posiada lewego syna. Jeżeli wyjdziemy poza zakres tablicy
            //czyli węzeł nie ma liścia, bo musiłaby być to element który nie istnieje
            //to przechwyujemy wyjątek i zamiast blokować program wyświetlamy informacje, że ten węzeł nie ma
            //dzieci - jest liściem
        {
            String elementLewy = "";
            String element = "";
            try
            {
                element = _tree[j];
                elementLewy = _tree[2*j+1];
            }
            catch (Exception ex)
            {
                System.out.println("Element " + element+ " jest liściem\n");
            }
        }

        getSons("A"); //Metoda służy do wyświetlania synów elementu, który został podany jako argument
        getSons("E");

    }

    private void getLevel(int n){
        //Metoda będzie w pętli wyliczać rozmiar i porównywać czy ilość elemementów, które się
        //zmieszczą na konkretnym drzewie po dodaniu poziomu jest wystarczająca w stosunku do ilości elementów, które
        //wprowadzamy (parametr n to liczba elementów). Jeżeli jest ona mniejsza wówczas jeszcze raz wchodzimy do pętli
        //i poszerzamy drzewo i ilość elementów odpowiadających kolejnemu poziomowi.
        int currentSize = 0;
        int iterator = 0;
        while(currentSize < n){
            currentSize = currentSize + (int)Math.pow(2d, (double)iterator); //kolejny poziom
            //ma rozmiar 2^k.
            if(currentSize < n){
                iterator++;
            }
        }
        _level = _height = iterator;
    }

    private void getSons(String father)
    {
        int i = 0;
        for (i = 0; i < _tree.length; i++){
            if(_tree[i].equals(father)) //Przeszukujemy tablicę i sprawdzamy pod którym indeksem jest trzymany
                //nasz element, któremu chcemy znaleźć synów
                break;
        }

        try{
            System.out.printf("Lewym synem elementu %s jest: %s\n",_tree[i], _tree[2*i+1]);
            //Próbujemy wyświetlić element, który zgodnie ze wzorem ma być lewym synem znalezionego elementu
            //Jeżeli nam się nie uda, ponieważ odwołaliśmy się do elementu tablicy, który nie istnieje
            //wyświetlimy wyjątek, że dany element nie posiada lewego syna
        }
        catch (Exception ex){
            System.out.printf("Element %s nie posiada lewego syna - jest liściem\n", _tree[i]);
        }

        try{
            System.out.printf("Prawym synem elementu %s jest: %s\n",_tree[i], _tree[2*i+2]);
            //Próbujemy wyświetlić element, który zgodnie ze wzorem ma być prawym synem znalezionego elementu
            //Jeżeli nam się nie uda, ponieważ odwołaliśmy się do elementu tablicy, który nie istnieje
            //wyświetlimy wyjątek, że dany element nie posiada prawego syna
        }
        catch(Exception ex){
            System.out.printf("Element %s nie posiada prawego syna\n", _tree[i]);

        }
    }
}
