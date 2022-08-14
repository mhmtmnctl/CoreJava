package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C02_set {
    public static void main(String[] args) {

        /*
        elimizde ürünlerin bulunduğu bir liste var.
        listedeki ürün listesindeki istenen sıradaki ürünü yenisiyle değiştirip
        eski ürünü var olan eski ürünler listesine ekleyelim
         */

        List<String> urunler = new ArrayList<>();


        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");
        List<String> eskiUrunler = new ArrayList<>();
        /*
        listedeki ikramın yerine biskrem koyalım.
        ikramına eski ürünler listesine ekleyelim
         */

        String yeniUrun="Biskrem";
        String silinecekUrun = "Ikram";

        int temp=  urunler.indexOf(silinecekUrun);
        String silinenUrun = urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);
        System.out.println("Liste :"+urunler);
        System.out.println("Eski ürünler listesi :"+eskiUrunler);


         yeniUrun="Kahve";
         silinecekUrun = "Cay";

         temp=  urunler.indexOf(silinecekUrun);
         silinenUrun = urunler.set(temp,yeniUrun);

        eskiUrunler.add(silinenUrun);
        System.out.println("Liste :"+urunler);
        System.out.println("Eski ürünler listesi :"+eskiUrunler);







    }
}
