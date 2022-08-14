package day40_final;

public class A {
    String isim = "Cuneyt";
   final static String OKUL = "Yildiz Koleji"; //final ile sabit oldu değiştirilemez.
    /*
    Bir variable final olarak tanımlandıysa başka class'lardan veya içinde olduğumuz class'dan
    bu variable'a başka değer atanması mümkün değildir.

    Madem ki değeri değiştirilmiyor, genelde static de yaparak bu variable'a erişim kolaylaştırılabilir.
    Genelde de  static final olarak belirlenen variable isimleri büyük harfle yazılır

     */

    final void finalMethod(){
        System.out.println("final methodlar override edilemez");
        /*
        bir methodu final olarak işaretlerseniz bu method değiştirilemez demektir.
        üzerine yazılamaz, override edilemez.
         */
    }
}
