package day20_Arrays;

public class C01_LocalVariables {


    public static void main(String[] args) {

        int sayi = 10;
       // System.out.println(sayiMethod); sayi method method1 de oluşturulmuş local variable'dır

        for (int i = 10; i <20 ; i++) {
            System.out.println(i);


        }

        //System.out.println(i); i loopda oluşturulmuş local variable'dır.
                                //sadece loop içerisinde kullanılabilir


       // static int sayiStatic=20; static keyword sadece class level'da kullanılabilir
        // methodların içerisinde static variable tanımlanamaz.



    }
    public static void method1()
    {
      //  System.out.println(sayi);  sayı main metotda oluşturulmuş local bir variable'dır.
                                     //ve sadece main metotda geçerlidir.

        int sayiMethod = 20;
    }



}
