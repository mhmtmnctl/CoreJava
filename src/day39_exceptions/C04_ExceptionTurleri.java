package day39_exceptions;

public class C04_ExceptionTurleri {
    public static void main(String[] args) {

        String str;

        /*
        değer ataması yapmadan bir variable'ı kullanmaya çalışırsanız java
        compile Time da bunu farkeder ve size izin vermez.

         */
        str = null;
   //     System.out.println(str.length()); //burası run time exception dır
        //NullPointerException

        Object obj = "Java Java Java";
        Integer sayi =(Integer) obj; //obje daha geniş... ama inte atamak istedik
        //ClassCastException verir.


        /*
        java bazı casting işlemlerine compile time'da izin vermez
        ancak bazen syntax uygun olabilir, bu durumda java kodun çalışmasına itiraz etmez

         */
    }



}
