package day43_interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);//[10,20,30]

        //liste'deki tüm elemanları INDEX KULLANMADAN 3 artırın

        for (Integer each:liste)
        {
            System.out.print(each+3 +" "); //artırdık ama kalıcı olmadı

        }
        System.out.println("");
        System.out.println(liste);

        /*
        Java index yapısı olmayan collection'lardaki
         elementlere ulaşmak ve değiştirmek için
         Iterator interface'ini oluşturmuştur.

         Iterator interface olduğundan ondan obje üretmemiz mümkün değildir.
         bunun yerine bize iterator döndüren liste.iterator();metodunu kullanıyoruz.

         */
        Iterator it1 = liste.iterator();
        System.out.println(it1.next());//10 yanındakini söyle dedik.
        System.out.println(it1.next());//20
        System.out.println(it1.next());//30
       // System.out.println(it1.next());//artık 30dan sonra element kalmadığından Exception verir

        /*
        Iteratorda geri dönüş yok adım adım sona ulşatıktan sonra
        başa gelmek isterseniz yeniden bir iteraator oluşturmanız gerekir.

         */
        Iterator it2 = liste.iterator();// yeniden bir iterator oluşturduk ve listenin basına yerleştirdi

        //yeni iteratoru (it2) kullanarak listenin tüm elementlerini silelim
        it2.next();//önce bir atlatalım üzerine 10'u alsın
        it2.remove();//sonra sildirelim
        it2.next();//önce bir atlatalım üzerine 20'yi alsın
        it2.remove();//sonra sildirelim
        it2.next();
        it2.remove();
        System.out.println(liste);//liste kalıcı olarak değişti.... hepsini sildik


        liste.add(10);
        liste.add(20);
        liste.add(30); //yeniden dolduralım
        System.out.println("Yeniden  liste = " + liste);
        Iterator it3 = liste.iterator();

        while (it3.hasNext()){ //döngü ile yaptıralım
            it3.next();
            it3.remove();

        }
        System.out.println("Loopdan sonra liste" + liste);

        /*
        Görüldüğü gibi iterator kullanarak yapabildiğim
        1-tüm collection elementlerini yazdırmak
        2-tüm collection elementlerini silmek
        buda bize yetmez.
         */





    }
}
