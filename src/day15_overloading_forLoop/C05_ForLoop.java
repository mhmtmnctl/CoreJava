package day15_overloading_forLoop;

public class C05_ForLoop {
    public static void main(String[] args) {

        //1'den 5' kadar (5 dahil)olan tamsayıları toplayalım
        int toplam = 0;

        for (int i = 1; i <= 5; i++)
        {
            toplam+=i;
            //System.out.println(toplam);// buraya yazarsak her seferinde bu kodda çalışacağından sürekli yazdırır
        }
        System.out.println("Toplam : "+toplam); // dışında yazarsak en son değerini görürüz.

        //10 dahil 20 dahil arasını yazdır
        toplam = 0;
        for (int i = 10; i <=20 ; i++)
        {
            toplam+=i;
        }
        System.out.println("10-20 arası toplam: "+toplam);

        //30 dahil 50 dahil aradaki çift sayıları yaz

        toplam = 0;
        for (int i = 30; i <=50 ; i+=2) {

            toplam+=i;

        }
        System.out.println("30-50 arası çift olanların toplamı" + toplam);

        //2.yöntem

        toplam = 0;
        for (int i = 30; i <=50; i++) {
            if(i%2==0)
            {
                toplam+=i;
            }

        }
        System.out.println("30-50 arası ikinci yöntem toplam sonucu: "+toplam);


        //1500 ile 1600 arası (sınırlar dahil ) arasında 7 ile bölünebilen sayıların toplamı

        toplam=0;
        for (int i = 30; i <=50 ; i++) {
            if(i%7==0)
            {
                toplam+=i;
            }


        }
        System.out.println("1500-1600 arası 7 ile bölüm toplamı " +toplam);




    }


}
