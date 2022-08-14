package day15_overloading_forLoop;

public class BodyCalismalari {
    public static void main(String[] args) {

        String kelime = "mehmet";

        buyukHarfCevirme(kelime); // voidden gelen
       String yenideger= kucukHarfCevirme(kelime);
        System.out.println(yenideger.charAt(0));





    }

    private static void buyukHarfCevirme(String sozcuk) {

        String yenikelime = sozcuk.toUpperCase();
        System.out.println(yenikelime);


    }

    public  static  String kucukHarfCevirme(String kelime){

        String yenikelime = kelime.toLowerCase();

        return yenikelime;


    }


}
