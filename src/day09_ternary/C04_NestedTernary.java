package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {

    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin kucuk harf ise consola “Kucuk Harf” ,
        // buyuk harfse consola “Buyuk Harf” yoksa
        // “girdiginiz karakter harf degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char harf =scan.next().charAt(0);

      //  String sonuc = (harf>='a' && harf<='z') ? ("Küçük harf") : ("Buraya büyük harf veya geçersiz karakter gelcek");

        String sonuc = (harf>='a' && harf<='z') ? ("Küçük harf") : ((harf>='A' && harf<='Z') ? "Büyük harf" : "Geçersiz karakter");
        System.out.println(sonuc);
    }
}
