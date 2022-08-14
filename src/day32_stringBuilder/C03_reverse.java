package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {

        //verilen bir inputu tersine cevirip, bize donduren
        // bir method olusturun

        String input = "Hey gidi for loop gunler";

        String tersInput = tersineCevir(input);

        System.out.println(tersInput);
    }
    public static String tersineCevir(String input) {

        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }
}
