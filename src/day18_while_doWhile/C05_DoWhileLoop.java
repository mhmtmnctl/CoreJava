package day18_while_doWhile;

public class C05_DoWhileLoop {
    //örnek soru 1 in çözümü slayttaki
    //9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz
    public static void main(String[] args) {

        int bas= 9;
        int bitis = 190;
        int temp = bas;

        //önce while loop ile yapalım

        while (temp<bitis)
        {
            if (temp%7==0)
            {
                System.out.print(temp + " ");

            }
            temp++; // artırmayı unutursan sonsuz loop olur
        }


        //do While loop ile yapalım
        System.out.println("");
        temp=bas;//tempi ilk haline getirelim
        do
        {
            if (temp%7==0)
            {
                System.out.print(temp + " ");


            }
            temp++;
        }while (temp<bitis);



    }


}
