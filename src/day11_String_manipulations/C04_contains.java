package day11_String_manipulations;

public class C04_contains {
    public static void main(String[] args) {

        /*
        Soru 2) Kullanicidan bir cumle isteyin.
        Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
         */


        String cumle = "Java büyülü, dunya kucucuk";
        cumle=cumle.toLowerCase();
        // requirementsde büyük harf küçük harf hassasiyeti hakkında birşey söylenmemiş
        // ikinci olarak da her iki kelimeyi içerme durumu açıklanmamış
        // bu durumda görevi bize kim verdiyse ona sormak lazım

        //ek requiments : ikisini de içeriyorsa karar ver, büyük mü yazdırsın küçük mü?
        //case sensetive olmasın
        if(cumle.contains("kucuk") && cumle.contains("buyuk"))//en başa sınırlandırı olan koşulu yazmalıyız
        {
            System.out.println("Karar ver büyük mü küçük mü yazdırayım");

        }
        else if (cumle.contains("kucuk"))
        {
            System.out.println(cumle.toLowerCase());
        }
        else if ( cumle.contains("buyuk"))

        {
            System.out.println(cumle.toUpperCase());
        }
        else
        {
            System.out.println("Cümle büyük ya da küçük içermiyor");
        }


    }
}
