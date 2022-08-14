package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_indexOf {
    public static void main(String[] args) {
        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println(urunler);

        /*
        index of metodu bize bilgi döndüren bir metoddur.
        listemizi değiştirmez
         */

        System.out.println( urunler.lastIndexOf("Ikram"));//1

        /*
        index of methodu ürünü aramaya 0.indexten,
        lastIndexOf metodu ise aramaya son indexten başlar.

        arama bitip ürün bulunduğunda, ikiside bulunan ürünün indexini verir
        sondan başa saymaz.. index baştan başlar.. sondan da bulsa baştan da bulsa indexi sabittir.

         */
        urunler.add("Ikram");
        System.out.println(urunler);
        System.out.println(urunler.indexOf("Ikram"));//1
        System.out.println( urunler.lastIndexOf("Ikram"));//4

        System.out.println(urunler.indexOf("Hobby"));//-1
        System.out.println( urunler.lastIndexOf("Hobby"));//-1





    }
}
