package day31_timeFormatter_varargs;

public class C03_VarargsIleKodlama {
    public static void main(String[] args) {

        // verilen kac int olursa olsun
        //hepsini toplayip sonucu yazdiran bir method olusturun

        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;

        toplaYazdir(sayi1, sayi2, sayi3,sayi4,sayi5);
        toplaYazdir(sayi1, sayi2, sayi3,sayi4);
        toplaYazdir(sayi1, sayi2, sayi3);
        toplaYazdir(sayi1, sayi2);
        toplaYazdir(sayi1);

        toplaYazdir();

    }
    public static void toplaYazdir(int... sayi){
        /*
        int...sayi   bu gosterim integerlardan olusan bir varargs demektir
        varargs array altyapisi kullanir

         */
       // (sayi, sayi2 ...........)
        int toplam = 0;
        int sayiAdedi= sayi.length;
        for (int each : sayi) {
            toplam+=each;
        }
        System.out.println("girilen "+sayiAdedi+ " adet sayinin toplami : "+toplam);

    }

}
