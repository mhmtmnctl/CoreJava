package day46_maps;
import java.util.List;
import java.util.Map;
public class C02_MapsMethodIle {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap =ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);
        // value'lari sira numarali olarak yazdirin
        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);
        // Isim ve soyisimlerin birlikte olacagi bir liste olusturun
        List<String> sinifisimsoyisimList= ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("isim soyisim listesi : " + sinifisimsoyisimList);
        // kac farkli brans varsa bransIsmi = branstakiOgrencisayisi seklinde yazdirin
    }
}