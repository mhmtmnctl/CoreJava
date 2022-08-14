package day06_concatination;

import java.awt.image.ShortLookupTable;
import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        /*

            Wrapper class javanın hazır metotlarını kullanbilmemiz için primitive data türlerinin herbiri için açtığı classlardır
            int--> Integer
            char--> Character
            diğerleri primitive ile aynı sadece baş harfi büyük

         */

        String str= "Java ile hayat ne guzel";
        System.out.println(str.toUpperCase());//JAVA İLE HAYAT NE GUZEL
        boolean guzelMi= true;
        //guzelMi.  boolean primitive olduğundan hazır metodu bulunmuyor
        Boolean buGuzelMi = true;
        buGuzelMi.toString();
        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767



        String ogrNo = "123456";

        //kullanıcıdan bir şifre isteyin eğer şifre sadece rakamlardan oluşuyorsa kabul etmeyelim


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 basamaklı bir şifre giriniz");
        String sifre = scan.nextLine();
        int sifreSayi = Integer.parseInt(sifre);
        System.out.println("girilen şifre : " + sifre);//bu string değeri
        System.out.println("Integer şifre:" + sifreSayi);//bu sayısal int değeri

        //wrapper classlar ilerde kullanabileceğimiz pek çok faydalı hazır metot içerir



    }
}
