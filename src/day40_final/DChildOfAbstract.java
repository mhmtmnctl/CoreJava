package day40_final;

public class DChildOfAbstract extends CAbstract{
    //yukardaki satırı kırmızı çizdi. implement yaptık aşağıdakileri override olarak kendisi oluşturdu.
    //ama sadece abstact yaptıklarımız geldi. onları seçtik

    @Override
    void carpma() {
        /*
        abstract class'lar child class'ların sahip olmaları gereken mecburi
        özellikleri belirlerler.
        Günlük hayatımızdaki standartlar gibi
        Abstract bir class'ı parent edinen tüm childlar parent abstract classdaki
        tüm abstacrt metodları override etmek zorundadırlar.
         */

    }

    @Override
    void bolme() {

    }
}
