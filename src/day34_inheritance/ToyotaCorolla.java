package day34_inheritance;

public class ToyotaCorolla extends Toyota{
    public static void main(String[] args) {
        /*
        child class'tan parent class'a erisimde access modifier
        kurallarini by-pass edemeyiz
        orn: parent class'taki private class uyelerini
        child class'tan kullanamayiz
        ayni sekilde parent ve child farki package'lerde ise
        parent class taki default access modifier'i olan class
        uyelerini child class'dan kullanamayiz
         */

        ToyotaCorolla arb1 = new ToyotaCorolla();

        System.out.println(arb1.marka); // Toyota
        System.out.println(arb1.model); // Model belirtilmedi





    }
}
