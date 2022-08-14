package day21_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C03_Contains {
    public static void main(String[] args) {

        /*
        Soru 3- Kullanıcıdan aldığınız bir ismin verilen arreyde olup olmadığını kontrol edip,
         bize true veya false sonucu donen bir method olusturun.
         */

        String [] isimler = {"Basak","Nurullah","Fatih","Adem","Enes"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Aradığınız ismi yaziniz :");
        String arananIsim = scan.nextLine();

        boolean sonuc = containsMetodu(isimler,arananIsim);
        if (sonuc)
        {
            System.out.println(" isim arrayde vardır");
        }
        else System.out.println("isim arreyde yoktur");





    }

    public static boolean containsMetodu(String[] isimler, String arananIsim)
    {
        boolean sonucMethod = false;

        for (int i = 0; i <isimler.length ; i++)
        {
            if (isimler[i].equalsIgnoreCase(arananIsim))
            {
                sonucMethod=true;
            }
        }

        return sonucMethod;
    }
}
