package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        // arb1 objesi uzerinden marka variable'ina
        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        arb1.marka="Toyota";
        System.out.println(arb1.marka);  //Toyota

        // access modifier kullanarak marka variable'ina ulasimi
        // tamamen serbest yapabilr veya tamamiyle engelleyebilirim
        // private yaptigimiz modele ise hic ulasamayiz
        // yani access modifier ya hep ya hic diyor

        // model'i degistireluim ama goremeyelim
        // yakiti da gorelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1. adim - ozel yetki tanimlayacaginiz variable lari private yapin
        //        private bir data ya baska class lardan ulasmak mumkun olmadigindan
        // 2. adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim


        arb1.setModel("Corolla"); // model olarak Corolla yi atadik
        //modeli yazdirma imkanimiz yok, cunku getter method'u yok
        System.out.println("****"+arb1.getYakit());  // yakit olarak elektrikli bilgisini yazdirabildik
        // yakiti degistiremeyiz cunku setter methodu yok




    }
}
