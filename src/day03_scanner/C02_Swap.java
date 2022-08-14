package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {
            /*
            Verilen sayi1 ve sayi2 variable’larinin degerlerini degistiren (SWAP) bir program yaziniz
             Orn  : sayi1=10 ve sayi2=20;
             kod calistiktan sonra
             sayi1=20 ve sayi2=10

             */
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 0;
        //1-sayı2 yi boş kovaya koyalım
        sayi3 = sayi2;
        //1.sayıyı 2.sayıya atıycaz
        sayi2 = sayi1;
        //sayı3 deki değeri sayı1 e atadık.
        sayi1 = sayi3;
        //sayi3 geçici kovamız. geçici değişken.

        System.out.println("sayi1:" + sayi1 + " sayi2:" + sayi2 + " sayi3:" + sayi3);

    }
}
