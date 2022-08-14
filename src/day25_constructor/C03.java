package day25_constructor;

public class C03 {
    /*
    proje oluştururken bazı classlar run etmek için değil variable ve metod
    oluşturup bunları başka classlardan kullanmak için oluşturukur.
     */


    /*
    default constructor parametresizdir, göremesek bile ihiyaç olduğunda çalışır.

    çok kıskançtır.

    class içerisinde parametreli veya parametresiz herhangi bir constructor oluşturursak
    java default constructerı siler.
     */

    C03(){

    }
    /*
    oluşturduğumuz parametresiz bu constructor default constructor ile birebir aynıdır.
    ama biz oluşturduğumuz için buna default constructor demeyiz.
    buna parametresiz constructor deriz.

     */



    String isim = "Etka";

    public void method01(){
        System.out.println("C03 method çalıştı");
    }

}
