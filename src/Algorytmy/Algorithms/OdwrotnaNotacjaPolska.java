package Algorytmy.Algorithms;

import Algorytmy.AbstractAlgorithm;

import java.util.Stack;

public class OdwrotnaNotacjaPolska extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Odwrotna notacja Polska";
    }

    @Override
    public void runAlgorithm(String[] input) {

        Stack<Integer> stos = new Stack<>();
        int arg1;
        int arg2;
        int wynik;

        for (int i=1; i < input.length; i++) {

                switch (input[i]) {

                    case "R":   //rowna sie
                        //Nic nie robimy i zwraca sie ostatnia liczba ze stosu
                        break;

                    case "M":   //mnozenie
                        arg2 = stos.pop();
                        arg1 = stos.pop();
                        wynik = arg2 * arg1;
                        stos.push(wynik);

                        break;

                    case "I":   //dzielenie
                        arg2 = stos.pop();
                        arg1 = stos.pop();
                        wynik = arg2 / arg1;
                        stos.push(wynik);
                        break;

                    case "D":   //dodawanie
                        arg2 = stos.pop();
                        arg1 = stos.pop();
                        wynik = arg2 + arg1;
                        stos.push(wynik);
                        break;

                    case "O":   //odejmowanie
                        arg2 = stos.pop();
                        arg1 = stos.pop();
                        wynik = arg2 - arg1;
                        stos.push(wynik);
                        break;

                    default:
                        int liczbaNaStos = Integer.parseInt(input[i]);      //Pobiera liczbe
                        stos.push(liczbaNaStos);                        //Wrzuca na stos

                }

            }

            System.out.printf("%d", stos.peek());   //Wypisuje wynik



        }

    }

