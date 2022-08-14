package day15_overloading_forLoop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*
        JAvada oluşturduğumuz metotların isminin yaptığı işlev ile uyumlu olmasını isteriz
        mesela bir String'in bir bölümünü almak için java iki adet subString  metodları veya
        verilen Stringdeki bsazı parçaları yenileri ile değiştirmek için iki adet
        replace() metodu var.
        Java aynı isimde birden fazla metod varsa hangisinini kullanılacağına parametre sayısı ve paremetrelerin
        data türüne göre karar verir.
         */
        String str = "Bu java ogrenilecek baska yolu yok";
        str.substring(2); // bu farklı metot
        str.substring(2,4);        // bu farklı metot
        str.replace('c','v'); //char olarak yazdık
        str.replace("J","H");//string olarak yazdık

        /*
        Aynı isimde ama farklı metotları oluşturmak için değiştirebiceğimiz şeyler;
        1- parametre sayısı
        2- aynı sayıda paremetreye sahip olsa bile paremetrelerin data türlerini değiştirebiliriz
        3- aynı sayıda ve aynı data türlerinde parametreleri olan metotlarda ise parametrelerin sıralanışı değiştirilebilir

         */



    }
}
