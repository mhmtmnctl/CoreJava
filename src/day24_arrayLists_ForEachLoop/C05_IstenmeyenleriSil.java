package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_IstenmeyenleriSil {
    public static void main(String[] args) {
        /*
         Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
                  kalan elementleri yeni bir array yapin
         */
        String[] sehirler = {"Istanbul","Ankara","Mersin","Konya","Kastamonu","Denizli"};
        String istenmeyenHarf ="r";
        List<String>kalanlar = new ArrayList<>();
        for (int i = 0; i < sehirler.length; i++)
        {
            if (!sehirler[i].contains(istenmeyenHarf))
            {
                kalanlar.add(sehirler[i]);
            }
        }
        //loop bittiğinde istenmeyen harf içermeyen şehirler, listeye eklenmiş olcak
        System.out.println(kalanlar);

        //yeni bir array oluşturup listeyi ona aktaralım

        String[] kalanlarArrayi = new String[kalanlar.size()];

        for (int i = 0; i < kalanlarArrayi.length; i++)
        {
            kalanlarArrayi[i]=kalanlar.get(i);
        }
        //sehirler arrayinin yeni değerini atıyalım
        sehirler=kalanlarArrayi;// sehirler arrayinin uzunluğunu değiştiremiyoruz fakat eskiyi atıp yeni bi şehirler arayi oldu
        //bu şekilde atamayı sor tekrar
        System.out.println("Sehirler arrayinin son hali :"+ Arrays.toString(sehirler));


    }
}
