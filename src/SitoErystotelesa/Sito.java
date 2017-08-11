package SitoErystotelesa;

public class Sito {
    private boolean tab[]; //deklarujemy tablicę jako pole, ponieważ później wykorzystamy ją
    //do wykreślania liczb niepierwszych

    public Sito(){
        this(10000); //wywołujemy konstruktor który przyjmuje jako argument liczbę żeby nie dublować kodu
        //zauważ, że zrobilibyśmy dokładnie tak samo jak w tym drugim konstruktorze tylko napisalibyśmy
        //new boolean[10000]; a tak przekazaliśmy po prostu agrument i niech on się martwi za nas
    }

    public Sito(int n){ //konstruktor przyjmujący argument

        tab = new boolean[n]; //tworzy nam odpowiednio długą tablicę
    }

    public void generujSito() {
        for (int i = 0; i < tab.length; i++) //ustawiamy każdemu elementowi tablicy wartość na true - w tym
            //momencie przyjmujemy, że każda liczba jest piewsza
            tab[i]=true;

        for(int i = 2; i < tab.length; i++) //algorytm rozpoczyna działanie od 2 i pobiera indeks
            //kolejnych elementów tablicy
            if(tab[i]) //jeżeli dany element jest liczbą pierwszą (nie został wykreślony wcześniej)
                for(int j = i + i; j < tab.length; j = j+i) //idziemy do końca tablicy od kolejnej liczby, która wielokrotnością
                    //aktualnie przez nas przetwarzanej
                    tab[j] = false;//i ustawiamy jej wartość na fałsz - nie jest pierwsza

    }
    
    public void drukujSito()
    {
        for (int i = 2; i < tab.length; i++) //lecimy od drugiego do ostatniego elementu tablicy
        {
            if(tab[i]){ //jeżeli jest liczba pierwsza drukujemy ją
                System.out.printf(" %d ", i);
            }
        }
    }
}
