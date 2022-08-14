package day35_inheritancedaConstructorKullanimi;

public class GToyota {
    GToyota() {
        System.out.println("GToyota parametresiz cons");
    }

    GToyota(String isim) {
        // super(isim);  extends olmadigi icin super constructor call'u java kabul etmez
        System.out.println("GToyota parametreli cons");
    }
}