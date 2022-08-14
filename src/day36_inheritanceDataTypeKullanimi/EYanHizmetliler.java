package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler {

    protected int saatUcreti = 12;
    protected int gunlukMesai = 9;

    protected void maas() {
        System.out.println("Memurlar : " + (30 * saatUcreti * gunlukMesai) + " Maas alir");
    }

    protected void ozelSigorta() {
        System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir");
    }
}
