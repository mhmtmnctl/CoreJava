package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        /*
        Varargs teorik olarak sonsuz sayida element alabilir
        bir methodda parametre olarak varargs varsa
        varargs'in sinirlarini bilebilmesi icin
        parametrelerin sonuncusu olmalidir.
        Oncesinde farkli parametreler olabilir ama
        varargstan sonra parametre olamaz

        bu kuraldan oturu bir methodda sadece 1 tane varargs olabilir
         */

        enUzunKelimeyiYazdir(5,"Ali", "Ayse", "Ismail", "Ahmet", "Babayigit","Akin");
    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String... kelime) {

        String enUzunKelime = kelime[0];
        for (String each : kelime) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }
        System.out.println("girilen kelimelerden en uzunu :" + enUzunKelime);
    }


}

