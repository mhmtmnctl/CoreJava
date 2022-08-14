package day18_while_doWhile;

public class C02WhileLoop {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir sayı alın ve bu sayının rakamları toplamını yazdırın
         */
        int rakamlarToplamı= 0;
        int input= 3832;
        int birlerBas=0;
        int temp = input;

        while (temp>0)
        {
            birlerBas= temp%10;//birler bas.
            rakamlarToplamı+=birlerBas;//toplama ekle
            temp/=10;//son basamkatan kurtulduk
        }
        System.out.println(input + " sayısının rakamlar toplamı :" + rakamlarToplamı);

    }
}
