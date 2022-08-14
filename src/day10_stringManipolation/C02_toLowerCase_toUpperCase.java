package day10_stringManipolation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {

    public static void main(String[] args) {

        String str = "Beni psikopata baglamayin";

        System.out.println(str.toUpperCase());// BENİ PSİKOPATA BAGLAMAYİN //ing klavye kullanmak lazım....
        System.out.println(str.toUpperCase(Locale.ENGLISH));//BENI PSIKOPATA BAGLAMAYIN
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR")));//bu da tr dilinde yazdırır.


        //Eğer büyük küçük harf dönüşümünde local bir dili esas almak isterseniz
        //bu metot kullanılabilir. // ing klavye ayarla veya ing klavye al, sticker vs gibi.

    }
}
