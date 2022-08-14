package day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {

 /*
        Soru12)Kullanıcıdan 4 basamakli bir sayi girmesini isteyin.
        Girdiği sayi 5’e     bölünüyorsa son rakamını kontrol edin.
        Son rakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        Son rakamı 0 değil ise “5’e bölünen tek sayı” yazdırın.
        Girdiği sayi 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir tamsayi giriniz");
        int sayi= scan.nextInt();
        // sayinin 5'e bolunup bolunmemesi
        // sayinin son basamaginin sifir olup olmamasi
        if (sayi<1000 || sayi>9999){
            System.out.println("Lutfen 4 basamakli sayi girin");
        } else if(sayi%5==0){ // sayi 4 basamakli ve 5'e tam bolunebiliyor
            if (sayi%10==0){
                System.out.println("5’e bölünen çift sayı");
            }else {
                System.out.println("5’e bölünen tek sayı");
            }
        }else { // sayi 4 basamakli ama 5'e bolunemiyor
            System.out.println("Tekrar deneyin");
        }


    }
}
