package com.company;

import java.util.Scanner;
import java.lang.Math;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.pow;
import static java.lang.StrictMath.sqrt;
public class Zadanie2 {

    public static void main(String[] args) {
        //Zad1

        double wynik;
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        double[] liczby = new double[n];

        //a

        wynik = 0;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+= liczby[i];
        }
        System.out.println(wynik);

        //b

        wynik = 1;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
            wynik*= liczby[i];
        }
        System.out.println(wynik);

        //c

        wynik = 0;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+= abs(liczby[i]);
        }
        System.out.println(wynik);

        //d

        wynik = 0;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+=sqrt(abs(liczby[i]));
        }
        System.out.println(wynik);

        //e

        wynik = 0;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
            wynik*= abs(liczby[i]);
        }
        System.out.println(wynik);

        //f

        wynik = 0;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+= pow(liczby[i], 2);
        }
        System.out.println(wynik);

        //g

        wynik = 0;
        double wynik2 = 1;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
            wynik+= liczby[i];
            wynik2*=liczby[i];
        }
        System.out.println(wynik + "\n" + wynik2);

        //h

        wynik = 0;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
        }
        for (int i = 0; i <= liczby.length - 1; i++) {
            wynik+= pow(-1, i+1)*liczby[i];
        }
        System.out.println(wynik);

        //i

        wynik = 0;
        int factorial = 1;
        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
        }
        for (int i = 0; i <= liczby.length -1; i++) {
            factorial*=i+1;
            wynik+= (pow(-1,i)*liczby[i])/factorial;
        }
        System.out.println(wynik);

        //1.2

        double[] liczby2 = new double[n];

        for (int i = 0; i <= liczby.length - 1; i++) {
            liczby[i] = scn.nextDouble();
        }
        double jeden = liczby[0];
        for (int i = 0; i <= liczby.length - 2; i++) {
            liczby2[i] = liczby[i+1];
        }
        System.out.println("\n\n\n");
        liczby2[liczby2.length - 1] = jeden;
        for(int i = 0; i <=liczby2.length - 1; i++){
            System.out.println(liczby2[i]);
        }

        //Zad2
        //2.1
        //a
        int ile = 0;

        for(int i = 0; i<=liczby.length - 1; i++){
            liczby[i] = scn.nextDouble();
            if(liczby[i] % 2 != 0)
                ile++;
        }
        System.out.println(ile);

        //b

        for(int i = 0; i <= liczby.length - 1; i++){
            liczby[i] = scn.nextDouble();
            if(liczby[i] % 3 == 0 && liczby[i] % 5!=0)
                ile++;
        }
        System.out.println(ile);

        //c

        for(int i = 0; i <= liczby.length - 1; i++){
            liczby[i] = scn.nextDouble();
            if(sqrt(liczby[i]) % 2 == 0)
                ile++;
        }
        System.out.println(ile);

        //d

        for(int i = 0; i<=liczby.length-1; i++) {
            liczby[i] = scn.nextDouble();

        }
        for(int i = 1; i<=liczby.length-2; i++){
            if(liczby[i] < (liczby[i-1]+liczby[i+1])/2)
                ile++;
        }
        System.out.println(ile);
    }
}