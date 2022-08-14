package day12_stringManipulations;

import java.util.Scanner;

public class C03_subString {
    public static void main(String[] args) {

        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartNo= "1234 6589 7458 9658";

        System.out.println(isim.substring(3)); //index 3ü bulcak, index3 ve sona kadar vercek "eyman" olcak
        System.out.println(soyisim.substring(soyisim.length()-3)); // fil

        System.out.println(isim.substring(2,4));//le  // 2 dahi 4 değil...

        //isim ve soyismin ilk harfi büyük harf, geriye kalan *
        //kredi kartının ilk 4 rakamı görünsün geriye kalan * olsun

       String isimIlkHarf= isim.substring(0,1).toUpperCase();//ilk harfi alıp büyük yaptık
       String isimGeriyeKalanlar = isim.substring(1).replaceAll("\\w","*");//S hariç hepsini * yaptık

       String soyisimGeriyeKalanlar = soyisim.substring(1).replaceAll("\\w","*");//aranfili * yaptık
        String soyIsimIlkHarf = soyisim.substring(0,1).toUpperCase();
        String krediKartiIlk4= kartNo.substring(0,4);//4 yazdık çünkü index 0dan başlıyor
        String krediKartıGeriyeKalanlar = " **** **** ****"; // kk numaraları 16 karakter old. için bu şekilde manuel yazdık


        System.out.println(isimIlkHarf+isimGeriyeKalanlar+ " "+
                             soyIsimIlkHarf+soyisimGeriyeKalanlar+"\n"+
                              krediKartiIlk4+krediKartıGeriyeKalanlar);



    //   Scanner scan = new Scanner(System.in);
    //   System.out.println("Lütfen adınızı giriniz");
    //   String ad= scan.nextLine();
    //   System.out.println("Lütfen soyadınızı giriniz");
    //   String soyad= scan.nextLine();
    //   System.out.println("Lütfen kredi kartı numaranızı giriniz.");
    //   String kkn= scan.nextLine();

    //   String isimIlkHarf= ad.substring(0,1).toUpperCase();
    //   String isimGeriyeKalanlar = ad.substring(1).replaceAll("\\w","*");

    //   String soyIsimIlkHarf = soyad.substring(0,1).toUpperCase();
    //   String soyisimGeriyeKalanlar = soyad.substring(1).replaceAll("\\w","*");
    //   String krediKartıGeriyeKalanlar = " **** **** **** ";

    //   String kkSonDört = kkn.substring(12);

    //   System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
    //                       soyIsimIlkHarf+soyisimGeriyeKalanlar+"\n"+
    //                       krediKartıGeriyeKalanlar+krediKartiIlk4);





    }
}
