package day27_staticKeyword;

public class C01 {

    static int sayi = 10;
    int rakam =5;


    public static void main(String[] args) {

        /*
        class level'da iki tur variable olusturabiliriz
        Static (class) variable
        instance(obje) variable
         static variable lar tum class tan kullanilabilirken
         instance olanlar sadece static olmayan methodlarda direk kuullanilabilir
         instance variable lara static method dan ulasmak istersek
         obje olusturmamiz gerekir.

         instance variable lar obje variable i oldug icin herhangi bir satirda instance variablein
         degerinin ne oldugunu bulmak icin OBJE OLUSTURULAN SATIRDAN itibaren kod incelenmelidir

         static variable lar class variable i oldugu icin herhangibir satirda
         static variable in degerini bulmak icin CLASS'IN BASINDAN
         itibaren kod incelenmelidir


         */

        C01 obj1=new C01();
        System.out.println("obj1 in rakam degeri : "+ obj1.rakam);  //5
        System.out.println("obj1 in sayi degeri : "+ sayi); // 10

        obj1.rakam+=1;  //5+1=6
        sayi+=1;  //10+1=11
        System.out.println("1 artirdiktan sonra obj1 in rakam degeri : "+ obj1.rakam);  // 6
        System.out.println("1 artirdiktan sonra obj1 in sayi degeri : "+ sayi); //


        C01 obj2 = new C01();
        System.out.println("obj2 in rakam degeri : "+ obj2.rakam);  // 5
        System.out.println("obj2 in sayi degeri : "+ obj2.sayi); // 11

        obj2.rakam++;
        obj2.sayi++;

        System.out.println("1 artirdiktan sonra obj2 in rakam degeri : "+ obj2    //  5+1=6
                .rakam);  // 6
        System.out.println("1 artirdiktan sonra obj2 in sayi degeri : "+ obj2.sayi); //  11+1




    }
}
