package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {

        //input olarak verilen isim ve soyismi ilk harfi büyük
        //geriye kalan harfler * olacak şekilde
        //I***** K***** şeklinde yazdıran bir method oluşturun


        String isim = "Enes";
        String soyIsim = "Bozkurt";

        ismiGizle(isim,soyIsim);
        C02_MethodCreation.rakamlariTopla(654);//diğer classtakini de çağıralım

    }

    public static void ismiGizle(String isim, String soyIsim) {

     isim=   isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
     soyIsim = soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
        System.out.println(isim + " " + soyIsim);


    }
}
