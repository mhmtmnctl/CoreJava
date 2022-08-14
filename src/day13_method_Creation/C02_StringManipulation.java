package day13_method_Creation;

import java.util.Scanner;

public class C02_StringManipulation {


    public static void main(String[] args) {

        /*Soru 6) Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
        */
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir şifre giriniz: ");

        String sifre = scan.nextLine();
        int kontrol=0;
        //ilk harf kontrolü
        if (sifre.charAt(0) >= 'A'&&sifre.charAt(0)<='z')
        {
            kontrol++;
        }
        else
        {
            System.out.println("İlk harf büyük harf olmalı");
        }

        //son harf kontrolu
        if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z')
        {
            kontrol++;//şart sağlıyorsa kontrolü artırdık.
        }
        else
        {
            System.out.println("Son harf küçük harf olmalı");
        }

        //boşluk kontrolü

        if (sifre.contains(" "))
        {
            System.out.println("Şifre boşluk içermemeli");
        }

        else
        {
            kontrol++;
        }

        if (sifre.length()>=8)
        {
            kontrol++;
        }
        else
        {
            System.out.println("Şifre uzunluğu en az 8 karakter olmalıdır");
        }

        if (kontrol==4)
        {
            System.out.println("Sifre basari ile tanimlandi");
        }
        else
        {
            System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
        }




    }
}
