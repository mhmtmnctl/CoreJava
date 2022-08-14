package day29_passByValue_immutable;
import day26_constructor.Araba;
import java.util.ArrayList;
import java.util.List;
public class C03_PassByValue {
    public static void main(String[] args) {
        /*
          bir list olusturalim
          iki ayri method'dan birinde
          sadece elemanlari degistirelim
          digerinde yeni bir list atayip,
          ayni sayida yeni eleman ekleyelim
          ve her iki method call'dan sonra kendi listemizi
          main method icerisinde kontrol edelim
         */
        List<String> list = new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Can");
        System.out.println("ilk basta list : " + list); // [Ali, Veli, Can]
        elemanlariDegistir(list);
        System.out.println("eleman degistir methodundan sonra list : " + list);
        // [ Oguz, Murat, Fatih]
        listDegistir(list);
        System.out.println("list degistir methodundan sonra list : " + list);
        // [ Oguz, Murat, Fatih]
    }
    public static void listDegistir(List<String> list) {
        list=new ArrayList<>();
        list.add("Nutella");
        list.add("Cay");
        list.add("Cokokrem");
        System.out.println("list degistir methodunda : " + list);
        // [Nutella, Cay, Cokokrem]
    }
    public static void elemanlariDegistir(List<String> list) {
        list.set(0,"Oguz");
        list.set(1,"Murat");
        list.set(2,"Fatih");
        System.out.println("eleman degistir methodunda : " + list);
        // [ Oguz, Murat, Fatih]
    }
}