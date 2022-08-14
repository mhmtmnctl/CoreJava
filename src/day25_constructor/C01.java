package day25_constructor;

public class C01 {
    /*
    java oop konsept kullandığı için oluşturulan herbir classın ihtiyaç olduğunda obje üretebilmesine uygun
    dizayn etmiştir
    ama her class'dan obje üretilmeyebilir.
    bunun için java ihtiyaç halinde kullanılması için her classda default bir constractur koymuştur.

    bu default constructur classdan obje oluşturulduğunda otomatik olarak çalışır

    örneğin bu classda constructur görünmemesine rağmen C02 classında içinde olduğumuz C01 classından
    bir obje üretebildik.

     */

    int sayi;
    public void deneme(){
        System.out.println("C01den deneme methodu");
    }
}
