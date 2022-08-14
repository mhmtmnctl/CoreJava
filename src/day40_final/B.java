package day40_final;

final public class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.isim = "Alp";
     //   obj.okul = "Java Koleji"; // final olduğu için değiştirilemiyor.
        System.out.println(A.OKUL);
        System.out.println(Integer.MAX_VALUE);// bu da final static
        System.out.println(Short.MIN_VALUE);//bu da final static.

        /*
        bir class final olarak belirlenirse o class inherit edilemez.
         */









    }
}
