package day17_nestedForLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
            verilen String'i aşağıdaki gibi yazdıran bir program yazın

            input = Deniz

            D
            De
            Den
            Deni
            Deniz


         */
        String input = "Ankara";

        for (int i = 1; i <=input.length() ; i++)
        {
            for (int j = 1; j <=i ; j++)
            {
                System.out.print(input.substring(j-1,j));//ilk harf için substring(0,1) olmalı  (0,1)
            }
            System.out.println("");
        }

        for (int i = input.length()-1; i >=0 ; i--) {

            for (int j = 1; j <=i ; j++)
            {
                System.out.print(input.substring(j-1,j));
            }

            System.out.println("");
        }






    }
}
