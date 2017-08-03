package Struktury;

/**
 * Created by jake on 03.08.2017.
 */
public class Kopiec {
    int[] _data;
    int _counter;
    public Kopiec(int size) //Konstruktor będzie odpowiadać za utworzenie potrzebnych pól
            //i nadanie im odpowiedniej wartości
    {
        _data = new int[size];
        _counter = 0;
    }

    public void addNewElement(int newElement){
        int i = _counter; //Ustawiamy indeks na pozycje wstawianego elementu
        int parent = Math.floorDiv(i-1, 2); //Obliczamy indeks rodzica

        while (i > 0 && _data[parent] < newElement) //warunek kopca - dopóki nie doszliśmy do korzenia
        //i jesteśmy więksi od potencjalnego rodzica
        {
            //Zamiana
            _data[i] = _data[parent]; //umieszczamy ojca na miejscu syna
            i = parent; //przensimy się na pozycję ojca
            parent = Math.floorDiv(i-1, 2); //obliczamy indeks ojca
        }
        _data[i] = newElement; //Wstawiamy element kopca
    }

}
