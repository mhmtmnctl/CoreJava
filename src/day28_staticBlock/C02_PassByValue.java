package day28_staticBlock;

public class C02_PassByValue {
    public static void main(String[] args) {
        double satisFiyati = 100;
        System.out.println(indirimliFiyat(satisFiyati)); //90.0
        System.out.println(satisFiyati); //100
        System.out.println(indirimliFiyat(satisFiyati)); //90.0
        // iki farkli methodda satis fiyati isminde variable olabilir
        // java buna itiraz etmez, cunku scope lari farklidir.


    }

    public static double indirimliFiyat(double orijinalFiyat){
        // methodumuz %10 indirim yapip yeni fiyati main methoda dondursun
        double satisFiyati=orijinalFiyat*0.9;

        return satisFiyati;
    }

}
