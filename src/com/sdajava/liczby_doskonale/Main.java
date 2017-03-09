package com.sdajava.liczby_doskonale;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe, ktora chcesz sprawdzic: ");

        int n = scanner.nextInt();

        int sd = 0;
        int i;

        for (i = 1; i <= n/2; i++){
            if (n % i == 0){
                sd = sd + i;
            }
        }
        if (sd == n){
            System.out.println("Liczba " + n + " jest liczbą doskonałą.");
        } else {
            System.out.println("Liczba " + n + " nie jest liczbą doskonałą.");
        }
    }
}