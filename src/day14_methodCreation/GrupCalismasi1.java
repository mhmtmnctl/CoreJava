package day14_methodCreation;

import java.util.Scanner;

public class GrupCalismasi1 {

    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 =16;

       KareAlma(sayi1);
      cikarmaIslemi(sayi1,sayi2);
        Scanner scan = new Scanner(System.in);


    }

    public static void cikarmaIslemi(int no1,int no2) {

       int cikarmaSonuc = no1-no2;
        System.out.println(cikarmaSonuc);

    }

    public static void KareAlma(int no){

        int karesi= no*no;
        System.out.println(karesi);

    }

}
