package day16_forLoop;

public class C02_ForLoopHatalar {
    public static void main(String[] args) {

        //başlangıç noktasından sonra bitiş şartına yaklaşmıyorsak sonsuz loop oluşur.



        for (int i = 0; i >-10 ; i++)
        {
            System.out.println(i); // sonsuz kere çalışır.
        }



        //eğer ilk değer için bile bitiş şartı sağlanmıyorsa
        //for loop çalışır ama loop body'si hiçbir zaman devreye girmez.
        for (int i = 0; i >5 ; i++) {
            System.out.println(i);

        }


    }
}
