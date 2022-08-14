package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C04_remove {
    public static void main(String[] args) {

        List<String> urunler = new ArrayList<>();
        urunler.add("Nutella");
        urunler.add("Ikram");
        urunler.add("Cekirdek");
        urunler.add("Cay");

        /*
        remove methodu iki şekilde kullanılır
        1-Objeyi yazıp silmesini istersek bize boolean sonuç döner.
        2-Index girersek o indexteki elemanı siler ve bize silinen elemanı döndürür.
         */

        System.out.println(urunler);//[Nutella, Ikram, Cekirdek, Cay]

        System.out.println(urunler.remove("Ikram"));//true
        System.out.println(urunler);//[Nutella, Cekirdek, Cay]

        System.out.println(urunler.remove("Hobby"));//false   silemedi..çünkü yok
        System.out.println(urunler);//[Nutella, Cekirdek, Cay]

        //ikinci yöntem yani index girelim

        System.out.println(urunler.remove(1));//çekirdeği silcek ve çekirdeği getircek
        System.out.println(urunler);

        //olmayan bir indexi silmeye çalışırsak?

        System.out.println(urunler.remove(3));//.IndexOutOfBoundsException




    }
}
