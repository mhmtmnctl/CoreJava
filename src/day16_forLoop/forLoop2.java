package day16_forLoop;

public class forLoop2 {
    public static void main(String[] args) {

        /*
        Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)

Input :

String str=“Javaisalsoeasy”

Output: a s
         */


        String str = "Javaisalsoeasy";

        str= str.toLowerCase();
        String krk = String.valueOf(str.charAt(0));
        String kalan;


        for (int i = 0; i < str.length() ; i++)
        {

          krk = String.valueOf(str.charAt(i)); // ilk harfi aldık
          kalan = str.substring(++i); // j yi çıkarıp kalan kısımda var mı yok mu baktık
          if(kalan.contains(krk)) // geri kalanda içeriyosa yazdır
          {
              System.out.print(krk+" ");
          }

        }


    }
}
