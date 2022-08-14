package day04_dataCasting;

public class C01_dataCasting {
    public static void main(String[] args) {

        char harf = 'a';
        char yeniHarf = (char)(harf+1); //kod bu durumda önce sağdaki işlemi yapar
                                //char yeniHarf = 97+1 yapar yani 98
                                //char bir variable 98 olamayacağı için java hata verir
        System.out.println("yeni harf:" +yeniHarf); //98in ascii değeri olan 'b'yi yazdırdı


        /*
            Bazen bir variable'a oluşturulduğu data türü dışından değer atanabilir.
            Bunlardan bazısını java otomatik olarak kabul eder.

            Java eğer bu değer atamasında sorun oluşacağını(data kayıplarının olabileceği veya datanın başkalaşbileceği)
            görürse bu durumda otomatik olarak bu atamayı kabul etmez. Sizden eğer bu atamayı istiyorsanız sorumluluğu almanızı bekler.



         */
        int sayi1= (int)7.3;
        System.out.println("sayi1:" + sayi1);// virgülü atar soldakine bakar. 7 yazdırır
        double sayi2 = 10;
        System.out.println("sayı2 : " + sayi2);//10.0
        int sayi3 = 'c';
        System.out.println("sayı3:" + sayi3);//99 ascii değeri
        char harf2 = 98;
        System.out.println("harf2:"+harf2); // b


    }
}
