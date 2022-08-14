package day44_collections;

import java.util.LinkedList;
import java.util.Queue;

public class C04_LinkedList_QueueDateTuru {
    public static void main(String[] args) {
       Queue<String> ll3 = new LinkedList<>();
        ll3.add("Emin");
        ll3.add("Sezer");
        ll3.add("Ersin");
        ll3.add("Muhammed");
        ll3.add("Alp");
        ll3.add("Süeda");
        ll3.add("Fatih");

        /*
        Queue kuyruk demektir . Sıra önemlidir.
        Gelen sona gelir.
        Giden baştan gider.


         */

        System.out.println(ll3);
        System.out.println(ll3.remove());// şunu bunu remove et demiyor. ben gittim listeden :)  sildiğini de döndürüyor
        System.out.println(ll3);
        System.out.println(ll3.remove("Sezer"));//boolean döndürüyor. ve sezeri sildi.
        System.out.println(ll3);
        System.out.println(ll3.element());//başta kim var diye getiriyor sadece. peekden farkı liste boşsa exception fırlatır
        System.out.println(ll3.peek()); //yine en baştakini getiriyor ama exception fırlatmıyor.
        ll3.offer("Emin"); //sona ekliyor.
        System.out.println(ll3);
        System.out.println(ll3.poll());//baştakini siler ve bize sildiğini gösterir. ama liste boşsa null döndürür.
        System.out.println(ll3);

    }
}
