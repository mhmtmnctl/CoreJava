package day29_passByValue_immutable;

public class C04_Immutable {
    public static void main(String[] args) {
        /*
         immutable : degistirilemez
         mutable   : degistirilebilir

         en meshur immutable class : String
         */

        String str = "Yıldız Bank";
        System.out.println(str.toUpperCase()); // YILDIZ BANK

        str.toLowerCase();
        System.out.println(str);

    }
}
