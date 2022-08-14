package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[] = new int[3];
        System.out.println(sayilar);//[I@3ac3fd8b  ramdeki referans adresi...


        /*
        non primitive data türündeki dataları her zaman direk yazdıramayabiliriz.
        arrayi yazdırmak istersek Arrays class'ından yardım isteriz

         */

        System.out.println(Arrays.toString(sayilar)); // [0,0,0] yazdırmak için kullanım şeklimiz bu şekilde

        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(Arrays.toString(sayilar)); //[5,3,10]

        String sinifList[]= {"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(sinifList));//[Ali, Ayse, Ahmet]
        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList));//[Ali, Hasan, Ahmet] ayşe yerine hasanı yazdırdık

        System.out.println(sinifList[1]);//Hasanı yazdıralım.. hasan zaten string di
        System.out.println(sinifList[0]);//Ali yazdırdı
        System.out.println(sinifList[2]);//Ahmet





    }
}
