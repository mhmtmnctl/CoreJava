package day15_overloading_forLoop;



public class C06_StringTerseCevirme {
    public static void main(String[] args) {

        //input olarak verilen Stringi terse cevirip yazdıran bir metot oluşturun

        String input = "Java gun gectikce guzellesiyor";
        terstenYazdir(input);

        String ilk_dort_karakter = input.substring(0,4);
        System.out.println(ilk_dort_karakter);
        String geri_kalan = input.substring(5);
        System.out.println(geri_kalan);
        String tersJava ="";
        for (int i = 3; i >= 0; i--) {

            tersJava+=ilk_dort_karakter.substring(i,i+1);



        }
        System.out.println(tersJava+" "+ geri_kalan);
        double i =3;
        function(2, 3);





    }
    public static  void terstenYazdir(String input){

        String tersInput = input.substring(input.length()-1); // son karakteri aldı
        for (int i = input.length()-2; i >=0 ; i--)
        {

            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);



    }
    public static void function(double i, double j){

        System.out.println("Bad");

    }





}
