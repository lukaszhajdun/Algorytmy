package Algorytmy.HomeWork;

import Algorytmy.AbstractAlgorithm;

public class ImieninyJasia extends AbstractAlgorithm {
    @Override
    public String getName() {
        return "Imieniny Jasia";
    }

    @Override
    public void runAlgorithm(String[] input) {
        int liczbaOsob = Integer.parseInt(input[1]);
        int liczbaCukierkow = Integer.parseInt(input[2]);

        int ileCukierkowZostalo = liczbaCukierkow % liczbaOsob;


        if (liczbaOsob > liczbaCukierkow) {
            System.out.println("Brakuje cukierków.");

        }
        else


            if (ileCukierkowZostalo == 0) {
                System.out.println("Nie");

            } else {
                System.out.println("TAK");
                System.out.println(ileCukierkowZostalo);

            }

    }
}
