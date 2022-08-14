package day04_dataCasting;

public class HomeWorks {
    public static void main(String[] args) {

        //1-byte ver tipinde bir değişken oluşturup short,int,float,double data tiplerinde auto widening yap
        byte sayi = 100;
        System.out.println(sayi);

        short sayi2 = sayi;
        System.out.println(sayi2);

        int sayi3 = sayi2;
        System.out.println(sayi3);

        float sayi4 = sayi3;
        System.out.println(sayi4);
        double sayi5 = sayi4;
        System.out.println(sayi5);

        //2-int veri türünde bir değişken oluşturup adım adım narrowing yapınız.

        int sayi6= 50;
        short sayi7 = (short)sayi6;
        byte sayi8 = (byte)sayi7;
        System.out.println("sayı7="+sayi7+"sayi8:"+sayi8);

        //3-float veri türünde bir variable oluştur ve yazdır

        float flt  = 59f;
        System.out.println("float değeri:" + flt);

        //4-double 255.6 sayısını int'a ve sonra da oluşturduğumuz int sayiyi bytea çevirip yazdırın.

        double dbl = 255.6;
        int yenisayi = (int)dbl;
        byte byt = (byte)yenisayi;
        System.out.println(byt);

        //5-int saiyi birbirine böldürün ve sonucu yazdırın.

        int a=8,b=3;
        System.out.println("bölme sonucu: " + a/b);

        //6- int bir sayıyı double bir sayıya bölün sonucu yazdırın

        int c=25;
        double d= 3.7;
        System.out.println(c/d);

        //farklı data tipleri ile örnekler yapıp sonucu yazdıralım.

        byte e= 45;
        double f = 999;
        System.out.println("byte/double:"+e/f); // işleme giren en büyük data tipine göre sonuç veriyor








    }


}
