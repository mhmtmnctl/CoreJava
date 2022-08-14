package day11_String_manipulations;

import java.util.Scanner;

public class homeworks {
    public static void main(String[] args) {

//       //Kullanıcıdan bir harf ve cümle isteyin.
//       //Girilen harf cümlede varsa vardır, yoksa yoktur yazdırın
//       Scanner scan = new Scanner(System.in);
//       System.out.println("Lütfen bir cümle giriniz");
//       String cumle = scan.nextLine();
//       System.out.println("Lütfen bir harf giriniz");
//       String harf = scan.next();

//       if (cumle.indexOf(harf)==-1)
//       {
//           System.out.println("Girdiğiniz harf cümlede yoktur");
//       }
//       else
//       {
//           System.out.println("Girdiğiniz harf cümlede vardır");
//       }


        /*
            Kullanıcıdan bir cümle ve bir kelime alın
            kelimenin cümledeki kullanımına bakarak aşağıdaki 3 durumu yazdırın
            -Girilen kelime cümlede kullanılmamış
            -Girilen kelime cümlede bir kere kullanılmış
            -Girilen kelime cümlede birden fazla kullanılmış
         */

    //    Scanner scan = new Scanner(System.in);
    //    System.out.println("Lütfen bir cümle giriniz");
    //    String cumle = scan.nextLine();
    //    System.out.println("Lütfen bir kelime giriniz");
    //    String kelime = scan.next();
    //    if(cumle.indexOf(kelime)==-1)
    //    {
    //        System.out.println(""); //burdan devam et.
    //    }

  //      Scanner scan = new Scanner(System.in);
 //       System.out.println("Lütfen adınızı giriniz");
 //       String ad= scan.nextLine();
 //       System.out.println("Lütfen soyadınızı giriniz");
 //       String soyad= scan.nextLine();
 //       System.out.println("Lütfen kredi kartı numaranızı giriniz.");
 //       String kkn= scan.nextLine();
//
 //       String isimIlkHarf= ad.substring(0,1).toUpperCase();
 //       String isimGeriyeKalanlar = ad.substring(1).replaceAll("\\w","*");
//
 //       String soyIsimIlkHarf = soyad.substring(0,1).toUpperCase();
 //       String soyisimGeriyeKalanlar = soyad.substring(1).replaceAll("\\w","*");
//
 //       String krediKartıGeriyeKalanlar = " **** **** **** ";
 //       String kkSonDört = kkn.substring(12);
//
 //       System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
 //               soyIsimIlkHarf+soyisimGeriyeKalanlar+"\n"+"CCN :"+
 //               krediKartıGeriyeKalanlar+kkSonDört);



        Scanner scan = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double sayi1 = scan.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        double sayi2 = scan.nextDouble();
        long esik=10000000000l;
        if (!(sayi1>=0 && sayi2>=0))
        {
            System.out.println("Lütfen 0'dan büyük veya eşit sayılar giriniz");
        }
        else if (sayi1>=esik||sayi2>=esik)
        {
            System.out.println("Lütfen en fazla 10 basamaklı sayı giriniz.");
        }
        else if((sayi1+sayi2) >= esik)

        {
            System.out.println("OverFlow");
        }

        else
        {
            System.out.println("Numaralarin Toplami: \n"+(int)(sayi1+sayi2));
        }



    }
}
