package day21_Arrays;

import java.util.Arrays;

public class C09_binarySearch {

    public static void main(String[] args) {

        /*
        binary search metodu sıralanmış array'de aradığımız elementin indexini döndürür(int)
        ya aradığımız element arrayde yoksa ?
        (String'de index of() bize olmayan elementler için -1 döndürüyordu)

        Aradığımız element arrayde yoksa java hem olmadığını hem de
        olsaydı nerede olacağını bize döndürür.

        olmadığını ifade için - kullanır.
       * olsaydı nerede olacağını index değil sıralama kullanır

         */

        int [] sayilar = {3,5,1,4,7,0};
        Arrays.sort(sayilar);//sıraladık
        System.out.println(Arrays.toString(sayilar));
        //varsa indexini verir, yoksa - sıra verir.

        System.out.println(Arrays.binarySearch(sayilar,1));// 1'in indexini döndürü yani 1
        System.out.println(Arrays.binarySearch(sayilar,5));// 5'in indexini döndürü yani 4
        System.out.println(Arrays.binarySearch(sayilar,7));// 7'in indexini döndürü yani 5
        System.out.println(Arrays.binarySearch(sayilar,10));// yok ama olsaydı 7den sonra olurdu
        System.out.println(Arrays.binarySearch(sayilar,6));// yok ama olsaydı 5den sonra olurdu
        System.out.println(Arrays.binarySearch(sayilar,-100));// yok ama olsaydı en başta olurdu








    }
}
