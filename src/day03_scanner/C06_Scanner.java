package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //Kullanıcıdan ismini soyismini ve yaşını alıp girilen bilgiler
        //seyfi çapar 34 şeklinde yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz");
        String isim = scan.nextLine(); // iki kelime girmek isterlerse
        System.out.println("Lütfen soyadınızı giriniz");
        String soyisim = scan.nextLine();
        System.out.println("Lütfen yaşınızı giriniz");
        String yas = scan.next();
        System.out.println("Adınız: " + isim +" Soyadınız: "+ soyisim + " Yaşınız: " +yas);



    }
}
