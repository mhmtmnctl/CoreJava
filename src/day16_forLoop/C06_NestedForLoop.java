package day16_forLoop;

public class C06_NestedForLoop {
    public static void main(String[] args) {


        /*
        bazen tek değişken sorunu çözmeye yetmez

        *
        **
        ***
        ****
        *****
        //yan yana 3 tane * yaz

         */
        for (int i = 1; i <= 5 ; i++) { // 5 satır yazdırmak için

            for (int j = 1; j <=i ; j++) {
                System.out.print("*"); // burası sadece * yazdırıyor.

            }
            System.out.println("");// bi alt satıra atmak için

        }


    }
}
