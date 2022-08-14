package day15_overloading_forLoop;

import java.util.Scanner;

public class ReplitOdevleri {

    public static void main(String[] args) {

        /*
        Kullanıcıdan bir isim ve bir karakter girmesini isteyin,
        ardından döngüleri kullanarak karakterin isimde kaç kez tekrarlandığını kontrol edin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir kelime giriniz : ");
        String kelime = scan.nextLine();
        System.out.print("Lütfen bir harf giriniz : ");
        char harf = scan.next().charAt(0);
        int kelimeUzunlugu = kelime.length();
        int sayac = 0;



        for (int i = 0; i <kelimeUzunlugu ; i++) {
            if(kelime.substring(i,i+1).charAt(0) == harf  )// == true yazmaya gerek yok doğruysa if'e gircek
            {
                sayac++;

            }


        }
        if(!(sayac==0))
        {
            System.out.println("Girilen harf "+sayac+" adet vardır");

        }
        else
        {
            System.out.println("Girdiğiniz harf kelimede yoktur.");
        }






    }

}
