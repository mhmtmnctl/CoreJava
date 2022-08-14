package day24_arrayLists_ForEachLoop;

import java.util.Arrays;
import java.util.List;

public class C01_ArraydenArrayListYapmak {
    public static void main(String[] args) {

        String [] arr={"Ismail","Nurullah","Fatih"};

        /*
        uzun listeler oluşturmamız gerektiğinde tek tek eklemek yerine
        array oluşturup bunları list'e çevirmek daha pratik olabilir.
        1-Loop ile arraydeki tüm elementleri List'e atabiliriz
        2-Arrays.asList() kullanabiliriz ama bu metodun 2 tane kötü yan etkisi vardır
        i-Arrays class'ı kullanıldığı için array özellikleri geçerli olur.
        dolayısı ile listte olan add remove gibi size'ı değiştiren metotlar bu şekilde
        oluşturulan listlerde kullanılamaz.
        ii- kaynak olan array ile ürün olan list özdeşleştirilir.
        birinde yapılan değişiklik otomatik olarak diğerine de işlenir.

         */

        List<String> sinifList = Arrays.asList(arr);
        System.out.println(sinifList); // [Ismail, Nurullah, Fatih]

      //  List<Integer> sayilar = Arrays.asList(new Integer[5]); // uzunluğu 5 olan bir array oluşturduk ve listte attık
        // ama çok anlamlı değil. boş arraye gerek yok çünkü zaten yazmak zor old. için array yapıyoruz.

        //1.yan etki.
      //  sinifList.add("Erdi"); //UnsupportedOperationException

      //  sinifList.remove(1);//UnsupportedOperationException

        //2. etki
        arr[1]= "Emre";
        System.out.println("Değişim sonrası array :"+Arrays.toString(arr));

        System.out.println("Arrayi değiştirince list :"+sinifList);

        sinifList.set(0,"Utku");
        System.out.println("Listi değiştirince list :" +sinifList);
        System.out.println("Listi değiştirince array :" +Arrays.toString(arr));// arrayi de değiştirdi.. bunu istemeyiz.







    }
}
