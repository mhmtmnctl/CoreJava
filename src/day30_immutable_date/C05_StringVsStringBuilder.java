package day30_immutable_date;

import jdk.swing.interop.SwingInterOpUtils;

import java.time.LocalTime;

public class C05_StringVsStringBuilder {
    public static void main(String[] args) {
        /*
        String mi yksa stringBuilder mi daha hizlidir ??
        Bunun icin bir string olusturup 100 kere sonuna nokta ekleyelim
        oncesinde ve sonrasinda zamani alip aradaki farki alalim

        ayni islemi stringbuilder icin de yapalim
         */
        LocalTime baslangic = LocalTime.now();
        String str = "Ahhhh Java";
        for (int i = 0; i <1000 ; i++) {
            str+=".";
        }
        LocalTime bitis = LocalTime.now();
        System.out.println(baslangic);
        System.out.println(bitis);

        System.out.println("String zaman "+ (bitis.getNano()-baslangic.getNano()));
    }
}
