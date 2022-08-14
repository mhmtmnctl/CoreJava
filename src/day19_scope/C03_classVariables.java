package day19_scope;

public class C03_classVariables {


    public static void main(String[] args) {

        /*
        Farklı bir class'da çalışırken herhangi bir class adını yazıp "." ya basarsak
        adını yazdığımız class'taki tüm statik class üyelerini görebilir ve kullanabiliriz.

         */

        C02_staticVariables.staticMethod();// c02 ye gider... tüm classı değil classdaki metodu çalıştırır. 10u alır getirir
        System.out.println(C02_staticVariables.statSayi);//10 sadece C02 deki variable' gider... tüm class'a değil
        System.out.println(C02_staticVariables.degersizStaticVariable);//C02 deki degersizStaticVariable a gitti.
        //ama değeri yok... hayda... o zaman default değerini yazdırır..
        /*
        class level variable'lara değr atayıp atamamak bize kalmıştır. İstersek değer atamsaı yaparız, istemezsek
        değer atamayız.
        Eğer değer atamışsak java atadığımız o değeri kabul eder.
        değer atamazsak java bu variable'lara default bir değer ataması yapar.
        int --> için 0
        String --> için null
        boolean --> false
        char ---> '' hiçlik tir. (char olarak)

         */

        /*
        başka class taki instance variable'lara (static olmayan) obje oluşturarak ulaşabiliriz
         */


    C02_staticVariables obje1 = new C02_staticVariables();
    obje1.staticOlmayanMethod();// direk bu metoda gidicek 10 olarak yazdırır fakat static sayıyı da 20 yapar.

       // bu metot içinde staticSayi=20 oldu.
        System.out.println(obje1.isim);//Mehmet
        System.out.println(obje1.degersizInstanceVariable);// default değeri 0

        System.out.println(C02_staticVariables.statSayi);//20
        // 3.class çalışırken C02 deki statikSayı nın değerini 20 olarak değiştirdik

        /*
        Farklı bir class'dan C02 class'ından metot ve variable'ları kullandığımda
        C02 class'ının tamamı değil sadece benim çağırdığım class üyeleri çağırır.

         */




    }
}
