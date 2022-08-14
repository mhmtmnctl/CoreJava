package day16_forLoop;

import java.util.Scanner;

public class forLoop4 {
    public static void main(String[] args) {


        /*
        Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

Input :1238

Output :Girilen Numananin Tersi: 8321
         */
                    //123

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir tamsayı giriniz :");
        String sayi = scan.next();
        String tersSayi= "";

        for (int i = sayi.length()-1; i >=0 ; i--)
        {
            tersSayi += sayi.substring(i,i+1);

        }
        System.out.println(tersSayi);







    }
}
