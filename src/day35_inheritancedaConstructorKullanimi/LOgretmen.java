package day35_inheritancedaConstructorKullanimi;

public class LOgretmen {
    LOgretmen() {
        super();
        System.out.println("LOgretmen parametresiz cons");
    }

    LOgretmen(String iisim) {

        this();
        System.out.println("LOgretmen parametreli cons");
    }

}
