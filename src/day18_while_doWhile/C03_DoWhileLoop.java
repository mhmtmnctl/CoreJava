package day18_while_doWhile;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loopda önce kontrol edip sonra işlem yaptığımız için
        işlem bittikten sonra loopun kırılması için birkez daha başa
        dönmemiz gerekiyor
        bu durumda fazladan bir işlem yapılıyor.
         */

        int sayi=7;
        while (sayi<10)
        {
            System.out.println(sayi);
            sayi++;
        }


        /*
        do while loop iile çalıştığımızda bu dezavantaj ortadan kalkar.
         */

        sayi=7;

        do
        {
            System.out.print(sayi+" ");
            sayi++;
        }
        while (sayi<10);




















    }
}
