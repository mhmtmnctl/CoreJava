package day18_while_doWhile;

public class C01_WhilwLoop {
    public static void main(String[] args) {
    /*
    Soru 4 ) Kullanicidan baslangic ve bitis haflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin.

     */

        char ilkHarf = 'f';
        char sonharf = 't';
        char temp = ilkHarf; //ilk harfi kaybetmemek için
        String buyult="";
        while (temp<=sonharf)
        {
            buyult=(temp+"").toUpperCase();
            System.out.print(buyult+" ");
            temp+=1;
            buyult=temp+""; // hata vermemesi için hiçlik ekledik
        }


    }
}
