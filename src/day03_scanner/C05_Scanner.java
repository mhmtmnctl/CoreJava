package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {


       // kullanıcıdan iki sayı alıp bu sayıların çarpımını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ilk sayıyı giriniz");
        double sayi1=scan.nextDouble();
        System.out.println("Lütfen ikinci sayıyı giriniz:");
        double sayi2 = scan.nextDouble();
        System.out.println("Çarpım:" + (sayi1*sayi2));


    }
}
