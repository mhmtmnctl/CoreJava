package day30_immutable_date;

public class C02_StringHavuzu {
    public static void main(String[] args) {

        String str1 = "Ali Can";
        String str2 = str1 + "";
        String str3 = new String("Ali Can");
        String hiclik = "";
        String str4 = str1.concat(hiclik);

        System.out.println(str1==str2);  //false
        System.out.println(str1.equals(str2));  // true

        System.out.println(str1.equals(str3));  // true
        System.out.println(str1==str3);  // false

        System.out.println(str2.equals(str4)); // true
        System.out.println(str2==str4);  // false

        /*
        yeni bir String olustururken
         1==>   esitligin saginda new keyword u olursa java direkt yeni bir obje ve ref. olusturur
         2==>   esitligin saginda bir method calisiyor veya + islemi yapiliyorsa
             STring immutable oldugundan degisikligi kaydetmek uZere hemen bir kopya String ve
             referansi olusturur sonra degeri hesaplayip bu yeni objenin icine koyar..
         */
        String str5 = "Ali Can";
        String str6 = str1;

        System.out.println(str1.equals(str5));  // true
        System.out.println(str5==str1);  // true

        System.out.println(str1.equals(str6));  // true
        System.out.println(str1==str6);   // true

        System.out.println(str5.equals(str6));// true
        System.out.println(str5==str6);  // true

        /*
        eger yeni string objesi olusturulurken new kelimesi kullanilmaz veya
        esitligin saginda bir islem olmazsa java bakar

        Eger daha once olusturulan String objelerden (string havuzu)
        bire bir ayni string varsa o objeyi ve referansini kullanir,
        birebir aynisi yoksa yeni bir obje ve referans olusturur
         */

    }
}
