package day42_abstractClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I03_Interfaces {


    int SAYI=20;


    /*
    int sayi; // hata verir

  ***  interfaceLerde tüm variable'lar public static ve final'dır.
    Dolayısı ile sonradan değer atama şansımız yokur
    bunun için variable oluşturduğumuzda mutlaka değer atamalıyız.

    Bir interface bir class'ı parent edinemez


     */
   void yakit();

    public void motor();
    public abstract void teker(); // public ve abstract yazmana gerek yoktu diyor. zaten defaultta var
     /*
   interface içerisindeki her metod
   public ve abstract özelliklerine sahiptir.


    */

    public static   void aku()
    {

        /*
        abstract bir methodun body'si olması mümkün değildir
        java sonradan developerların isteği üzerine kısmi bir update yapmıştır.

        bir interface'e sonradan bir abstract method eklerseniz
        o interface'i daha önce implement etmiş tüm class'lara gidip
        hesinde yeni eklenen metodu override etmeniz gerekir
        buda büyük ve eskiden gelen projeler için çok zor bir işlemdir.

        bunun için java , java8'den itibaren interface'lere sonradan body'si olan metot eklenmesine izin vermiştir.
        bu methodların body'si olsa da interface'in yapısı gereği
        bu metotlara concrete denmez.
        body'si olan bu metotlar istisna olarak kabul edilebilir.
         */
    }


}
