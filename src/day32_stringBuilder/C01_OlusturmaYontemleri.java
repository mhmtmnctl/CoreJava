package day32_stringBuilder;

public class C01_OlusturmaYontemleri {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Java Candir...");
        StringBuilder sb3 = new StringBuilder(10);

        System.out.println(sb1.length());   // 0
        System.out.println(sb1.capacity());  // 16

        System.out.println(sb2.length());   // 14
        System.out.println(sb2.capacity()); // 30

        System.out.println(sb3.length());   // 0
        System.out.println(sb3.capacity());  //10

        sb1.append("Java");
        System.out.println(sb1.length());    // 4
        System.out.println(sb1.capacity());  // 16

        sb1.append(" Candir");
        System.out.println(sb1.length());    // 11
        System.out.println(sb1.capacity());  //  16

        sb1.append(", bilen bilir.");
        System.out.println(sb1.length());    // 25
        System.out.println(sb1.capacity());  //34   (16 * 2 + 2 =34 )

        StringBuilder sb4 = new StringBuilder();
        sb4.append("Java Candir");
        System.out.println(sb4.length());  // 11
        System.out.println(sb4.capacity()); // 16


    }
}
