package day36_inheritanceDataTypeKullanimi;

public class BMuhasebe extends APersonel {
    protected int saatUcreti = 10;
    protected int gunlukMesai = 8;

    protected void maas() {
        System.out.println("Personel minumum : " + (30 * gunlukMesai * saatUcreti) + " maas alir");
    }

    protected void ozelSigorta() {
        System.out.println("Isteyen calisanlara %50 indirimli ozel sigorta yapilir");
    }
}