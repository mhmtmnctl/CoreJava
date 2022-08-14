package day07_ifStatements;

public class C01_AndOperatorleri {
    public static void main(String[] args) {


        int a = 10;
        int b = 15;
        int c = 20;

        System.out.println(a>0 && b<20 && c>=b);//true
        System.out.println(a<0 && b<20 && c>=b);//false iki && işareti varsa false gördüğü zaman diğerlerine bakmaz

        System.out.println(a<0 & b<20 & c>=b);//false tek & varsa diğer hepsini yine de kontrol eder. ama yavaş çalışır

        /*
        java and operatörü konusunda bize 2 seçenek sunar
        && kullanırsak ilk false bulduğunda sonucun false olduğunu bilir ve diğer şartları incelemez

        & and kullanırsak tüm şartları kontrol eder sonra sonucu belirler
         bu çalışma usulünden dolayı & operatörü && operatörüne göre daha yavaş olabilir.

         */





    }
}
