package day39_exceptions;

import java.util.Scanner;

public class C05_IllegalArgumentException {
    public static void main(String[] args) {
        /*
        Soru: Kullanicidan yasini girmesini isteyin.
        Kodunuzu kullanici sifirdan kucuk bir sayi girerse
        Exception verecek sekilde yazin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("yasinizi giriniz :");
        int yas = scan.nextInt();


        try {
            if (yas<0)
            {
                throw new IllegalArgumentException();
            }
            else
            {
                System.out.println("Yaşınız : "+yas);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("yaş negatif olamaz");
            e.printStackTrace();
            System.err.println("yanlış girdiniz");
        }
    }
}
