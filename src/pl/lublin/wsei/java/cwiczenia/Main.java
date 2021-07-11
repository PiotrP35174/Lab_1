package pl.lublin.wsei.java.cwiczenia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj liczbe którą chcesz przekształcic");
        Scanner input = new Scanner(System.in);
        int podana_liczba = input.nextInt();
        System.out.println("DEC:" + podana_liczba);
        System.out.println("BIN:" + Integer.toBinaryString(podana_liczba));
        System.out.println("HEX:" + Integer.toHexString(podana_liczba));
    }



}




