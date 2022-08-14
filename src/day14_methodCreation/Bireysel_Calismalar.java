package day14_methodCreation;


import day13_method_Creation.C04_MethodCreation;

import java.util.Scanner;

public class Bireysel_Calismalar {
    public static void main(String[] args) {
        int sayi1= 50;
        int sayi2= 40;
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen aşağıdaki seçeneklerden birini seçiniz.\n"+"1---Toplama\n"+
                "2---Cıkarma\n"+"3---Bölme\n"+"4---Carpma\n" + "Giriş yapınız :");
        int giris= scan.nextInt();
        switch (giris){
            case 1:toplama(sayi1,sayi2);
            break;
            case 2:   cikarma(sayi1,sayi2);
            break;
            case 3:  bol(sayi1,sayi2);
            break;
            case 4:   carp(sayi1,sayi2);
            break;
            default:
                System.out.println("Lütfen geçerli bir seçenek giriniz");


        }

    }

    public static void toplama(int giris1, int giris2) {

        System.out.println("Toplam : " + (giris1+giris2));


    }

    public static void carp(int i,int j) {

        System.out.println("Carpma :" + (i*j));


    }

    public static void bol(int i, int j){

        System.out.println("Bölme : " + (i/j));

    }
    public static void cikarma (int k,int l){

        System.out.println("Cıkarma :" + (k-l));

    }


}
