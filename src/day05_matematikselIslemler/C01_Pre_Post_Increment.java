package day05_matematikselIslemler;

public class C01_Pre_Post_Increment {
    public static void main(String[] args) {


        int sayi1= 10;
        int sayi2= sayi1 +1 ;  // sayi2--> 11
        sayi2 +=5; // sayi2-->16
        /*
        pre veya post increment/decrement
        sadece ++ ve -- islemi icin gecerlidir
        bu iki islem icin sayidan sonra veya once yazilmasina gore farkli iki isleyis olur
         */
        int sayi3 = sayi2++;    // 1- sayi2 degeri, sayi3'e atanacak
        // 2- sayi2 bir artirilacak
        /*
        ++ veya -- variable'dan sonra olursa buna post....
        bu durumda o satirda yapilan iki islemden
        artirma veya azaltma islemi sonuncudur
         */
        System.out.println("sayi3 : " + sayi3); // 16
        System.out.println("sayi2 : " + sayi2); // 17
        int sayi4=++sayi1;      // 1- sayi1 bir artirilacak
        // 2- sayi1 degeri, sayi4'e atanacak
        /*
        eger ++ veya -- variable'dan once ise buna pre.... denir
        bu durumda o satirda yapilan iki islemden oncelikli olan
        artirma veya azaltmadir
         */
        System.out.println("sayi4 : " + sayi4); // 11
        System.out.println("sayi1 : " + sayi1); // 11

    }
}
