package day34_inheritance;

public class Isci extends Personel {
    /*
                 ****** COK ONEMLI ******
    Normal hayatimizda parent cocuk sahibi olmaya karar verebilir
    Java'da ise child class lar ozelliklerini inherit etmek istedikleri
    class'i kendilerine parent edinirler

     mesela isci classi ni olustrunca nelere ihtiyaci var diye dusunsek
     Personel sinifindaki tum variable ve method'lara ihtiyaci
     old. gorrebilitriiz
      Bu durumda yeniden o variable ve methodlari olusturmak yerine
      Personel Class'i kendimize parent ediniriz

     Bir Class'i parent edinmek icin extends keyword kullanmaliyiz

         bir class baska bir class'i parent edindiginde;
     1- parent class taki tum ozelliklere(variable+method) otomatik o;arak sahip olur
     2- parents class taki ozelliklerden bazilarini kendine uyarlayabilir
     3- parent class'ta olmayan bazi yeni ozellikler olusturabilir
        not: parent class taki ozelliklerden hicbirini reddedemez ama degistirebilir
     */
    int personelNo = 1001;
    int maas = 10000;

    public static void main(String[] args) {
        Isci isci1 = new Isci();
        System.out.println(isci1.isim);  // Isim belirtilmedi
        // kendi class imizda isim variable'i yk onun icin parent'e gidiyoruz
        isci1.isim = "Selim";
        System.out.println(isci1.personelNo); //1001 kendi Class imizda varsa onu kullaniriz

        isci1.maas();  //isciler minimum 15$ saat ucreti alir
        System.out.println(isci1.isim+"*****");

        System.out.println("isci1.maas = " + isci1.maas);

    }

    public void maas (){

        System.out.println("isciler minimum 15$ saat ucreti alir");
    }
public void ozelSigorta(){
    System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir");
}
}
