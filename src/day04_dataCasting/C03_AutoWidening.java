package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {

        //dar veri türündeki bir değeri geniş veri türündeki variable'a otomatik olarak assign eder.

        byte sayi1 = 23;
        short sayi2 = 55;
        int sayi3= sayi1+sayi2;//88

        double sayi4= sayi1*sayi2;//1265.0



        sayi4=(double)sayi2/sayi1;//sayılardan birini double yapıyoruz. yani sayi2 double oldu. double olunca sonuç double oldu
        System.out.println(sayi4);//



    }
}
