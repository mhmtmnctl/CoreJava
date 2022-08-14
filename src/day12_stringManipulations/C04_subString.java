package day12_stringManipulations;

public class C04_subString {

    public static void main(String[] args) {

        String str = "Java cok yasa";

        System.out.println(str.substring(3,4));//a ...üç dahil dört dahil değil
        System.out.println(str.substring(5,7)); //co
        System.out.println(str.substring(6,6));//hiçlik verir..""

      //  System.out.println(str.substring(6,2));//6dan başla -4 karakter yazdır dedik..böyle birşey olmayacağı için hata verir
                                                 //syntax açısından bir hata olmadığı için çalıştırmadan önce hata vermez... ama çalıştırdıktan sonra hata verir
                                                //buna runtime hatası deniz.

        //  String str2 = 23;  // compile runtime error denir. daha derlemedn önce hata veriyor.




    }
}
