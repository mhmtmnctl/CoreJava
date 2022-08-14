package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        /*
        Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin

         */
        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println("liste = " + liste);
        //sondan başa gelmek için önce sona gitmek lazım.
        ListIterator li1 = liste.listIterator();
        while (li1.hasNext()){
            li1.next(); //yana geç... yanda eleman old. müddetçe
        }
        //bu loop bizi sona götürür.

        while (li1.hasPrevious()){
            System.out.print(li1.previous()+" ");
        }
    }
     /*
        Soru 5) (iterator ile index kullanimina ornek) Bir listedeki ilk n elemani iterator kullanarak 5 artirin.
 Orn : list : [2,13,56,23,45,14,40]
 artirilmasi istenen eleman sayisi : 3 output: [7,18,61,23,45,14,40]
         */

}
