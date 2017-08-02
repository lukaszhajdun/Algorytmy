package Struktury;

public class mList {
    Element _head;
    Element _tail;
    int counter;

    public void goTroughtListForward(mList list) {
        Element p = list._head;
        while (p.next != null) {
            //wykonujemy logike
            p = p.next;
        }
    }

    public void goTroughtListBack (mList list) {
        Element p = list._tail;
        while (p.prev != null) {
            //wykonujemy logike
            p = p.prev;
        }
    }

    public void addElementAtBeginning(int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.prev = null; //element na poczatku nie moze mniec poprzednika
        p.next = list._head; //nastepnikiem bedzie glowa listy
        list._head = p; //wskazujemy na siebie jako glowe
        list.counter++;

        if (p.next != null) {
            //p.next.prev = p; // Wskazujemy p jako poprzednika wczesniejszego elementu pierwszego (głowy)
            Element nextEl = p.next;
            nextEl.prev = p;
        }
        else {
            list._tail = p;
        }

    }
    public void addElementAtEnd (int newElement, mList list) {
        Element p = new Element();
        p.data = newElement;
        p.next = null;
        p.prev = list._tail;
        list._tail = p;
        list.counter++;

        if (p.prev != null) {
            Element prevEl = p.prev;
            prevEl.next = p;
        }
        else {
            list._head = p;
        }
    }

    public Element getElementForward (int data, mList list) {
        Element p = list._head;
        while (p.next != null) {
            if (p.data == data) {
                break;
            }
            p = p.next;
        }
        return p;
    }

    public void printAllElements (mList list) { //Tu jest cos nie tak
        Element p = list._head;
        while (p != null) {
            System.out.println(p.data);
            p = p.next;
        }

    }

    public void addElementBeforeElement(int elementToAdd, int elementBefore, mList list) {
        Element before = list.getElementForward(elementBefore, list);

        if (before == list._head) {
            list.addElementAtBeginning(elementToAdd, list);
        }
        else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = before.prev; //Ten sam poprzednik co w elemencie before
            p.next = before; // Pokazujemy na element before jako nastepny
            Element prevBefore = before.prev; //prevBefore i pobieramy wskazanie z befora na wczesniejszy element
            prevBefore.next = p; // Z pobranego linijke wyżej wskazania Ustawniamy nowego nastepnika na dodawany element
            before.prev = p;
            list.counter++;
        }
    }

    public void addElementAfterElement(int elementToAdd, int elementAfter, mList list) {
        Element after = list.getElementForward(elementAfter, list);

        if (after == list._tail) {
            list.addElementAtEnd(elementToAdd, list);
        }
        else {
            Element p = new Element();
            p.data = elementToAdd;
            p.prev = after;
            p.next = after.next;
            Element nextAfter = after.next;
            nextAfter.next = p;
            after.next = p;
            list.counter++;
        }
    }


}

