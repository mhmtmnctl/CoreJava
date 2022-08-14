package day13_method_Creation;

public class C03_StringManipulation {
    public static void main(String[] args) {

// Soru 1) String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.
        String str = "  Java ogrenmek123 Cok guzel@  ";
        str = str.trim();//baştaki ve sondaki boşlukları kaldırdık
        str= str.replaceAll("\\d","");
        str= str.replace("@",".");//@ işaretini attık nokta koyduk
        str = str.replace("C","c");

        System.out.println(str);










    }
}
