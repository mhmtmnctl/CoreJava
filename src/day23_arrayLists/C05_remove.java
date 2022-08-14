package day23_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_remove {
    public static void main(String[] args) {

        List<Integer> sayilar1 = new ArrayList<>();
        sayilar1.add(5);
        sayilar1.add(3);
        sayilar1.add(2);
        sayilar1.add(1);

        System.out.println(sayilar1);//[5, 3, 2, 1]

        sayilar1.remove(1);

        /*
        sayılardan oluşan bir list varsa java remove metodunda
        sayı yazdığımızda direkt index olarak kabul eder.

         */
        System.out.println(sayilar1);//[5, 2, 1]

        //illa da 5' silsin dersek...
        //silinecek objeyi bir variable'a tanımlayabiliriz.
        Integer sil=5;

        sayilar1.remove(sil);//5i silcek
        System.out.println(sayilar1);//[2, 1]

        //veya indexOf methodundan yardım alırız

        sayilar1.remove(sayilar1.indexOf(2));//2Yi silmek için 2nin indexini bulup onu remova yazabiliriz
        System.out.println(sayilar1);//[1]




    }
}
