package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";

    /*
    Her class ta gorunmese bile bir constructor vardir
    Bu class tan obje olusturmak istedigimizde default constr. devreye girecektir

     Default constructor'i gozlemleymeyecegimiz icin
     onun yerine kullanabilecegimiz parametresiz constr. olusturalim

     */
    protected String granpaKlupAdi="Grandpa Klubu";


    AGrandParent() {
        System.out.println("Grandpa cnstructor calisti");
    }

}
