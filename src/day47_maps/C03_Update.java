package day47_maps;
import day46_maps.ReusableMethods;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class C03_Update {
    public static void main(String[] args) {
        /*
          map.contains(key) ==> verdigimiz key'in map'de olup olmadigini boolean olarak doner
          map.contains(value) ==> bir butun olarak value'nun map'de olup olmadigini doner
          ONEMLI NOT : map.contains(value) value'nun icindeki bir parcayi bulmada ise yaramaz
                      eger value icindeki bir parcayi aratmak istiyorsak
                      map uzerinde manipulation yapmamiz lazim
           map.get(key) ==> verilen key'e ait degeri dondurur
         */
        Map<Integer,String > sinifListMap= ReusableMethods.mapOlustur();
        System.out.println(sinifListMap);
        System.out.println(sinifListMap.containsKey(104)); // true
        System.out.println(sinifListMap.containsKey(114)); // false
        System.out.println(sinifListMap.containsValue("Ali, Can, JDev")); // true
        System.out.println(sinifListMap.containsValue("JDev")); // false
        // Verilen map'de JDev degerlerini JavaDeveloper olarak degistirelim
        // Map'lerde replace tum value'yu degistirmek istersek kullanilabilir
        // kismi degisikliklerde kullanamayiz
        ReusableMethods.tumValueSiraliYazdir(sinifListMap);
        // Map'i guncelleme yapmak icin key, yenideger'i map'e eklemeliyiz
        // ornegin key 101 icin value Ali, Can, JDev
        // guncelleme icin sinifListMap.put(101,Ali, Can, JavaDeveloper)
        // bunu yapabilmek icin herbir key'e ve ona ait value'ye ihtiyacim var
        Set<Integer> keySeti = sinifListMap.keySet();
        String eachValue;
        for (Integer each:keySeti
        ) {
            eachValue= sinifListMap.get(each);
            eachValue=eachValue.replace("JDev", "JavaDeveloper");
            sinifListMap.put(each,eachValue);
            /*
             biz key'lerin tamamini aldik
             herbir key'in value'sunu get'irdik
             value uzerinde degisikligi yapip
             yeni halini put(key, yeniDeger) ile map'e koyduk
             */
        }
        System.out.println(sinifListMap);
    }
}