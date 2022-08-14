package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

         */

        String[] sinifListesi = {"Ali Can","Nida Yücedal","Musa Yaman"};
        String eklenecekIsim = "Murat Babayigit";

        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);

        System.out.println(Arrays.toString(sinifListesi));



    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim)
    {
        String [] yeniSinifListesi = new String[sinifListesi.length+1];//yeni bir liste oluşturduk
        // bir fazla olacak şekilde

        for (int i = 0; i < sinifListesi.length ; i++)

        {
            yeniSinifListesi[i]=sinifListesi[i];
        }
        //öncelikle eski listedeki tüm elemanları yeni listeye taşıdık
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
        //son indexe eklenecek ismi atadım
        return yeniSinifListesi;
    }
}
