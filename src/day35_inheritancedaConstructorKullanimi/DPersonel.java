package day35_inheritancedaConstructorKullanimi;

public class DPersonel {

    DPersonel (){
        // extends yoksa **super()' de yok alt satira gecer
        System.out.println("Personel paremetresiz cons");
    }
    DPersonel (String isim){
        System.out.println("Personel paremetreLI cons");
    }


}
