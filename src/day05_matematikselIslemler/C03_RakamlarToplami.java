package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_RakamlarToplami {
    public static void main(String[] args) {

        // Kullanicidan 4 basamakli bir sayi alin ve rakamlar toplamini bulup yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı pozitif bir tamsayı giriniz");
        int sayi= scan.nextInt(); //mesela 5267 girsin...

        int birlerBasamagi= 0;
        int rakamlarToplami = 0;
        int ilkGirilenSayi= sayi;

        //şuanda sayı 5267 bb=0; rt=0
        birlerBasamagi= sayi % 10; // birler bas 7 bulduk
        rakamlarToplami+=birlerBasamagi;//rakamlar toplamını 7 artırdık

        sayi/=10;//sayıyı 10a böldük sayıya atadık sayımız şuan 526 oldu
        //şuanda bb değeri 7... rt 7

        birlerBasamagi = sayi % 10;//birler bas.değeri 6 oldu
        rakamlarToplami+=birlerBasamagi;//eskiden 7 idi 6 daha ekledk 13 oldu

        sayi/=10;//sondaki 6 dan kurtulduk..sayımız şuan 52 oldu

        //şuanda bb=6 rt(rakamlar toplamı)=13

        birlerBasamagi= sayi % 10;// birler bas 2 oldu.
        rakamlarToplami+=birlerBasamagi;//13+2 15 oldu

        sayi/=10; // 2den kurtulduk. sayımız şuanda 5 oldu

        //sayı şuanda 5, birler bs. 2, rakamlar toplamı ise 15

        birlerBasamagi= sayi % 10; // 5 olur.
        rakamlarToplami+= birlerBasamagi;//15di 5 ekledik 20 oldu

        sayi/=10;

        //şuanda sayi 0, bb=5 ve rt= 20 oldu
        System.out.println(ilkGirilenSayi + " sayısının rakamlar toplamı: " + rakamlarToplami);









    }
}
