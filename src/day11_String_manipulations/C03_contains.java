package day11_String_manipulations;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        /*
         Soru 1) Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
         @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
         @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen email yazınız");
        String email = scan.nextLine();

        if (! email.contains("@gmail.com"))//gmail.com içermiyorsa
        {
            System.out.println("Lütfen gmail adresi giriniz.");
        }
        else if(email.lastIndexOf("@gmail.com")==(email.length()-10))//length()-10 yani gmail.com 'un uzunluğunu çıkardık
        {
            System.out.println("Email adresiniz kaydedildi");
        }
        else
        {
            System.out.println("Lütfen yazımı kontrol edin");
        }



    }
}
