package Struktury;

public class Kopiec {

    int _counter;           //DEKLARUJEMY ZMIENNE ZEBY MIEC DOSTEP W CALEJ KLASIE
    int _data[];
    public Kopiec(int n) {
         _counter = 0;
         _data = new int[n];
    }

    public void addElement (int newElement) {

        int i = _counter++;
        int father = Math.floorDiv(i-1,2); //OBLICZAMY POZYCJE OJCA

        while (i>0 &&  _data[father] < newElement) {    //PETLA PRZESUWA DODAWANY ELEMENT W ODPOWIEDNIE MIEJSCE
             _data[i] =  _data[father]; //ZAMIANA MIEJSC OJCA Z SYNEM
             i = father;
             father = Math.floorDiv(i-1,2);

        }
        _data[i] = newElement; //ZAPISUJEMY NOWY ELEMENY W ODPOWIEDNIM MIEJSU



    }

    public void printAllElements()
    {
        for(int i = 0; i < _counter; i++){
            System.out.printf("%d ", _data[i]);
        }
        System.out.println();
    }

//  DODAC METODE DO USUWANIA, POSORTOWAC KOPIEC

//    public void removeElement () {
//        int i = _counter
//    }


}
