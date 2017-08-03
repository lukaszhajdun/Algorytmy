package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

import java.util.Stack;

/**
 * Created by JMaterac on 03.08.2017.
 */
public class WyliczanieWyrazeniaOdwrotnejNotacjiPolskiej extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Wyliczanie wyrazenia odwrotnej notacji polskiej";
    }

    @Override
    public void runAlgorithm(String[] input) {
        String[] wyrazenie = new String[input.length-1];

        for(int i = 0; i < wyrazenie.length; i++)
            wyrazenie[i] = input[i+1]; //przpisujemy wejście

        Stack<Integer> stos = new Stack<>(); //tworzymy nowy stos

        int argument1 = 0, argument2 = 0;

        for(String napis : wyrazenie) //przetwarzamy fragment wyrażenia po fragmencie (po jednym elementcie)
        {

            switch (napis)//W zależności jaki napis otrzymaliśmy wówczas wykonamy inne działanie
            {
                case "=": break; //oznacza koniec wyrażenia
                case "+": //pojawił się operator więc musimy ściągnąć dwa elementy ze stosu
                    //aby wykonać na nich odpowiednie działanie i wynik wrzucić z powrotem na stos
                    argument2 = stos.pop();
                    argument1 = stos.pop();
                    stos.push(argument1 + argument2);
                    break;
                case "-":
                    argument2 = stos.pop();
                    argument1 = stos.pop();
                    stos.push(argument1 - argument2);
                    break;
                case "*":
                    argument2 = stos.pop();
                    argument1 = stos.pop();
                    stos.push(argument1 * argument2);
                    break;
                case "/":
                    argument2 = stos.pop();
                    argument1 = stos.pop();
                    stos.push(argument1 / argument2);
                    break;
                default: //jeżeli nie otzrymaliśmy żadnego operatora, wówczas oznacza to, że
                    //dostaliśmy cyfrę, którą musimy odpowiednio sparsować i wrzucić na szczyt stosu
                    int liczba = Integer.parseInt(napis);
                    stos.push(liczba);
                    break;
            }
        }

        System.out.printf("Wynik: %d\n", stos.pop());

    }


}
