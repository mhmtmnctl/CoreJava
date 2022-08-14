package day37_overriding;

public class EToyota extends DAraba{

    @Override
    void marka() {
        //super.marka();
        /*
        Eger hem overriden hem de overriding method'un calismasini istersek
        ilk satira super.marka() yazabiliriz
         */
        System.out.println("Markamiz Toyota");
    }

    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }
}
