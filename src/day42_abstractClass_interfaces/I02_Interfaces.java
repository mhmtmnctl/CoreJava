package day42_abstractClass_interfaces;

import java.util.ArrayList;
import java.util.List;

public interface I02_Interfaces {
    int SAYI = 30;
    /*
    Interface bir class değildir.
    Abstract class'lar java'da abstraction(soyutlaştırma)/kural koyma demiştik
    işlevini yapıyorud
    ancak abstract bir classda abstract olmayan methodlar'da olabiir.
    bu da full abstraction yapmaya izin vermez.

    eğer javada içinde hiç concrete method olmasın dediğimiz bir class oluşturmak istiyorsanız
    bunu class değil interface yapmalısınız

   1- INTERFACElerde concrete method OLMAZ
   2- Interface'ler full abstraction yaptığından Interfece'lerden obje oluşturulamaz

   Hatırladığınız gibi Interface olan list'den direk obje oluşturamıyorduk
    List<String> liste = new List<>(); çalışmaz

    Bunun yerine constructor'ı List'in child'ı olan ArrayListten seceriz
     List<String> liste = new ArrayList<>();
     3- Class'larda bir child birden fazla parent edinemez.
     Ancak Interface'lerde concrete method olmadığından biz her metodu child classda override etmek zorundayız
     Override ederken kimin söylediğini override ettiğimizin önemi yok


     4-Interface'ler neyin yapılması gerektiğini söyler
       ama nasıl yapılacağına karışmaz.
       *Şablon gibidirler nasıl yapılacağı değil ne yapılacağı ile ilgilenirler.



    */


}
