package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        /*
 kullanicidan gun numarasini alip
 1 ise pazartesi,
 ...
 7 ise pazar yazdiralim
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();
        /*
        switch yanına yazılan parantez(gunNo) neye göre case atayacağımızı gösterir.
        Java girilen değere göre case 'i bulur ve o satırdan çalıştırmaya başlar.
        break yazısı görünceye veya switch parantezine kadar devam eder.

        if - else if - .... -else yapısında olduğu gibi hiçbir şarta uymayanları
        default keyword kullanılır.
         */

        switch (gunNo)
        {

            case 1 :
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3 :
                System.out.println("Çarşamba");
                break;
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6 :
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Lütfen geçerli bir giriş yapınız");
                break;

        }



    }
}
