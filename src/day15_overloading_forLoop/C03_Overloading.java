package day15_overloading_forLoop;

public class C03_Overloading {
    public static void main(String[] args) {

        topla(5,7);//12
        topla(5.2,3);//8.2
        topla(3.4,6.1);//9.5




    }

    public static void topla(int sayi1,int sayi2){

        System.out.println("İki integer'ın toplamı : " + (sayi1+sayi2));

    }
/*
       bir class'da parametre sayısı ve parametre türleri aynı olan iki metodu oluşturamayız
    public static void topla(int sayi3,int sayi4){

        System.out.println("İki integer'ın toplamı : " + (sayi3+sayi4));

    }
    */
         public static void topla(double sayi1,int sayi2){

          System.out.println("Bir double ve bir  integer'ın toplamı : " + (sayi1+sayi2));

}

    public static void topla(int sayi1,double sayi2){

        System.out.println("Bir integer ve bir double'ın toplamı : " + (sayi1+sayi2));

    }
    public static void topla(double sayi1,double sayi2){

        System.out.println("İki double'ın toplamı : " + (sayi1+sayi2));

    }






}
