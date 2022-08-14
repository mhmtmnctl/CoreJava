package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {
               /*
               Bir sorunla karsilasmayi beklediginiz noktalarda
               if else ile sorunu yakalayip
               onunla ilgili cozum uretebilirsinizz

               ama  sorunu herzman if else ile cozemeyecegimizden
               Java try-catch blaklari olusturmustur
                */

        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {
            if (b == 0) {
                System.out.println(" islem yapilirken payda sifir oldu, dikkat etmelisin");
            } else {
                System.out.println(a / b);
            }
            b--;
            sayac++;
        }
    }

}
