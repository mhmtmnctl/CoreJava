package day19_scope;

import java.util.Scanner;

public class C01_instanceVariables {
    /*
    class içerisinde her yerden kullanmak istediğiniz variable ları
    class level'da (class'ın içinde ama metodların dışında)
    genellikle class level variable'lar classın başında oluşturulur... (şart değil)

    class level'daki variabllar için iki scope vardır.
    1- static variables(class variablelları da denir)
    2- instance (static olmayan) variables... (obje variable'ı da denir)

     */

    int instSayi = 20;  //static olmayıp class level'da olduğu için instance variable'dır



    public static void main(String[] args)
    {
        int sayi = 10;
     //   System.out.println(instSayi);  // main metot static klubüne üye olduğu için buradan ulaşılamıyor

        /*
        instance variables static olmadığı için static klube üye main metotdan direk kullanamayız
        instance variable'ların diğer adı object variables dır
        dolayısıyla obje oluşturursanız instance variable'lları heryerden kullanabilirsiniz.
         */

        C01_instanceVariables obje1 = new C01_instanceVariables(); //bir obje oluşturduk
        System.out.println("obje1 değişmeden önce :"+ obje1.instSayi);// artık itiraz etmiyor.
        obje1.instSayi= 30;
        System.out.println("obje1 değiştikten sonra : "+obje1.instSayi);// sadece bunu 30 yapar.

        C01_instanceVariables obje2 = new C01_instanceVariables();
        System.out.println("obje2 değişmeden önce : "+obje2.instSayi);//20
        obje2.instSayi=25;
        System.out.println("obje2 değiştikten sonra : "+obje2.instSayi);//25

        C01_instanceVariables obje3 = new C01_instanceVariables();
        System.out.println("obje3 değişmeden önce : "+obje3.instSayi);//20 her obje oluşturulduğunda

        /*
        her obje oluştuğunda instance(obje) variable'ının ilk atanan değerini alır.. (en yukarda class level'deki)
         */



    }

    public static void staticMethot()
    {
       // System.out.println(sayi); // local variable dır.
        /*
        bir metodun içerisinde oluşturulan variable sadece o metodun içinden
        kullanılabilir. Buna local variable denir
         */
        /*
         instSayi=30;
         instance variable'lara main metot dışındaki static metotlardan da direk ulaşamayız
         obje oluşturrursak ulaşabiliriz
         */
        C01_instanceVariables obje4 = new C01_instanceVariables();

       System.out.println(obje4.instSayi);










    }

    public void staticOlmayanMethod()
    {
        System.out.println(instSayi);

        /*
        instance variable'lar class içerisindeki static olmayan metotlardan direk kullanılabilir
         */


    }


}
