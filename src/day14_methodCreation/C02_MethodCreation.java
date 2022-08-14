package day14_methodCreation;

import day13_method_Creation.C04_MethodCreation;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //verilen 3 basamaklı bir sayının rakamları toplamını yazdıran bir method oluşturalım
        int input = 423;
        rakamlariTopla(input);

        C04_MethodCreation.topla(4,6); // diğer classdan metot da çağıralım extra
        C01_MethodCreation.terstenYazdir("nuri");
    }

    public static void rakamlariTopla(int input) {

        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        birlerBasamagi = input%10;//birler bas verdi
        rakamlarToplami+=birlerBasamagi;//rakamlar toplamına ekledik
        input/=10;
        birlerBasamagi = input%10;//birler bas verdi
        rakamlarToplami+=birlerBasamagi;//rakamlar toplamına ekledik
        input/=10;

        birlerBasamagi = input%10;//birler bas verdi
        rakamlarToplami+=birlerBasamagi;//rakamlar toplamına ekledik
        input/=10;

        System.out.println("Verilen sayının rakamlar toplamı : " + rakamlarToplami);


    }



}
