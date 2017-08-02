package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

public class ProsteDrzewo extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Proste drzewo";
    }

    String _tree[]; //Wskaznik drzewa
    int _level;
    int _height;

    @Override
    public void runAlgorithm(String[] input) {
        int n = input.length-1; //Rozmiar bez tytulu
        _tree = new String[getArraySize(n)]; //Przypisujemy drzewo do wskaznika i ustalamy wielkosc za pomoca getArraySize
        int i; //Tworzymy wczesniej iterator, zeby zachowac wartosc

        for (i =0; i < n ; i++) {
            _tree[i] = input[i+1];
        }
        for (int j = i; j < _tree.length; j++) {
            _tree[j] = "AA";
        }

        System.out.printf("Poziom drzewa: %d\n", _level);
        System.out.printf("Wysokosc drzewa: %d\n", _height);

        System.out.printf("Korzeniem jest: %s\n", _tree[0]);

        for (int j=0; j<_tree.length; j++) { //Jedziemy po calej tablicy _tree
            String elementLewy = "";     //Syn lewy
//            String elementPrawy;    //Syn prawy nie jest potrzebny
            String element = "";         //Ojciec
            try {
                element = _tree[j];

                elementLewy = _tree[2*j+1];
//                elementPrawy = _tree[2*j+2];
            }
            catch (Exception ex){
                System.out.println("Element " + element + " jest liściem");
            }
        }
        getSons("A");
        getSons("E");

    }

    private int getArraySize(int n){
        int currentSize = 0;
        int iterator = 0;
        while (currentSize < n) {
            currentSize = currentSize + (int) Math.pow(2d, (double)iterator); //Wyliczamy rozmiar tablicy
            iterator++;
        }
        _level = iterator - 1; // Poziom drzewa, od iteratora odejmujemy 1
        _height = iterator -1; // Wysokość drzewa
        return currentSize; //Zwaracamy rozmiar tablicy po zakonczeniu petli
    }

    private void getSons (String father)
    {
        int i =0;
        for (i=0; i < _tree.length; i++) {
            if (_tree[i].equals(father))
                break;
        }

        try {
            System.out.printf("Lewym synem "+ "elementu %s jest: %s\n", _tree[i], _tree[2*i+1]);
            System.out.printf("Prawym synem "+ "elementu %s jest: %s\n", _tree[i], _tree[2*i+2]);
        }
        catch (Exception ex) {
            System.out.printf("Element %s nie posiada syna", _tree[i]);
        }
    }
}
