package day37_overriding;

public class FSupra extends EToyota{

   // @Override
    void yakit(){
        System.out.println("Supra benzin kullanir");
        /*
        Private method'lar override edilemez
        Eger Child class da parent class'taki private method ile
        ayni signature da bir method olusturursaniz
        bu overriding method olmaz
         */
    }

    @Override
    void motor() {
        /*
        @Override notasyonu Java ya bir gorev verir
        Java, bu notasyonla birbirine bagli olan iki methodu
        surekli kontrol eder
        Eger parent class taki overriden methodu silerseniz CTE verir

        @override notasyonu kullanmak mecburi degildir
         eger override methodu silinirse  kodun Cte vermesini istersek

         */

    }
}
