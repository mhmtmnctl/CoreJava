package day35_inheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel {

    EMuhasebe (){
        //super();
        System.out.println("Muhasebe parametresiz cons");
    }
    EMuhasebe (String isim){
        System.out.println("Muhasebe parametreLI cons");
    }
}
