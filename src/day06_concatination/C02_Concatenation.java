package day06_concatination;

public class C02_Concatenation {
    public static void main(String[] args) {

        String str1= "Java";
        String str2 = "Guzeldir";
        int sayi1 = 5;
        int sayi2= 4;
        //Yukarıdaki variableları kullanarak istenilen metinleri yazdıralım

        System.out.println(str1 + " "+ str2+ " "+sayi1+sayi2);//Java Güzeldir 54
        System.out.println(str1+ " "+ str2+ " "+ (sayi1+sayi2));//Jacva güzeldir 9
        System.out.println(sayi1+sayi2+" "+ str1);//9 Java yazdıralım
        System.out.println(""+sayi1+sayi2+" "+str2);//54 Guzeldir yapalım  "" hiçlik denir string olması için ekledik
        str1.concat(str2);//javaGuzeldir
        System.out.println( str1.concat(str2));//JavaGuzeldir
        System.out.println(str1.concat(" ").concat(str2));//Java Guzeldir





    }
}
