package Struktury;

/**
 * Created by jake on 03.08.2017.
 */
public class KopiecKuba {
    int[] _data;
    int _counter;
    public KopiecKuba(int size) //Konstruktor będzie odpowiadać za utworzenie potrzebnych pól
            //i nadanie im odpowiedniej wartości
    {
        _data = new int[size];
        _counter = 0;
    }

    public void addNewElement(int newElement){
        int i = _counter++; //Ustawiamy indeks na pozycje wstawianego elementu od razu zwiększając licznik

        int parent = (i-1) / 2; //Obliczamy indeks rodzica

        while (i > 0 && _data[parent] < newElement) //warunek kopca - dopóki nie doszliśmy do korzenia
        //i jesteśmy więksi od potencjalnego rodzica
        {
            //Zamiana
            _data[i] = _data[parent]; //umieszczamy ojca na miejscu syna
            i = parent; //przensimy się na pozycję ojca
            parent = (i-1) / 2; //obliczamy indeks ojca
        }
        _data[i] = newElement; //Wstawiamy element kopca
    }

    public int deleteRoot(){
        int root = -1;
        int lastElement = -1;
        int i = 0; //iterator, któy posłuży do przeszukiwania kopca zaczynając od korzenia
        int j = 0; //pozycja elementu większego, aby było wiadomo jak zamienić

        if(_counter-- > 0) //Sprawdzamy czy możemy cokolwiek usunąć jednocześnie zmniejszając licznik
        {
            root = _data[0];
            lastElement = _data[_counter]; //zapamiętujemy ostatni element kopca
            i = 0; //przeszukiwanie drzewa rozpoczynamy od korzenia
            j = 1; //wskazujemy w którym miejscu w tablicy znajduje się lewy syn

            while (j < _counter) //dopóki uda nam się odnaleźć lewego syna idziemy w dół kopca
            {
                if(j+1 < _counter && _data[j+1] > _data[j]) //szukamy większego syna
                {
                    j = j+1;
                }
                if(lastElement >= _data[j]) //jeśli warunek kopca spełniony, wychodzimy z pętli
                    break;
                else {
                    //Zamiana
                    _data[i] = _data[j]; //kopiujemy większego syna do ojca
                    i = j; //przechodzimy na pozycję większego syna
                    j = 2 * j + 1; //j wskazuje lewego syna
                }
            }

            _data[i] = lastElement; //w odpowiednim miejscu umieszczamy ostatni element, aby zachowany był
            //warunek kopca
        }
        return root;
    }

    public void sort()
    {
        int size = _counter; //pobieram sobie rozmiar kopca
        int[] sort = new int[_counter]; //tworzę tablice, która posłuży mi do sortowania
        for(int i = _counter-1 ; i >= 0; i--){
            sort[i] = deleteRoot(); //kasuje korzeń i jednocześnie zapisuje sobie jego wartość na ostatnim wolnym
            //miejscu tablicy
        }

        for(int i = 0; i < size; i++){
            System.out.printf("%d ", sort[i]);
        }
    }

    public void printAllElements()
    {
        for(int i = 0; i < _counter; i++){
            System.out.printf("%d ", _data[i]);
        }
        System.out.printf("\n");
    }

    public int getAmountOfElements(){
        return _counter; //Zwracamy sobie liczbę elementów
    }

}