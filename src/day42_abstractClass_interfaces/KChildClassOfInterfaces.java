package day42_abstractClass_interfaces;

public class KChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces { //birden fazla interface'e implements yapabiliriz

    /*
    Bir class'ı bir interface'e child yapmak için implements keyword kullanılır.
    implements dedikten sonra "," yazarak istediğimiz kadar interface ekleyebiliriz.
     */
    public static void main(String[] args) {
        System.out.println(I02_Interfaces.SAYI);//30
        System.out.println(I03_Interfaces.SAYI);//20
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
