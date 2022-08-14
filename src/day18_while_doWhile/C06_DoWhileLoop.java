package day18_while_doWhile;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini
        ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int pozSayiAdedi = 0;
        int negSayiAdedi = 0;
        int pozSayilarTop=0;
        do
        {
            System.out.println("lütfen toplamak üzere pozitif tamsayı giriniz :");
            sayi= scan.nextInt();
            if (sayi>0)
            {
                pozSayilarTop+=sayi;
                pozSayiAdedi++;
            } else if (sayi<0)
            {
                negSayiAdedi++;
                System.out.println("Negatif sayı giremezsiniz");
            }

        }
        while (sayi!=0);//sayı 0 a eşit oladığı sürece devam etcek
        System.out.println(pozSayiAdedi + " adet pozitif sayı girdiniz, toplamları :"+pozSayilarTop );
        System.out.println(negSayiAdedi+ " adet negatif sayı girdiniz ancak onlar toplama dahil edilmedi");



    }
}
