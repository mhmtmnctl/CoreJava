package day17_nestedForLoop;

public class C05_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen inputa göre * lardan oluşan aşağıdaki şekli oluşturun
        input=4 için

*
* *
* * *
* * * *
* * *
* *
*

         */


        //artan kısmı nested for loop ile yapalım...

        int input = 5;
        for (int i = 1; i <=input ; i++)
        {
            for (int j = 1; j <=i ; j++) {//üçgen olduğu için i ye jkadar gidecek

                System.out.print("* ");

            }
            System.out.println("");
        }



        for (int i = input-1; i >=1 ; i--)
        {
            for (int j = i  ; j >=1 ; j--) //üçgen olduğu için i ye jkadar gidecek
            {

                System.out.print("* ");

            }
            System.out.println("");
        }

    }
}
