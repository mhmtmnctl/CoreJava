package day12_stringManipulations;

public class C02_replaceAll {

    public static void main(String[] args) {

        String str = "1Bu2gu3n Ja*va- cok g3uz/el";

        //str'ı Bugun Java cok guzel haline getirin

        //replaceAll'un amacı aynı özellikteki tüm karakterleri kapsamasıdır.
        //bütün sayıları sil
        //bütün özel karakterleri sil şeklinde yapabiliriz

        //tüm özel karakterleri silelim dediğimizde space'lerde siliniyor(boşluklar)
        //boşlukları korumak için en başta onların yerine cümlede bulunmayacak bir string koyalım
        //"qazwsx" gibi... cümlede olma ihtimali olmayan şeyler olabilir.

        str= str.replace(" ","qazwsx");// boşluk yerine qazwsx yazdık
        System.out.println(str);


        str= str.replaceAll("\\W","");// W harfler ve rakamlar dışındaki herşey(karakter ve boşluklar)
        System.out.println(str);//boşluklarda gitti.... :( 1Bu2gu3nJavacokg3uzel
        str=str.replaceAll("\\d","");//sayılardan da kurtulduk

        //şimdi space'leri geri getirelim.

        str=str.replace("qazwsx"," ");
        System.out.println(str);




    }
}
