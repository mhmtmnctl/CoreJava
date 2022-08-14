package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exceptions {
    public static void main(String[] args) {
        /*
          Marketteki tum urunleri bir array'de tuttugumuzu varsayalim
          Kullaniciya index sorup, o index'deki urunu yazdiran bir
          program hazirlayalim
          Kullanici urun sayisindan buyuk bir index girerse
          exception vermesinin onune gecelim
         */
        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
        Scanner scan;
      //  System.out.println("Istediginiz urunun sira nosunu giriniz");
        int istenenSira = 0;

        boolean dogru =true;
        while(dogru) {
            try {
                scan= new Scanner(System.in);
                System.out.println("Istediginiz urunun sira nosunu giriniz");
                istenenSira = scan.nextInt();
                dogru=false;

            } catch (InputMismatchException deneme) {
                System.out.println("Urun indexi icin bir tam sayi girmeniz gerekli");
                System.out.println(deneme);
                dogru=dogru;
                System.out.println("Lutfen bir sayi degeri giriniz");
            }


            try {
                System.out.println("Aradiginiz urun : " + urunler[istenenSira - 1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                        "\nSira numarasi en fazla : " + urunler.length + " olabilir");
            }
        }



    }
}
 /*
         catch blogunun onundeki parantezde
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)
         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz
         bu objeyi kullanabilirsiniz
         eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         */