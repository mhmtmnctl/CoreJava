package day05_matematikselIslemler;

public class C04_WrapperClass {
    public static void main(String[] args) {

        String str = "Java cok guzel";
        str.toUpperCase();

        int sayi= 10;
        //primitive data türlerinin yanında metotlar olmaz.
        //java bazı metotları kullanabilmemiz için her bir primitive data türü için bir wrapper class oluşturmuştur.
        //wrapper sarmalayıcı demek. non-primitive dir.
        Integer sayi2= 10;

        sayi2.byteValue();



    }
}
