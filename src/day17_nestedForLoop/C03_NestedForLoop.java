package day17_nestedForLoop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
        Verilen yükseklik ve boy değerine göre * lardan oluşan bir dikdörtgen oluşturalım

        yükseklik = 3 boy = 4 olduğunda
        * * * *
        * * * *
        * * * *
        * * * *

         */

        int yukseklik = 4;
        int boy = 8;

        for (int i = 1; i < yukseklik; i++) {

            for (int j = 1; j <=boy ; j++) {

                System.out.print("* ");

            }
            System.out.println("");


        }


    }
}
