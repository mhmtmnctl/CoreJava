package day16_forLoop;

import java.util.Scanner;

public class ForLoop3 {
    public static void main(String[] args) {

        /*
        Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi yazıniz.

Input : 6

Output: 6!=654321=720
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir pozitif tamsayı giriniz :");
        int sayi = scan.nextInt();
        int sonuc =1;
        String carpimNo = "";

        for (int i = sayi; i >=1 ; i--) {

            sonuc *=i;

            carpimNo += String.valueOf(i);


        }
        System.out.println(sayi+"!="+carpimNo+"="+sonuc);




    }
}
