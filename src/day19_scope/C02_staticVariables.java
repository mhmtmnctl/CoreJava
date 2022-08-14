package day19_scope;

public class C02_staticVariables {

    static int statSayi = 10;
    String isim = "Mehmet";

    static int degersizStaticVariable; //değer atanmamış
    int degersizInstanceVariable;
    /*
    class leveldaki variable'lara değer atamasak da java kabul ediyor.

     */


    public static void main(String[] args)
    {
        /*
        bir variable static oluşturulduysa objeler için değil class için geçerlidir.
         */
        System.out.println("main metotdaki "+ statSayi); //10
        staticMethod();
        statSayi=12;//değiştiği zaman herkes için değişir
        System.out.println("değer değiştikden sonra static metoddaki değeri "+statSayi); //12
        C02_staticVariables obje1 = new C02_staticVariables(); //static olmayan metodu almak için obje oluşturduk
        obje1.staticOlmayanMethod();
        System.out.println(statSayi);// static olmayan metod'da 20 ye eşitledik. //20
        /*
        instance bir variable'ın değerini bulmak için objenin oluşturulmasından itibaren
        istenen satıra kadar kodu takip etmeliyiz.
        Static variable da ise class'ın en başından başlayarak istenen satıra kadar kodu takip edip
        static variable'ın son değerini bulmamız gerekir.
         */


    }




    public static void staticMethod()
    {
        System.out.println("static metotdaki " + statSayi);//

    }


    public void staticOlmayanMethod()
    {
        /*
        static variable'lar class içerisinden her yerden ulaşılabilir.
        static olsun veya olmasın tüm metotlar static variable'ları görebilir ve değiştirebilirler.
        farklı metotlarda static variable'ın hangi değeri alacağını bilmek istiyorsak
        class'ın başından itibaren kodun çalışmasını takip etmeliyiz
        metot ne zaman çağırılırsa o anki static variable değerini metotda kullanabilirz.
         */
        System.out.println("static olmayan metodun değeri "+statSayi);// static klubüne üyeysen her yere ulaşabilirsin
        statSayi = 20;
    }

}
