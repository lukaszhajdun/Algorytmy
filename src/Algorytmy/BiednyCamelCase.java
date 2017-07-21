package Algorytmy;

import com.sun.xml.internal.fastinfoset.util.CharArray;

/**
 * Created by RENT on 2017-07-21.
 */
public class BiednyCamelCase extends AbstractAlgorithm {

    @Override
    public String getName() {
        return "Biedny Camel Case";
    }

    @Override
    public void runAlgorithm(String[] input) {
        System.out.println("Algorytm Biedny Camel Case");
int iterator = 0;
        for (int i = 1; i < input.length; i++) {

            String wyraz = input[i];
            char[] tablica = wyraz.toCharArray();



                for (int j=0; j < tablica.length; j++) {
                    if (iterator % 2 ==0){
                        System.out.printf(Character.toString(wyraz.charAt(i)).toUpperCase());
                    }
                    else {
                        System.out.printf(Character.toString(wyraz.charAt(i)).toLowerCase());
                    }

                }



        }

        /*
        literki int = 0
        for (i=1; i < długość args; i++)
        slowo args[i]
            for (j=0; j < slowo dlugosc; j++
                if (literki %2 == 0)
                 piszemy dużą literę
                else piszemy małą

                Literki ++ ;
         */



    }
}
