package day14_methodCreation;

public class C04_MethodCreationReturn {

    //Verilen isim ve soyismi ilk harfi büyük geriye kalanları * olacak şekilde değiştirip
    //bize bu halini döndüren bir metod oluşturun
    //Not: Programın ilerleyen kısımlarında isim ve soyismi bu şekilde kullanmak istiyoruz.

    public static void main(String[] args) {

        String isim = "Enes";
        String soyIsim= "Bozkurt";


        String gizliIsim = isimGizle(isim,soyIsim);
        System.out.println(isim+ " "+soyIsim);//Enes Bozkurt metotddan değil normal yazdırdık
        System.out.println(gizliIsim);//E*** B****** çünkü metotdan geldi

        isimGizle2(isim,soyIsim);
       // System.out.println(gizliIsim.charAt(0));

    }

    public static String isimGizle(String isim, String soyIsim) {

        isim=   isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim = soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");


        return isim+ " "+soyIsim;//neyi döndürmeyi istiyorsak onu yazıyoruz...
        //değişiklik yapılmış halini geri döndürmek için bu metodu yaptık
    }

    public static void isimGizle2(String isim, String soyIsim){
        isim=   isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyIsim = soyIsim.substring(0,1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+ " "+soyIsim);
    }


}
