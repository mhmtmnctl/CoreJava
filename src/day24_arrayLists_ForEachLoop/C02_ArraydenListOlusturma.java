package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_ArraydenListOlusturma {
    public static void main(String[] args) {

        /*
        içinde 200 tane 1000'den küçük pozitif birtamsayı olan bir list oluşturun
        kulanıcıdan bir sayı isteyip listede var olup olmadığını kullanıcıya yazalım
         */

        Random rnd = new Random(); //sayı üretiyor.
        int sayi=0;
        List<Integer>sayiListesi = new ArrayList<>();
        while (sayiListesi.size()<200)
        {
            sayi= rnd.nextInt(1000);//0-1000 arası sayı üretcek ve sayi değişkenine atcak

            if (!sayiListesi.contains(sayi)) // random sayı listede yoksa ekle
            {
                sayiListesi.add(sayi);
            }
        }
    //    System.out.println(sayiListesi);

        boolean bildiMi=false ;// while ı kontrol etmek için bildiMi?
        int tahminSayisi = 1;

        Scanner scan = new Scanner(System.in);


        while (!bildiMi)// true olduğu müddetçe çalışacağı için tersini aldık ya da bildiMi==false diyebiliriz
        {
            System.out.println("Lütfen bir sayı tahmin edin(0-1000 arası) :");
            sayi= scan.nextInt();
            if (sayiListesi.contains(sayi))
            {
                System.out.println("Tebrikler " + tahminSayisi + " seferde buldunuz");
                bildiMi=true;
            }else
            {
                System.out.println(tahminSayisi +" sefer girdiniz ama hiçbiri listede yok");
                tahminSayisi++;
            }

        }


    }
}
