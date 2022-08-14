package day35_inheritancedaConstructorKullanimi;

public class Child extends BParent {
    String isim = "Child isim belirtilmedi";

    protected String childKlupAdi="Child Klubu";


    Child(){
        System.out.println("Child constructor calisti");
    }

    public static void main(String[] args) {

        AGrandParent gp1 = new AGrandParent();
        //Bu objeyi olusturmak icin grandpa constructor calisi
        // parent veya Child constr. calismaz

        Child child1 = new Child();
        child1.granpaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";

        // child1 objesi icin child conns calisti
        /*
        Java da bir class'i kullanabilmek icin
        o class'tan obje olusturu, dolayisiyla o class'in constr. ini kullanirdik

        JAVA inheritance'dda parents class'lardaki ozellikleri kullanabilmek icin
        o class'larin constructorlarini otomatik calistiran bir yapi kurmustur

        Ornegin biz child class'inda
        Child class'indan bir obje olusturmak istedigimmizde
        Child constructor'ini kullaniriz

        JAVA Chld(){ } constructor'ini gordugunde once Parent in constr. ini calistirmam lazim der
        Buradan parent constructor a gider
        Parent class'inda Parent(){ } gorunce
        once bunun Parent'inin yani GrandParent constructor inin calismasi gerekir der

        Boylece extends keyword olmayan class'a kadar gider ve oradan baslayarak
        tum constructor'lari asagiya dogru calistirir









         */


    }
}
