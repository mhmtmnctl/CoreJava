package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {
        /*
        Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

         */

        int[] arr = {2,3,5,6,3,5,4,1,9,6,3,5,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        List<Integer>tekrarEdenler = new ArrayList<>();




        for (int i = 0; i < arr.length-1; i++)//i+1 dediğimiz için aşağıda -1 dedik burda
        {
            if (arr[i]==arr[i+1] && !tekrarEdenler.contains(arr[i]))// tekrar ediyor demek
            {
                System.out.print(arr[i]+ " ");
                tekrarEdenler.add(arr[i]);
            }
        }

    }
}
