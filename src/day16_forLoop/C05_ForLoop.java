package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
         Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
          sonucu yazdiran bir program yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen başlangıç ve bitiş değerlerini girin(pozitif tamsayı olarak)");
        int baslangic = scan.nextInt();
        int bitis = scan.nextInt();

        aralariTopla(baslangic,bitis);




    }

    public static void aralariTopla(int baslangic, int bitis) {
        int toplam= 0;
        if(baslangic<=bitis)
        {
            for (int i = baslangic; i <=bitis ; i++) {
                toplam+=i;

            }
        }
        else
        {
            for (int i = bitis; i <=baslangic ; i++) {
                toplam+=i;


            }
        }
        System.out.println("Aradaki sayıların toplamı : "+toplam);
    }
}
