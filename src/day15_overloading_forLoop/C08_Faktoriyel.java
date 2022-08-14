package day15_overloading_forLoop;

public class C08_Faktoriyel {
    public static void main(String[] args) {

        /*
            input olarak verilen bir tamsayı için faktöriyel hesaplayıp yazdıran  bir metot oluşturun
            verilen sayı 0, negatif veya 20 den büyük olursa  girilen sayının faktöriyeli hesaplanamaz uyarısı yazdırın
         */

        int input = 19;

        faktoriyelHesapla(input);


    }

    public static void faktoriyelHesapla(int input) {

        int faktoriyel =1;

        if(input<0||input>20)
        {
            System.out.println("Girilen sayının faktöriyeli hesaplanamaz!");
        } else if (input==0) {
            System.out.println("0! = 1 dir");

        } else {

            for (int i = 1; i <=input ; i++) {
                faktoriyel*=i;

            }
            System.out.println("Faktöriyel değeri : " + faktoriyel);

        }


    }
}
