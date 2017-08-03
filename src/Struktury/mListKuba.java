package Struktury;


public class mListKuba {
    Element _head; //pole, które przechowuje głowę listy
    Element _tail; //pole, które przechowuje ogon listy
    int counter; //pole, które przechowuje licznik zliczający elementy

    public void goThroughListForward(mListKuba list) //metoda, która przechodzi po wszystkich elementach listy
    {
        Element p = list._head; //jako element pierwszy pobieramy sobie głowę listy
        while (p.next != null) //przechodzimy po każdym elemencie dopóki następnik wskazuje na inny element
        {
            //wykonujemy jakąś logikę
            p = p.next; //naszym nowym p staje się następnik
        }
    }

    //SEKCJA DODAWAWANIA NOWYCH ELEMENTÓW NA POCZĄTKU / KOŃCU LISTY
    public void addElementAtBeginning(int newElement, mListKuba list) //dodajemy nowy element na początku listy
    {
        Element p = new Element(); //tworzymy nowy element
        p.data = newElement; //zapisujemy wartość, którą chcemy dodać do pola data
        p.prev = null; //od razu ustawiamy wartość na null, ponieważ pierwszy element NIE może mieć poprzednika
        p.next = list._head; //następnikiem ustawiamy obecną głowę, ponieważ to był pierwszy dotychczasowy element
        list._head = p; //nowo utworzony obiekt staje się głową
        list.counter++; //zwiększamy licznik o 1

        if(p.next != null) //jeżeli mamy następnika
        {
            Element nextEl = p.next; //wówczas oznacza to, że wcześniej był elementem pierwszym, z tego wniosek, że
            //nie mógł mieć poprzednika, więc stawiamy mu nasz obiekt jako poprzednika
            nextEl.prev = p;
        }
        else{
            //jeżeli nasz nowo dodany element nie ma następnika (np. całkowicie nowa lista
            // i dodajemy pierwszy element to staje się on jednocześnie ostatnim elementem (ogonem)
            list._tail = p;
        }
    }

    public void addElementAtEnd(int newElement, mListKuba list) //dodajemy nowy element na końcu listy
    {
        Element p = new Element(); //tworzymy nowy element
        p.data = newElement; //zapisujemy wartość, którą chcemy dodać do pola data
        p.prev = list._tail; //poprzednikiem ustawiamy obecny ogon, ponieważ to był ostatni dotychczasowy element
        p.next = null; //od razu ustawiamy wartość na null, ponieważ ostatni element NIE może mieć poprzednika
        list._tail = p; //nowo utworzony obiekt staje się ogonem
        list.counter++; //zwiększamy licznik o 1

        if(p.prev != null){ //jeżeli mamy poprzednika
            Element prevEl = p.prev;
            //wówczas oznacza to, że wcześniej był elementem ostatnim, z tego wniosek, że
            //nie mógł mieć następnika, więc stawiamy mu nasz obiekt jako następnika
            prevEl.next = p;
        }
        else{
            list._head = p;
            //jeżeli nasz nowo dodany element nie ma poprzednika (np. całkowicie nowa lista
            // i dodajemy pierwszy element to staje się on jednocześnie pierwszym elementem (głową)
        }
    }


    //SEKCJA DODAWANIA ELEMENTU PRZED/PO WSKAZANYM ELEMENCIE
    public void addElementBeforeElement(int elementToAdd, int elementBefore, mListKuba list){
        Element before = list.getElementForward(elementBefore, list); //wyszukujemy pierwszy element z wartością
        //przed którą chcemy dodać nowy element

        if(before == list._head) //jeżeli element przed którym chcemy wstawiać wartość jest głową
        {
            list.addElementAtBeginning(elementToAdd, list); //to nie muszę kombinować -
            // skorzystam z dodawania na początku listy
        }
        else //w każdym innym przypadku muszę go wstawić i pozmieniać odpowiednio wskaźniki
        {
            Element p = new Element(); //tworzymy nowy element
            p.data = elementToAdd; //zapisujemy wartość, którą chcemy dodać do pola data
            p.prev = before.prev; //poprzednikiem naszego nowoutworzonego elementu staje się poprzednik
            //elementu przed który wstawiam
            p.next = before;//następnikiem naszego nowoutworzonego elementu staje się element przed który wstawiam
            Element prevBefore = before.prev; //dla czytelności kodu pobieram i zapisuje sobie element, który
            //stał wcześniej przed elementem, przed który chcemy dodać element
            prevBefore.next = p; //i zmieniamy jego następnika na nasz nowoutworzony element

            before.prev = p; //teraz musimy zmienić poprzednika elementu, przed który wstawialiśmy na nasz nowy obiekt
            list.counter++; //zwiększamy licznik
        }
    }

