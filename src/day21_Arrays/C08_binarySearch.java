package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        binary search java'da eleman aramanın kısa yoludur.
        ancak binary search'un çalışması için önce array'in sıralı hale getirilmesi gerekir
        eğer sıralama yapmadan binary search yaparsanız sonucu bulamayabilir
        veya yanlış bulablir
         */

        String[] harfler = {"Y","B","D","G","O","A"};

        String arananHarf = "Y";//-6.. - olmasının sebebi bulamadı.

        //binary search bize aradığımız elemanının indexini döndürür.
        System.out.println(Arrays.binarySearch(harfler,arananHarf));

        System.out.println( C03_Contains.containsMetodu(harfler,arananHarf));


        //array sıralı olmadığı için arama sonucunu doğru bulamayabilir.
        //emin olmak için önce sort yapmalıyız

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));





    }
}
