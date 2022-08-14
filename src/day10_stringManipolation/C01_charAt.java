package day10_stringManipolation;

public class C01_charAt {
    public static void main(String[] args) {


        String str = "Java öğrenmek ne güzel";
        System.out.println(str.charAt(0));//ilk harfi yazdırır. J
        //System.out.println(str.charAt(4));

        System.out.println(str.toUpperCase().charAt(7)); // R yazdırır

        System.out.println(str.charAt(21));// l
  //      System.out.println(str.charAt(22));//verilen index sınırların dışında hata verir

        //Son harfi bulmak için str'ın uzunluğunun bir eksiğini index olarak gireriz
        //eğer index olarak uzunluu veya daha büyük bir sayı girersek java exception verir.

        //charAt() kullandığımızda sonuç char olacağı için artık manipulasyon yapamayız.
        //String metotlarından kullanmamız gereken bir metot varsa charAt() den önce kullanmalıyız.

    }
}
