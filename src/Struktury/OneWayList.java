package Struktury;

public class OneWayList {
    int _counter;
    OneWayListElement _head;

    public void addElementAtBeginning (int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        p.next = _head;
        _head = p;
        _counter++;
    }

    public OneWayListElement getLastElement() {
        OneWayListElement iterator;
        iterator = _head;
        while (iterator.next != null) {
            iterator = iterator.next;

        }
        return iterator;
    }



    public void addElementAtEnd (int newElement) {
        OneWayListElement p = new OneWayListElement();
        p.data = newElement;
        OneWayListElement lastOne = getLastElement();
        lastOne.next = p;

    }







    }





