package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C03_LinkedListListDataTuru {
    public static void main(String[] args) {


        LinkedList<String> ll1 = new LinkedList<>(); //en kapsamlı
        List<String> ll2 = new LinkedList<>(); //fark olarak list özelliklerini gösterir
        Queue<String> ll3 = new LinkedList<>();//queue özellikleri gelir.
        Deque<String> ll4 = new LinkedList<>();
        //child olan daha geniş özelliklere sahiptir.


        ll2.add("Emin");
        ll2.add("Sezer");
        ll2.add("Ersin");
        ll2.add("Muhammed");
        ll2.add("Enes");
        System.out.println(ll2);//[Emin, Sezer, Ersin, Muhammed]
        System.out.println(ll2.remove(2));//Ersin
        System.out.println(ll2.remove("Kemal"));//false
        //eğer listemiz int elementlerden oluşuyorsa,direkt sayı yazarsak index olarak kabul eder
        //ama bir variable'a atama yapar ve remove'da o variable'ın ismini yazarsak obje olarak kabul eder.
        System.out.println(ll2.hashCode());//844128055 referans kodu veriyor
        ll1.add("Alp");
        ll1.add("Emin");
        ll2.retainAll(ll1);//ll2'deki tüm elementleri ll1 ile karşılaştırır.ll1'de olmayanları siler.
        //ortak olanlar haricindekileri siler. ortak olanları gösterir
        System.out.println(ll2);





    }
}
