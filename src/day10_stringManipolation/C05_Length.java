package day10_stringManipolation;

public class C05_Length {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.length()); //str'ın karakter sayısını döndürür
        System.out.println(str.charAt(str.length()-1));//son karakterini yazdırın    p

        System.out.println(str.charAt(str.length()-3));//sondan 3. karakteri yazdırın k

        /*
        javada null pointer (işaretleyici) bir değer değil, karşısına yazıldığı variable'ın hiçbir değer almadığının işaretçisidir.

         */

        String str2 =""; //str2'ye bir değer atanmış mıdır? EVET
                         //bu değer nedir? Cevap HİÇLİK
        System.out.println(str2.length());//0

        String str3 = null; //str3'e bir değer atanmış mıdır? HAYIR
                            //bir değer atanmamış, null bu değer atamamayı işaret etmektedir.

        System.out.println(str3.length());//bir değer atanmamış ki nasıl uzunluğu olsun.
                                          //NullPointerException olarak hata verir.





    }

}
