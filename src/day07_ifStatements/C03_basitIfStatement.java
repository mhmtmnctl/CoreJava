package day07_ifStatements;

public class C03_basitIfStatement {
    public static void main(String[] args) {

        /*
        bir if cümlesinde süslü parantez kullanılmazsa java ilk satırı şart ile bağlar sonraki satırlar bağımsız olur. yani çalışır

        eğer birden fazla satır aynı if sartına bağlanmış ise mutlaka süslü parantez kullanmalıyız

         */

        int sayi = -23;
        if (sayi >0)

            System.out.println("sayı pozitiftir");//ilk satırlar if e bağlı çalışır.
            System.out.println("pozitif kalacaktır");//her zaman çalışır
            System.out.println("ucuncu satır");//her zaman çalışır


        if (sayi%2==0)

            System.out.println("sayı çift");//değere bağlı
            System.out.println("çift kalacaktır");//her zaman çalışır

        if (sayi%5==0)

            System.out.println("sayı 5'in tam katı");//değere  bağlı






    }
}
