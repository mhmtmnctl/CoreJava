package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {


        Car car1 = new Car(); //obje oluşturduk

        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="Toyota";

        //modelini yazmayalım, unutmuş olalım...bakalım ne gelcek

        System.out.println(" Car1 bilgileri \n Marka : "+car1.marka+"\n Model: "+car1.model
                           +"\n Yıl: "+car1.yil+"\n Fiyat: "+car1.fiyat);

        Car car2 = new Car();

        System.out.println(" Car2 bilgileri \n Marka : "+car2.marka+"\n Model: "+car2.model
                +"\n Yıl: "+car2.yil+"\n Fiyat: "+car2.fiyat);

        /*
        herhangibir obje üzerinden bir variable yazdırmaya çalıştığımızda java değeri şu sıralama ile arar
        1- o obje oluştutulduktan sonra bir değer atandı mı?
        2- objenin oluşturulduğu classda variable'a bir değer atanmış mı bakar.
        3- o zaman data türüne göre java default değeri atar.

         */



    }
}
