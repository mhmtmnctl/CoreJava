package day09_ternary;

import java.util.Scanner;

public class HomeWorks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dakikayı giriniz");
        int girdi = scan.nextInt();
        int dk = girdi;

        int yil= girdi/525600;
        girdi= girdi-yil*525600;

        int gun = girdi/1440;

        System.out.println(dk+" dakika yaklaşık " + yil+ " yıl " + gun +" gündür");






        //soru1- kullanıcıdan iki sayı alın ve büyük olmayan sayıyı yazdırın

     //  double sayi1,sayi2;
     //  Scanner scan = new Scanner(System.in);
     //  System.out.println("Lütfen birinci sayıyı giriniz.");
     //  sayi1= scan.nextDouble();
     //  System.out.println("Lütfen ikinci sayıyı giriniz.");
     //  sayi2= scan.nextDouble();
     //  System.out.println((sayi1>sayi2) ? (sayi2) : (sayi1));



        //soru2 kullanıcıdan bir tamsayı alın ve tekmi çift mi yazdırın

    //    Scanner scan = new Scanner(System.in);
    //    System.out.print("birinci sayıyı giriniz: ");
    //    int sayi1= scan.nextInt();
    //    System.out.println((sayi1%2==0) ? ("sayı çittir") : ("sayı tektir"));



        //soru3- kullanıcıdan bir sayı alın ve mutlak değerini yazdırın

    //    Scanner scan = new Scanner(System.in);
    //    System.out.println("Lütfen bir sayı giriniz");
    //    int sayi= scan.nextInt();
    //    System.out.println((sayi>=0) ? (sayi):(sayi*-1));



        //soru4- kullanıcıdan bir sayı alın. Sayı pozitifse "sayı pozitif" yazdırın. negatifse sayının karesini yazdırın

    //    Scanner scan = new Scanner(System.in);
    //    System.out.print("Lütfen bir sayı giriniz: ");
    //    int sayi = scan.nextInt();
    //    System.out.println((sayi>0) ? ("Sayı pozitif") : (sayi*sayi));




        //Soru5- kullanıcıdan dikdörtgenin uzunluğunu ve genişliğini alın. girilen değerlere göre diikdörtgenin kare olup olmadığını yazdırın

    //    Scanner scan = new Scanner(System.in);
    //    System.out.print("Lütfen kenarı giriniz: ");
    //    int knr1= scan.nextInt();
    //    System.out.print("Lütfen diğer kenarı giriniz: ");
    //    int knr2 = scan.nextInt();
    //    System.out.println((knr2==knr1) ? ("Bu bir karedir") : ("Kare değildir"));

        //soru6- kullanıcıdan bir sayı alın ve 3 basamaklı ise "üç basamaklı sayı, değilse üç basamaklı değil yazdırın

    //    Scanner scan = new Scanner(System.in);
    //    System.out.print("Lütfen bir sayı giriniz: ");
    //    int sayi= scan.nextInt();
    //    System.out.println((sayi>=100 && sayi<1000) ? ("üç basmaklı bir sayı") : ("üç basamaklı değil"));


         //soru7-kullanıcıdan haftanın kaçıncı günü old. sorun ve o günü yazdırın

 //       Scanner scan = new Scanner(System.in);
 //       System.out.print("Lütfen kaçıncı gün olduğunu girin    :");
 //        int gun = scan.nextInt();
 //
 //        switch (gun)
 //        {
 //            case 1:
 //                System.out.println("Pazartesi");
 //            break;
 //            case 2:
 //                System.out.println("Salı");
 //            break;
 //            case 3:
 //                System.out.println("Çarşamba");
 //            break;
 //            case 4:
 //                System.out.println("Perşembe");
 //                break;
 //            case 5:
 //                System.out.println("Cuma");
 //                break;
 //            case 6:
 //                System.out.println("Cumartesi");
 //                break;
 //            case 7:
 //                System.out.println("Pazar");
 //                break;
 //            default:
 //                System.out.println("Lütfen geçerli bir sayı giriniz.");


        //soru8-kullanıcıdan SDET kısaltmasındaki harflerden birini yazmasını isteyin. S ise software
        //D ise developer,E ise engineer, T ise In testing yazdırın

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lütfen SDET harflerinden birini giriniz.");
//        String harf = String.valueOf(scan.next().toUpperCase().charAt(0));
//
//        switch (harf){
//
//            case "S":
//                System.out.println("Software");
//                break;
//            case "D":
//                System.out.println("Developer");
//                break;
//            case "E":
//                System.out.println("Engineer");
//                break;
//            case "T":
//                System.out.println("In Testing");
//                break;
//            default:
//                System.out.println("lütfen geçerli bir değer giriniz");


  //       }



    }
}
