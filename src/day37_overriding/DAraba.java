package day37_overriding;

public class DAraba {

    private void yakit() {
        System.out.println("Tum arabalar yakit kullanir");
        /*
        parent class'tan overrride edilmesini istemedigimiz methodlari
        private, static veya final yapabilirsiniz
         */
    }

    void marka() {
        System.out.println("Tum arabalarin markasi vardir");
    }

    void motor(){
        System.out.println("Tum arabalarin motoru vardir");
    }
}
