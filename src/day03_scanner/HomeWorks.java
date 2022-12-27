package day03_scanner;

import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {


        //1-kullanıcıdan iki tamsayı alıp bu sayıların toplam,fark ve çarpımlarını yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1.sayıyı giriniz...");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen 2.sayıyı giriniz...");
        int sayi2= scan.nextInt();
        System.out.println("Sayıların Toplamı= " +(sayi1+sayi2) + " Sayıların farkı = "+(sayi1-sayi2)+" Sayıların Çarpımı= "+(sayi1*sayi2));

        //2-kullanıcıdan karenin bir kenar uzunluğunu alın ve çevresini ve alanını hesaplayıp yazdırın
        System.out.println("Lütfen karenin bir kenarını giriniz.");
        int kareKenar= scan.nextInt();
        System.out.println("Karenin alanı=" + (kareKenar*kareKenar)+" Karenin çevresi=" +(kareKenar*4));

        //3-kullanıcıdan yarıçap isteyip çemberin çevresini ve dairenin alanını hesaplayıp yazdırın
         //çevre = 2*pi*r  alan= pi*r2
        System.out.println("Lütfen çemberin yarı çapını giriniz.");
        int r= scan.nextInt();
        System.out.println("Çemberin çevresi= "+(int)(2*3.14*r) + " Çemberin alanı=" +(int) (3.14*r*r));
        //4-Kullanıcıdan dikdörtgenler prizmasının uzun,kısa kenarlarını ve yüksekliğini isteyip prizmanın hacmini hesaplayıp yazdırın
        System.out.println("lütfen uzun kenarı giriniz.");
        int uzn= scan.nextInt();
        System.out.println("Lütfen kısa kenarı giriniz.");
        int ks= scan.nextInt();
        System.out.println("lütfen yüksekliği giriniz.");
        int h= scan.nextInt();
        System.out.println("Dikdörtgenler prizmasının hacmi="+ (uzn*ks*h));
        scan.nextLine();


        //5-Kullanıcıdan ismini ve soy ismini alıp alt alta yazdırın
        //Scanner scan = new Scanner(System.in);
        System.out.println("\nLütfen isminizi giriniz:");
        String isim = scan.nextLine();//nextline birden fazla değer girip entere basınca diğerini iste
        System.out.println("Lütfen soyisminizi giriniz.");
        String soyIsim = scan.nextLine();
        System.out.println("İsminiz: " + isim + "\nSoyisminiz:  " + soyIsim + "\nKursumuza katılımınız alınmıştır, teşekkür ederiz ");

        //6-Kullanıcıdan ismini ve soyismini alıp aralarında bir boşluk oluşturarak yazdırın
       // Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String ad = scan.nextLine();
        System.out.println("Lütfen soyadınızı giriniz");
        String soyAd = scan.nextLine();
        System.out.println("İsim-soyisim: "+ad+" "+soyAd);


        //7-Kullanıcıdan ismini alıp baş harfini yazdırın, hatta büyük harfle yazdırın

     // Scanner scan = new Scanner(System.in);
      System.out.println("Lütfen isminizi giriniz");
      String adiniz = scan.nextLine();
      char ilkHarf= adiniz.toUpperCase().charAt(0);
        System.out.println("İSminizin ilk harfi: "+ilkHarf);





    }
}
