package day29_passByValue_immutable;

import java.util.Locale;

public class C05_Immutable {
    public static void main(String[] args) {
        String isim = "Mine";
        isim=isim.toUpperCase();
        System.out.println(isim); // MİNE

        for (int i = 0; i <1000 ; i++) {
            isim+= ".";
        }
        System.out.println(isim);

    }
}
