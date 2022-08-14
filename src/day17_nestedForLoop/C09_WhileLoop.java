package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {



        /*Soru 6) Kullanicidan bir sifre girmesini isteyin.
                Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve başarılı şifre girinceye kadar tekrar şifre girmesini isteyin
                - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
        */

        Scanner scan = new Scanner(System.in);
        String sifre= "";
        boolean sifreBasariliMi=false;
        int kontrol=0;

        while (!sifreBasariliMi)// başarısız olduğu sürece çalışsın
        {
            //kullanıcıdan bir şifre aldık
            System.out.print("Lütfen bir şifre giriniz: ");
            sifre = scan.nextLine();
            //4 kontrolü yapalım her geçen kontrol için kontrol vaiable ını bir artıralım

            if (sifre.charAt(0) >= 'A'&&sifre.charAt(0)<='Z')
            {
                kontrol++;
            }
            else
            {
                System.out.println("İlk harf büyük harf olmalı");
            }

            //son harf kontrolu
            if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z')
            {
                kontrol++;//şart sağlıyorsa kontrolü artırdık.
            }
            else
            {
                System.out.println("Son harf küçük harf olmalı");
            }

            //boşluk kontrolü

            if (sifre.contains(" "))
            {
                System.out.println("Şifre boşluk içermemeli");
            }

            else
            {
                kontrol++;
            }

            if (sifre.length()>=8)
            {
                kontrol++;
            }
            else
            {
                System.out.println("Şifre uzunluğu en az 8 karakter olmalıdır");
            }


            if(kontrol==4)//tüm kontrollerden geçmiş demektir
            {
                System.out.println("Sifre basari ile tanimlandi");
                sifreBasariliMi=true;
                //break;
            }
            else
            {
                //şifre başarısız, tekrar başa döncek
                //ama başa dönmeden kontrol değişkeni 0 a eşitlensin
                kontrol=0;
            }


        }
















    }
}
