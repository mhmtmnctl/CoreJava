package day10_stringManipolation;

public class C03_equals {
    public static void main(String[] args) {

        String str = "Ali Can";
        String str2 = "Ali CAN";
        String str3 = "Ali Can" + "";
        String str4 = "Ali Can";
        String str5 = new String("Ali Can");


        System.out.println(str == str2);//false

        System.out.println(str==str3);//true

        System.out.println(str.equals(str3));//true

        System.out.println(str== str5);//false //bazen true verirken bazen false veriyor.

        System.out.println(str.equals(str5));//true

        System.out.println(str.equals(str4));//true

        System.out.println(str3.equals(str5));// true

        System.out.println(str3 == str5);//false


        /*
        Stringlerde aynı String olsa bile == her zaman çalışmaz
        emin olmak isterseniz equals metodunu kullanmalısınız

        equals kullandığımızda dikkat edeceğimiz tek şey metinlerin birebir aynı olmasıdır.
         */


    }
}
