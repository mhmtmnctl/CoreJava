package day10_stringManipolation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "java ogrenmek çok güzel";
        System.out.println(str.indexOf("o"));//5
        System.out.println(str.indexOf('g'));//6

        System.out.println(str.indexOf("t"));// bana integer döndürüyor,int'de yok diye bir değer bulunmuyor
                                             // 0 dersek J nin indeksidir. Ama -(negatif) bir değer dönerse biz aranan stringin str'da olmadığını anlarız
                                             // Java -1 döndürmeyi tercih etmiştir.

        String str5= "weşsmmxcbm;şlfş:fgdfmglkşdfmglkdfmgkldfmgkldfmgkldfdfşlgmd";

        //str5'de p harfi kullanılmış mıdır?
        if (str5.indexOf("p")==-1) {
            System.out.println("str5'de istenen karakter kullanılmamış");
        } else {
            System.out.println("str5'de istenen karakter kullanılmış");
        }


    }
}
