package day41_abstractClass_Interface;
public abstract class DAraba {
    public static void main(String[] args) {
        /* abstract class'da main method opsiyonel'dir
           Eger abstract class sadece child class'larin
           tasimak zorunda oldugu ozellikleri belirlemek icin olusturulduysa
           main method'a ihtiyac olmaz
           sadece abstract method'lar olur
           ama bir abstract method'da
           standart belirlemek disinda da method'lar calisabilir
           bu durumda ihtiyac olursa main method olusturulabilir
         */
    }
    protected abstract void yakit();
    protected abstract void kaporta();
    protected abstract void motor();
    /*
        Sadece child class'larin mecburi tasiyacaklari ozellikleri belirleyen method'lar
        abstract method olur ve abstract method'larin body'si olmaz
     */
    public void klima(){
        System.out.println("Bazi arabalarda klima olabilir");
        /*
          abstract olmayan method'lara concrete method denir.
          abstract bir method'u abstract keyword ile belirtmek ZORUNLUDUR
          concrete method'larda bunun deklare edilmesine gerek yoktur
          biz sadece abstraction ile ilgili konustugumuzda
          abstract olmayan method'lardan bahsetmek icin concrete tabirini kullaniriz
         */
    }
}