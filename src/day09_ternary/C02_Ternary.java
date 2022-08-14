package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        // Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        //eğer ternary içindeki sonuçlar farklı data türlerinde ise atama yapamayız. sadece yazdırabiliriz
        // double sonuc =  sayi>0 ? "Sayı pozitif" : (sayi*sayi);

        System.out.println(sayi>0 ? "Sayı pozitif" : (sayi*sayi));

    }
}
