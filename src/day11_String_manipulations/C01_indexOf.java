package day11_String_manipulations;

public class C01_indexOf {
    public static void main(String[] args) {


        String str = "Java ogrenmek çok güzel";
        //Verilen bir Stringde herhangi bir string veya char'ın ilk kullanıldığı index'i bize döndürür.

        System.out.println(str.indexOf('g'));  //6
        System.out.println(str.indexOf("r"));  //7
        System.out.println(str.indexOf("j"));  //-1
        System.out.println(str.indexOf("mek"));//10 mek olarak arar.

        //eğer istediğimiz indexten sonrasını konrol etmek istersek o zaman aynı metodu iki parametreli olarak kullanabiliriz.

        System.out.println(str.indexOf("g",(6+1)));// 6. index'ten itibaren

        //Yukarıdaki str'da 2.ve 3. e'nin index'lerini bulun.
        //2. e'yi bulabilmek için 1. e'nin index'ine ihtiyacım var.

        int ilk_e= str.indexOf("e");
        int ikinci_e= str.indexOf("e",ilk_e+1);

        //eğer 2. e varsa  3. e'nin olup olmadığını ve varsa index'ini yazdıralım

        if (ikinci_e == -1)
        {
            System.out.println("Verilen str'da 2.e yok");
        }
        else
        {
            int ucuncu_e= str.indexOf("e",ikinci_e+1) ;

            if(ucuncu_e==-1)
            {
                System.out.println("Verilen str'da üçüncü e yok");
            }
            else
            {
                System.out.println("Verilen str'daki 3.enin indeksi : "+ucuncu_e);
            }


        }




    }
}
