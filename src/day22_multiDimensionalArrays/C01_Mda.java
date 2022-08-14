package day22_multiDimensionalArrays;

import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {

        /*
        tek katlı arraylerde array'i direkt yazdıramaıyoruz.
        cunki array nonPrimitive darta türüdür ve her non-Primitive data direkt yazdırılamayabilir.

        ancak array'in içerisindeki elementleri direkt yazdırabiliriz.
        çünkü genelde primitive data türü veya String elementler kullanılıyordu.

        Multi-dimensional array'lerde en çok dikkat edeceğimiz konu ulaşmak istediğimiz
        elementin bir array mi yoksa primitive data mı olduğudur.
         */

        int[][] sayilar = {{1,2,4,5},{3,4}};
        /*
        burada sayılar array'ini düşünürsek içinde iki tane inner array var
        sayılar[0] ==> [1,2,4,5]
        ancak en içerdeki elementlere ulaşırsak direk yazdırabiliriz.
         */
        System.out.println(sayilar[0]);//referans verir
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]

        System.out.println(sayilar[0][1]);//2
        System.out.println(sayilar[1][0]);//3

        System.out.println(Arrays.toString(sayilar));//array içinde array old için 2 tane ref verir.
        System.out.println(Arrays.deepToString(sayilar));//derinlemesine arrayleri yazdır

        /*
        Array'i iki şekilde declare edebiliyorduk.
        1- Elemanları direkt yazabiliriz.  int[][] sayilar = {{1,2,4,5},{3,4}};
        2- Outer ve inner arraylerin uzunluklarını belirterek oluşturabiliriz.
        int[][] sayilar = new int[3][4];




        ancak ikinci yöntemle yaptığımızda inner arraylerin farklı uzunlukta olma ihtimali kalmaz
        bu örnek için outer array'in 3 tane inner array'i vardır.
        herbir inner array'in ise 4er elemanı vardır

        eğer inner arrayleri farklı uzunluklarda oluşturmak istiyorsanız mecburen birinci yöntemi
        kullanmalısınız
         */







    }
}
