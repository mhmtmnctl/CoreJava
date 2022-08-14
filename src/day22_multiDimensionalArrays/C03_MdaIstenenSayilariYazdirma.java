package day22_multiDimensionalArrays;

public class C03_MdaIstenenSayilariYazdirma {
    public static void main(String[] args) {

        /*
        verilen iki katlı bir mda array'de
        outer indexi ve inner indexi aynı olan sayıların toplamını bulunuz.

        int [][] sayilar = {{1,5,6,9},{2,5},{3,1,6}};

        [0][0]+ [1][1]+[2][2].....
         */

        int [][] sayilar = {{1,5,6,9},{2,5},{3,1,6},{4,4,4,4}};

        int istenenToplam = 0;
        //kaç katlı array varsa o kadar loop oluşturmalıyız

        for (int i = 0; i < sayilar.length ; i++)
        {
            for (int j = 0; j <sayilar[i].length ; j++)
            {
                if (i==j)
                {
                    istenenToplam+=sayilar[i][j];
                }
            }
        }
        System.out.println("İstenen toplam :"+istenenToplam);

    }
}
