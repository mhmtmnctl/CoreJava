package day15_overloading_forLoop;

public class C01_ReturnMethod {

    public static void main(String[] args) {

        // verilen iki sayıyı carpıp sonucu bize döndüren bir metot yapalım
        //yazdırsın diyorsa void...döndürsün, return etsin diyorsa return metot kullancaz

        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1,sayi2);
        System.out.println("illa da sonucu göreyim diyorsan... : " + sonuc);
        System.out.println("kör bile bi göreyim demiş");

    }

    public static int carpGetir(int sayi1, int sayi2) {

       return  sayi1*sayi2;
    }
}
