package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsin");

        sb.append("?");
        System.out.println(sb);   //Java daha ne yapsin?

        // append istedigimiz Stringi en sona ekler

        sb.append("Java",2,4);
        System.out.println(sb); // Java herseyi dusunmus, daha ne yapsin?va

        sb.insert(4," herseyi dusunmus,");
        System.out.println(sb);   // Java herseyi dusunmus, daha ne yapsin?

        //araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz

        sb.insert(22,"valla valla",5,11); // Java herseyi dusunmus, valla daha ne yapsin?
        System.out.println(sb);

        StringBuilder strBld = new StringBuilder("ceylan");

        strBld.insert(0,"S");

        System.out.println(strBld); // Sceylan
    }
}
