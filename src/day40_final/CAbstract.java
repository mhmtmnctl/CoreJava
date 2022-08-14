package day40_final;

public abstract class CAbstract {

    //variable'larla ilgili konuşmayız, metotlarla ilgilidir

    void toplama(){
        System.out.println("Bu method toplama yapar");
    }

   abstract void carpma();
    /*
    Bir methodun başına abstract yazarsanız bu metodun child claslar için bir standart
    olduğunu declare etmiş olursunuz ve method body'sine ihtiyaç kalmaz.
    tse5000 standartları belirler ama ekmek değildir.
     */
    abstract void bolme();
    // abstract void cikarma(){}
    /*
    body ekleyince hata veriyor.
     */
    void cikarma(){
        System.out.println("bu method cıkarma yapar");
    }
}
