package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str = " Bu gün ha va çok gu zel ";
        System.out.println(str.replace(" ","")); //boşlukları kaldıralım

        //hava kelimesini java yapalım

        System.out.println(str.replace("h","J").replace(" ",""));//string metotlarını ardarda yazabiliriz

        // güz el yerine harika yapalım

        System.out.println(str.replace("gu zel","harika"));


        //cümleyi replace kullanarak Bugün Java çok güzel yapalım
        str= str.replace("Bu gün","bugun")
                .replace("ha va","Java")            //bu şekilde altalta yazmak kod okunurluğu açısından güzel olur
                .replace("gu zel","guzel");
        System.out.println(str);

    }
}
