package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static{
        /*
        static block class uyelerinin tamamindan once calisir
        (main methoddan bile once)

        static block class olusturuldugunda calisir genellikle de class la ilgili
        ilk(ön ayar) ayarlamalar veya static variable lara deger atamak icin kullanilir

        static blocklarinn class icerisinde nerede oldugu onemli degildir
        once static blocklar calisir

        birden fazla static block varsa yukaridan asagi dogru calisir
         */

        System.out.println("static block calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("main method calisti");
        System.out.println(sayi);

    }
static{
    System.out.println("main method altindaki static clock calisti");
}
}
