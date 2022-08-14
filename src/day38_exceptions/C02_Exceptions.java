package day38_exceptions;

public class C02_Exceptions {
    public static void main(String[] args) {       // code - surround with - try catch

        int a = 1000;
        int b = 50;
        int sayac = 1;
        while (sayac < 100) {


/*
                Try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz islemleri
                yazmak icin kullanilir
           catch ten sonraki parantez karsilasmayi bekledigimiz
                    exception turunu Java'ya soylemek icin kullanilir
           catch blogu : Java'ya soyledigimiz exception (istisnai durum) gerceklesirse
                    Java'nin yapmasini istedigimiz islem

                    catch blogundaki paranteze karsilasmayi bekledigimiz
                    exception  i yazabilir veya
                    her turlu  exception da devreye girmessini istiyorsak
                    tum exceptionlarin parent'i olan Exception yazilabilir


 */

            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println("Payda sifir oldu dikkatli ol");
            }

            b--;
            sayac++;
        }
    }



}
