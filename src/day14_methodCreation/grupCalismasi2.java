package day14_methodCreation;

public class grupCalismasi2 {


    public static void main(String[] args) {

        String isim = "enes";
        String soyIsim = "ince";

        String yeniIsim = buyukHarf(isim,soyIsim);
        System.out.println("İsmin yeni hali : " + yeniIsim);



    }


    public static String buyukHarf(String ad,String soyad){

        ad= ad.toUpperCase();
        soyad= soyad.toUpperCase();
        return ad+ " " +soyad;
    }




}
