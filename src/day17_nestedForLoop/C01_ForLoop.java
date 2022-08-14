package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen string'deki kullanılan harfleri tekrarsız olarak yazdırıp
        // kelimede kullanılan farklı harf sayısını
        //veren bir metod yazınız

        String input = "Java her zaman guzel";
        tekrarsizYap(input);

    }

    public static void tekrarsizYap(String input) {

     String benzersizInput = "";
     String islenecekKelime = input.replaceAll("\\W","");//Javaherzamanguzel    oldu
        System.out.print(islenecekKelime.substring(0,1));//J
        benzersizInput+=islenecekKelime.substring(0,1);//J

        for (int i = 1; i <islenecekKelime.length() ; i++) //ilk harfi aldığımız için 1 den başladık
        {
            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){

                System.out.print(", "+islenecekKelime.substring(i,i+1));
                benzersizInput+= islenecekKelime.substring(i,i+1);
            }

        }

        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
        System.out.println("Kelimede verilen benzersiz harf sayısı : " + benzersizInput.length());


    }
}
