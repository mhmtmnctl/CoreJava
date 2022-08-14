package day20_Arrays;

import java.util.*;

public class C06_BireyselCalisma {
    public static void main(String[] args) {

//        int newNumbers[] = new int[5];
//        System.out.println(Arrays.toString(newNumbers));//0,0,0,0
//        newNumbers[0]=9;
//        System.out.println(Arrays.toString(newNumbers));//9,0,0,0
//
//        int numbers[]={3,2,1,4,10,2,2};
//        System.out.println(Arrays.toString(numbers));
//
//        String names[]={"Ali","Veli","Ayse","Fatma","Aslan"};
//        System.out.println(Arrays.toString(names));
//        names[0]="Can";
//        names[2]="Gul";
//        System.out.println(Arrays.toString(names));
//        System.out.println(names.length);
//
//        for (int i = 0; i <names.length ; i++)
//        {
//            System.out.println(names[i]);
//        }
//        int toplam=0;
//        for (int i = 0; i < numbers.length; i++)
//        {
//            toplam += numbers[i];
//        }
//        System.out.println(toplam);
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(names);
//        System.out.println(Arrays.toString(names));
//
//        System.out.println(Arrays.binarySearch(numbers,2)); // kaç adet varsa onu veriyor
//
//        String str = "java cok guzel";
//        String arr1[]=str.split(" ");//boşluklardan ayırsın ve onu arr1 arrayine atsın
//        System.out.println(Arrays.toString(arr1));
//        String arr2 []=str.split("");
//        System.out.println(Arrays.toString(arr2));
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lütfen 5 adet sayı giriniz :");
//
//        int sayilar[] = new int[5];
//        for (int i = 0; i <sayilar.length ; i++)
//        {
//            sayilar[i]=scan.nextInt();
//        }
//        Arrays.sort(sayilar);
//        System.out.println(Arrays.toString(sayilar));

        //////////////////////////////////////////////////////
        /*
        Aranan değerin Array içerisinde kaçıncı eleman olduğunu bulan Java Kodu yazınız.

Array: [12,15,43,23,56,76,78,90,77,43]

Aranan değer:56
Beklenen Çıktı:
56 sayısı arrayin 4. elemanı
         */
 //       int[] sayilar = {12,15,43,23,56,76,78,90,77,43};
 //       int aranan = 56;
//
 //       for (int i = 0; i < sayilar.length; i++)
 //       {
 //           if (aranan==sayilar[i])
 //           {
 //               System.out.println(aranan + " sayısı arrayin "+ i + ". elemanı");
 //           }
 //       }
        ///////////////////////////////////////////////////
        //arrayi liste çeviren programı yazınız

  //      String[] kelimeler = {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
  //      List<String> kelimeListesi = new ArrayList<>();
//
  //      for (int i = 0; i < kelimeler.length; i++)
  //      {
  //          kelimeListesi.add(kelimeler[i]);
  //      }
  //      System.out.println(kelimeListesi);

        /////////////////////////////////////////////////////
        /*
        Array listesindeki 2. en büyük sayıyı bulan Java Kodunu yazınız.

Array: [1232,2345,5467,678,3454,2312,3451]
         */

 //       List<Integer> sayilar = new ArrayList<>();
 //       sayilar.add(1232);
 //       sayilar.add(2345);
 //       sayilar.add(5467);
 //       sayilar.add(678);
 //       sayilar.add(3454);
 //       sayilar.add(2312);
 //       sayilar.add(3451);
 //       Collections.sort(sayilar);
 //       System.out.println(sayilar.get(sayilar.size()-2));

        ////////////////////////////////////////////////////////////
        /*
        Array içerisindeki tek ve çift sayıların kaçar tane olduğunu bulan Java Kodu yazınız.

Array: [1,2,3,4,5,6,7,8,9]

Beklenen Çıktı:
Tek Sayilar: 5
Cift Sayilar: 4
         */

 //       int[] arr = {1,2,3,4,5,6,7,8,9};
 //       int tekSayilar = 0;
 //       int ciftSayilar = 0;
 //       for (int i = 0; i < arr.length; i++)
 //       {
 //           if (arr[i]%2==0)
 //           {
 //               ciftSayilar++;
 //           }
 //           else tekSayilar++;
 //       }
 //       System.out.println("Tek Sayilar: "+tekSayilar+"\n"+"Cift Sayilar: " +ciftSayilar);


        //////////////////////////////////////////////////////////////////


//        Scanner input = new Scanner(System.in);
//        String sentence = input.nextLine();
//
//        String reversed = "";
//
//        String[] str = sentence.split(" ");
//        System.out.println(Arrays.toString(str));
//        for (int i = str.length-1; i>=0; i--)
//        {
//            reversed+=str[i]+" ";
//        }
//        System.out.println(reversed);

        /////////////////////////////////////////////////////////////////


    /*
    Kullanıcının gireceği iki binary sayıyı toplayan Java kodunu yazınız.

Test Data:
birinci binary number: 100010
ikinci  binary number: 110010
Beklenen Çıktı:
1010100
     */

 //       long binary1, binary2;
 //       int i = 0, remainder = 0;
 //       int[] sum = new int[20];
 //       Scanner in = new Scanner(System.in);
 //       binary1 = in.nextLong();
 //       binary2 = in.nextLong();
 //       int toplam = 0;
 //       String binarySon="";
//
 //       int decimal1= Integer.parseInt(String.valueOf(binary1),2 );
 //       int decimal2= Integer.parseInt(String.valueOf(binary2),2);
 //       toplam=decimal1+decimal2;
 //       binarySon= Integer.toBinaryString(toplam);
 //       System.out.println(binarySon);








    }
}
