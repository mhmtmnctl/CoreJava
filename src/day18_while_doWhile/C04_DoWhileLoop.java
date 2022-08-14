package day18_while_doWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {

        /*
        kullanıcıdan tamsayılar alın
        kullanıcı çift sayı girdiği müddetçe sayıları yazdırın
        tek sayı girdiğinde işlemi bitirin
         */

        Scanner scan = new Scanner(System.in);
        int sayi=0;
        //while ile yapalım

        /*
        looplarda kulanacağımız variable'ları loopdan önce oluşturmalıyız
        while loop'da, loopdan önce oluşturduğumuz bu variable'a atayacağımız değeri
        iyi düşünmemiz gerekiyor
         */

 //       while (sayi%2==0)
 //       {
 //           System.out.print("Lütfen bir tamsayı giriniz :");
 //           sayi = scan.nextInt();
//
 //          if (sayi%2==0)
 //          {
 //              System.out.println("Girilen sayı çift : "+sayi);
 //          }
 //          else
 //          {
 //              System.out.println("Girilen sayı tek, ben kaçar...");
 //          }
//
//
 //       }


        //do while loop ile yapalım
        //do while loopda önceden oluşturulan variable'a hangi değer atandığının hiçbir önemi yok
        //kod her durumda çalışır
        /*
        do while'ın dezavantajı :
        ilk çalıştırma kontrol yapılmadan olduğu için loopun body'sinde yanlış bir
        işlem yapılmamasına dikkat etmek gerekir
         */

        do
        {
            System.out.print("Lütfen bir tamsayı giriniz :");
            sayi = scan.nextInt();

            if (sayi%2==0)
            {
                System.out.println("Girilen sayı çift : "+sayi);
            }
            else
            {
                System.out.println("Girilen sayı tek, ben kaçar...");
            }
        }
        while (sayi%2==0);




    }
}
