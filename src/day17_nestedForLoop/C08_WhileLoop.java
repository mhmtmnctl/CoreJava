package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan toplanmak üzere sayılar alın.
            Sayıalrın toplamı 500'ü geçince(dahil değil) sayıların toplamını ve kaç sayı toplandığını şu şekilde yazdırın
            13 sayı girdiniz ve toplamları 567
         */
        int toplam = 0;
        int sayi = 0;
        Scanner scan = new Scanner(System.in);
        int sayac =0;



        while(toplam<500)
        {
            System.out.print("Lütfen toplamak için sayı girin : ");
            sayi = scan.nextInt();
            toplam+=sayi;
            sayac++;
            System.out.println(" Toplam " + toplam);

        }
        System.out.println(sayac + " Sayı girdiniz ve toplamları " + toplam);


    }
}
