package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {

    public static void main(String[] args) {
        /* Eger bir class'İn icerisinde herhangi bir hesaplama yapip bunu da kalici olarak saklamak istersek
kodumuzu sade ve anlasilir tutmak icin islemi bir method'da yapip
sonucunu main methoda dondurebiliriz
Return type'ı void olmayan bir methodun sonucunu main method'da bir variable'a atama yaparsak programin geri kalaninda
bu yeni degeri kullanma sansimiz olur

 */

        //kullanıcıdan şehir ismini ve doğum tarihini alıp
        //bunları programda kullanacağımız formatta bize döndüren bir metot oluşturun
        //şehir ismini programımızda büyük harf olarak
        //tarihi ise 2022-06-30 şeklinde kullanmak istiyoruz
        String sehir = sehirAl();
        String tarih = tarihAl();
        System.out.println("Girdiğiniz şehir : "+sehir+" Girdiğiniz tarih : " + tarih);



    }

    public static String tarihAl() {
        String tarih = "";

        Scanner scan = new Scanner(System.in);
        System.out.print("Yılı giriniz :");
        int yil = scan.nextInt();
        if(yil<1900 || yil>2100)
        {
            System.out.println("Yıl için geçerli bir sayı giriniz(1900-2100)");

        }
        else
        {
            tarih= yil+"-";

        }

        System.out.print("Kaçıncı ay olduğunu yazınız :");
        int ay= scan.nextInt();
        if(ay<=0 || ay>12)
        {
            System.out.println("Lütfen ay no 1-12 arasında giriniz");
        }
        else if (ay<10)
        {
            tarih=tarih+"0"+ay+"-";
        }
        else
        {
            tarih= tarih+ay+"-";
        }

        System.out.println("Lütfen ayın kaçıncı günü olduğunu giriniz");
        int gun = scan.nextInt();
        if (gun<=0 || gun >31)
        {
            System.out.println("Gün no olarak 1-31 arasında sayı girilmelidir.");
        } else if (gun<10)
        {
            tarih=tarih+"0"+gun;
        }
        else
        {
            tarih=tarih+gun;
        }

        return tarih;
    }

    public static String sehirAl() {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen şehir adı giriniz :");
        String sehirAdi = scan.nextLine().toUpperCase();
        return sehirAdi;

    }


}
