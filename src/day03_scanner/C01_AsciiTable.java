package day03_scanner;

public class C01_AsciiTable
{
    public static void main(String[] args)
    {
        int sayi =10;
        char harf ='a';
        String str =  "banan";
        System.out.println(sayi+harf);// 10a değil  107 oldu
        System.out.println(str+harf); // banana oldu
        System.out.println(harf+2);
        System.out.println(str+sayi + harf);//banan10a
       // char yeniHarf= harf +2;

        /*
          1-  char data türü işleme girdiği değişkenin türüne göre farklı davranabilir.
              eğer matematiksel işleme girdiği variable sayısal bir değer ise sayı gibi davranır.

                char yeniHarf= harf +2; java önce sağdaki işlemi yapar.Sağda int+char görünce ascii değerini alır ve sonucu 99 bulur.
                sonra atama işlemi yaapmaya çalışır. char yeniHarf=99; bu ataam java açısından kabul edilebilir değildir

           2- str+harf String variable çok güçlüdür.. hangi data türü ile işleme girerse girsin diğer data türünü kendine benzetir.

         */

        //peki... konsolda verilen değişkenleri kullanarak 10a görmek istersek nasıl yazdırmalıyız?
        System.out.println(""+sayi+harf);

    }
}
