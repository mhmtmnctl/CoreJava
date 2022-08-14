package day20_Arrays;

import java.util.Arrays;

public class C03_length {
    public static void main(String[] args) {

        //iki şekilde array oluşturabiliriz.
        int[] sayilar={1,2,3};
        //uzunluğu belirterek de yapabiliriz
        String harfler[] = new String[4];

        System.out.println("sayılar array'inin uzunluğu : "+sayilar.length);//length'ten sonra parantez yok.dikkat

        System.out.println("harfler array'inin uzunluğu : "+harfler.length);

        System.out.println(Arrays.toString(harfler));

        //harfler array'inin son elementini yazdıralım

        System.out.println(harfler[harfler.length-1]);// son karakteri yazdırdık

       // System.out.println(harfler[5]); // ArrayIndexOutOfBoundsException


    }
}
