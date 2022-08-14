package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int[] sayilar = {5,6,7,8,8,3,9,1};

        //Array'i Arrays clasını kullanarak natural sıralayabiliriz
        //String de ise harfe göre sıralar
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));

    }
}
