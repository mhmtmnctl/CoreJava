package day17_nestedForLoop;

public class C07_WhileLoop {
    public static void main(String[] args) {
        //20'den 50 ye kadar çift sayıları yazdıralım. sınırlar dahil

        //önce for loopla yapalım
        int baslangic = 20;
        int bitis = 50;
        for (int i = baslangic; i <= bitis; i++)
        {
            if (i%2==0)
            {
                System.out.print(i+" ");
            }


        }

        //While loop ile yapalım
        int temp = baslangic;
        while (temp<=bitis)
        {
            if (temp%2==0)
            {
                System.out.print(temp + " ");
                temp++;
            }
        }



    }
}
