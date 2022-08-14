package day02_variables;

public class C01_ClassWork
{
    public static void main(String[] args)
    {
        //1- Farklı 3 data türünde variable oluşturun ve bunları yazdırın
        System.out.println("Ödev 1-------------------------");
        int sayi = 10;
        boolean guzelmi = true;
        char number = '3';
        System.out.println("Sayı: " + sayi);
        System.out.println("Guzel mi? " + guzelmi);
        System.out.println("numara: " + number);

        //2-İsim ve soisim için iki variable oluşturun ve yazdırın.
        System.out.println("Ödev2--------------------------");
        String isim = "Mehmet";
        String soyIsim= "Bulutluoz";
        System.out.println("İsminiz : " + isim);
        System.out.println("soyisminiz : " + soyIsim);

        //3-iki farklı tamsayı data türünde 2 değişken oluşturp toplamını yazdırın
        System.out.println("Ödev3--------------------------");
        int sayi1 = 10;
        byte sayi2 = 8;
        System.out.println("Toplam: " + sayi1+sayi2);

        //4-Bir tamsayı ve bir ondalılı değişken oluşturup topalmını yazdır
        System.out.println("Ödev4--------------------------");
        int sayi3 = 5;
        double sayi4= 12.5;
        System.out.println("Toplam: " + (sayi3 + sayi4));

        //5-Char data türünde bir variable oluşturup yazdırın
        System.out.println("Ödev5--------------------------");
        char karakter = '%';
        System.out.println("Yazdırılan karakter: " + karakter);

        //6-Bir tamsayı bir de char değişken oluşturup toplamını yazdırın :)
        System.out.println("Ödev6--------------------------");
        int sayi5= 5;
        char chr = 'b';// b nin ascii değeri 98 olduğu için sonuç 103 oldu
        System.out.println("Toplam: " +(sayi5+chr));






    }
}
