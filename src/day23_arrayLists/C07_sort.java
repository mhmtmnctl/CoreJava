package day23_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_sort {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();

        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        Collections.sort(urunler);//Coolection metodundan yardım aldık
        System.out.println(urunler);//[Cay, Cekirdek, Ikram, Nutella]
        /*
        list ile gelen sort metodunda sıralama özelliğini girmek gerekiyor ve karışık
        bunun yerine collections class'ından sort metodunu kullanıyoruz.
        bu method listemizi natural order'a göre sıralar. doğal olarak. harf veya sayısal büyüklük vs gibi

         */

    }
}
