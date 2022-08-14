package day07_ifStatements;

public class C02_basitIfStatements {
    public static void main(String[] args) {


        int sayi = 10;
        if (sayi >0)
        {
            System.out.println("sayı pozitiftir");
        }

        if (sayi%2==0)
        {
            System.out.println("sayı çift");
        }
        if (sayi%5==0)
        {
            System.out.println("sayı 5'in tam katı");
        }
        /*

       baist if cümleleri kodun diğer parçalarından bağımsızdır. sadece bir şart konrol eder
       sart sağlanıyorsa if body çalışır yoksa çalışmaz
       birden fazla basit if cümlesi varsa girilen sarta bagli olarak tumunde if body'si calısabilir, kismen if body leri calısabilir veya
       hiçbir if bodysi calısmayabilir

         */

    }
}
