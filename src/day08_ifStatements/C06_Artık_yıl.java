package day08_ifStatements;

import java.util.Scanner;

public class C06_Artık_yıl {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yil giriniz");
        int yil= scan.nextInt();
        if (yil%4 != 0){
            System.out.println("Artik yil degil");
        } else if(yil%100 !=0){
            System.out.println("artik yil");
        } else if (yil%400 !=0){
            System.out.println("Artik yil degil");
        } else {
            System.out.println("artik yil");
        }


    }
}
