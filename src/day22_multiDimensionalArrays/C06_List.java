package day22_multiDimensionalArrays;

import java.util.ArrayList;
import java.util.List;

public class C06_List {
    public static void main(String[] args) {

        /*
        array'i array yapan sembol [] idi.(deklerasyonda)
        arrayList'de ise <> diamond(elmas) kullanırız.

         */

        List<String> isimler = new ArrayList<>();
        System.out.println(isimler);// [] boş yazdırdı. ama array old. anlamına gelmiyor

        //eleman eklemek istersek
        isimler.add("Başak");
        System.out.println(isimler);//[Başak]

        System.out.println(isimler.add("Ayse"));//true false değeri döndürüyor. yani eklendi veya eklenmedi gibi


        /*
        String'de bir metod çalıştırdığımızda assign yapmazsak String değişmiyordu

        String isim ="Süleyman";
        isim.toUpperCase(); // SULEYMAN
        sout(isim) // Süleyman

         */
        System.out.println(isimler);

        /*
        list'in tek kötü tarafı array alt yapısını kullandığı için elemanları birer birer
        eklemk zorunda olmamızdır.
         */



    }
}
