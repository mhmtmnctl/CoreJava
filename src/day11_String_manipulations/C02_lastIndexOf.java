package day11_String_manipulations;

public class C02_lastIndexOf {
    public static void main(String[] args) {


        String cumle = "Java cok kolay, Java cok guzel";
        String kelime = "Java";

        //Verilen kelime için aşağıdaki şartlardan uygun olanı yazan bir program yazınız

        // -Verilen kelime cümlede kullanılmamış
        // -Verilen kelime cümlede sadece bir kere kullanılmış
        // -Verilen kelime cümlede birden fazla kullanılmış.

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex= cumle.lastIndexOf(kelime);


        if (kelimeIlkIndex==-1)
        {
            System.out.println("kelime cümlede kullanılmamış");
        }
        else if (kelimeIlkIndex==kelimeSonIndex)
        {
            System.out.println("Verilen kelime sadece bir kere kullanılmıştır");
        }
        else
         {
             System.out.println("verilen kelime cümlede birden fazla kullanılmıştır");
         }
    }
}


