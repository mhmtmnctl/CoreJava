package day32_stringBuilder;

public class C04_subSequence {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("OCAJP8");

        sb1.subSequence(2, 4);
        System.out.println(sb1);  // OCAJP8

        sb1.deleteCharAt(3);
        System.out.println(sb1); // OCAP8

        sb1.reverse( );

        System.out.println(sb1); //8PACO


    }
}
