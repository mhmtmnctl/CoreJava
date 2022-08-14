package day32_stringBuilder;

public class C05_indexOf_LastIndexOf {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Pay attention please");
        System.out.println(sb.indexOf("Pay"));  // 0

        System.out.println(sb); // Pay attention please

        System.out.println(sb.indexOf("e")); // 7

        System.out.println(sb.indexOf("e",10)); //16  #10. indexten sonra e harfini ara ve indexini yaz

        System.out.println(sb.lastIndexOf("e"));  // 19    aramaya sondan baslar ama indexi bastan yazdirir

        System.out.println(sb.lastIndexOf("e",10));  //7  #10. indexe gider lastindex dedigi icin geriye dogru (basa) arar ve indx yazdrr



    }
}
