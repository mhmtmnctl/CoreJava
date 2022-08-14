package day44_collections;

import java.util.Deque;
import java.util.LinkedList;

public class C05_DeckDataTuru {
    public static void main(String[] args) {
        Deque<String> ll4 = new LinkedList<>(); //
        ll4.add("Cavidan");
        ll4.add("Mesut");
        ll4.add("Alvia");
        ll4.add("İbrahim Selim");
        ll4.add("Mehmet Emin");
        ll4.offerFirst("ali");//başa ekle
        ll4.offerLast("veli");//sona ekle
        ll4.pop();//removes and returns the first element of this deque.
        ll4.push("hasan");

    }
}