    public void addElementAfterElement(int elementToAdd, int elementAfter, mListKuba list){
        Element after = list.getElementForward(elementAfter, list); //wyszukujemy pierwszy element z wartością
        //za którą chcemy dodać nowy element

        if(after == list._tail) //jeżeli element za którym chcemy wstawiać wartość jest ogonem
        {
            list.addElementAtEnd(elementToAdd, list); //to nie muszę kombinować -
            // skorzystam z dodawania na końcu listy
        }
        else //w każdym innym przypadku muszę go wstawić i pozmieniać odpowiednio wskaźniki
        {
            Element p = new Element();//tworzymy nowy element
            p.data = elementToAdd; //zapisujemy wartość, którą chcemy dodać do pola data
            p.prev = after; //naszym poprzednikiem jest element za który wstawiamy
            p.next = after.next; //następnikiem naszego nowoutworzonego elementu staje się element za którym wstawiamy
            Element nextAfter = after.next; //dla czytelności kodu pobieram i zapisuje sobie element, który
            //stoł wcześniej za elementem, za który chcemy dodać element
            nextAfter.prev = p; //i zmieniamy jego poprzednika na nasz nowoutworzony element

            after.next = p; //teraz musimy zmienić następnika elementu, za który wstawialiśmy na nasz nowy obiekt
            list.counter++; //zwiększamy licznik
        }

    }

    public void deleteElement(int elementToDelete, mListKuba list){
        Element toDelete = list.getElementForward(elementToDelete, list); //wyszukujemy pierwszy element z wartością

        list.counter--; //zmniejszamy licznik o 1
        if(toDelete.prev != null) //jeżeli nasz element ma poprzednika
        {
            Element prevOfDelete = toDelete.prev; // pobieramy element poprzedzający element do usunięcia
            prevOfDelete.next = toDelete.next; // temu elementowi pobranemu wyżej ustawiamy jako następnik
            //następnik elementu który chcemy usunąć
        }
        else //jeżeli nie mamy poprzednika
        {
            list._head = toDelete.next; //oznacza to, że byliśmy głową, więc teraz głową staje się następnik elementu
            //do usunięcia
        }

        if(toDelete.next != null) //jeżeli nasz element ma następnika
        {
            Element nextOfDelete = toDelete.next; // pobieramy element następny po elemencie do usunięcia
            nextOfDelete.prev = toDelete.prev; // temu elementowi pobranemu wyżej ustawiamy jako poprzednik
            //poprzednik elementu który chcemy usunąć
        }
        else //jeżeli nie mamy następnika
        {
            list._tail = toDelete.prev; //oznacza to, że byliśmy ogonem, więc teraz ogonem staje się poprzednik elementu
            //do usunięcia
        }

        toDelete = null; //GarbageCollector zrobi resztę, ponieważ nie ma na niego żadnego wskaźnika w tym momencie

    }

    //SEKCJA POMOCNICZO - TECHNICZNA
    public Element getElementForward(int data, mListKuba list) //metoda zwraca pierwszy element, który przechowuje
    //zadeklarowaną przez nas wartość
    {
        Element p = list._head; //zaczynamy wyszukiwanie od głowy
        while (p.next != null) //przechodzimy dopóki mamy następnik
        {
            if(p.data == data){
                break; //jeżeli udało nam się znaleźć element to kończymy wykonywanie pętli
            }
            p = p.next;
        }

        return p; //jeżeli nie mamy następnika lub przerwaliśmy pętle zwracamy p (pierwszy element z wartością
        //którą chcemy uzyskać lub ogon z listy)
    }

    public void printAllElements(mListKuba list) //metoda drukuje całą listę od pierwszego elementu (głowy) do ostatniego
            // - ogona
    {
        Element p = list._head; //zaczynamy wyszukiwanie od głowy
        while (p != null) //przechodzimy dopóki mamy jakąkolwiek wartość (łącznie z ostatnim elementem)
        {
            System.out.println(p.data);
            p = p.next;
        }
    }

}

