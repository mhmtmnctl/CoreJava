package day14_methodCreation;

public class BireyselCalismalar2 {
    public static void main(String[] args) {

        String ad= "Mehmet Emin";
        String soyAd= "Çatal";
        String buyukHali= buyukIsim(ad,soyAd);
        System.out.println(buyukHali);

        String kucukHali= kucukIsim(ad,soyAd);
        System.out.println(kucukHali);


    }

    private static String kucukIsim(String a, String b) {
        a= a.toLowerCase();
        b=b.toLowerCase();
        return a+" "+b;

    }

    public static String buyukIsim(String isim, String soyisim){

        isim= isim.toUpperCase();
        soyisim=soyisim.toUpperCase();
        return isim+" "+soyisim;


    }

}
