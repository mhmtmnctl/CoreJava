package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_ForeachLoop {
    public static void main(String[] args) {


        int[]arr={2,3,4,6,23,6,8,9,1};
        List<Integer>liste = new ArrayList<>();

        //arraydeki tüm elemanları inceleyelim tek sayı olanları list'e atayalım

        for (int each: arr) //gelecek dataların türü, loop içinde ne isim verdiğim , nereden aldığım

        {
            if (each%2==1)
            {
                liste.add(each);
            }
        }
        System.out.println(liste);

            //index istiyorsa kullanamayız ama herkesi hepsini getir diyorsak kullanabiliriz

    }
}
