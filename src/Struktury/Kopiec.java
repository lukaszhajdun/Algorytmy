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

    public int deleteKorzen(){
        int korzen = 0;
        int i;
        int lewySyn;
        int ostatniElement;                         //OSTATNI ELEMENT KOPCA

        if(_counter-- > 0) {

            korzen = _data[0];
            ostatniElement = _data[_counter];
            i = 0;
            lewySyn = 1;

            while (lewySyn < _counter) {            //IDZIEMY W DOL KOPCA SZUKAJAC WIEKSZEGO SYNA
                if ((lewySyn < _counter) && _data[lewySyn + 1] > _data[lewySyn]) {
                    lewySyn = (lewySyn + 1);
                }

                if (ostatniElement > _data[lewySyn]) //WARUNEK KOPCA ZGADZA SIE
                    break;

                else {
                    _data[i] = _data[lewySyn];      //ZAMIANA OJACA Z L. SYNEM
                    i=lewySyn;
                    lewySyn = 2 * lewySyn +1;
                }
            }
            _data[i] = ostatniElement;              //OSTATNI ELEMENT UMIESZACZAMY W PRAWIDLOWYM MIESJCU
        }

        return korzen;                              //ZWRACAMY KORZEN
    }

    public void sortowanie(){
        int size = _counter;
        int[] sort = new int[_counter];

        for (int i = _counter-1; i >=0; i--) {
            sort[i] = deleteKorzen();               //USUWANY KORZEN ZAPISUJEMY DO TABLICY
        }

        for (int i = 0; i< size; i++) {             //DURKUJEMY POSORTOWANE LICZBY
            System.out.printf("%d ", sort[i]);
        }
    }

    public void printAllElements()
    {
        for(int i = 0; i < _counter; i++){
            System.out.printf("%d ", _data[i]);
        }
        System.out.println();
    }
}
