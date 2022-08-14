package day03_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini isteyin girilen ismi, isminiz.... şeklinde yazdırın.
        //İnsanların dünyasından kodlarımın bulunduğu dünyaya değer almak için scanner clasını kullanırız
        //1-scanner objesi oluşturalım.
        Scanner scan = new Scanner(System.in);
        //2-kullanıcıya ne istediğimizi söyliyelim
        System.out.println("Lütfen adınızı giriniz");
        //3-oluşturduğumuz scan objesi ile kullanıcının girdiği değeri alıp oluşturacağımız uygun bir variable'a atıyalım
        String isim =scan.next();
        System.out.println("isminiz:" + isim);


    }
}
