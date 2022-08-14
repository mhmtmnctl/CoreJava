package day07_ifStatements;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class homeWorks {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dakika giriniz.");
        int dk = scan.nextInt();
        int gun= dk/(24*60);//kaç gün
        int yil= dk/(12*30*24*60);//kaç yıl
        System.out.println(dk + " dakika yaklaşık " +yil+" yıl " + gun +" gündür");











 //   //Kullanıcıdan bir tamsayı isteyin ve tek mi çift mi yazdırın
 //       Scanner scan = new Scanner(System.in);
 //       System.out.println("Lütfen bir tamsayı sayı giriniz");
 //       Integer sayi = scan.nextInt();
 //           if (sayi % 2 == 0) {
 //               System.out.println("Girilen sayı çift sayıdır");
 //           } else {
 //               System.out.println("Girilen sayı tek sayıdır");
 //           }



            //Kullanıcıda gün isimlerinden birinin ilk harfini isteyin ve o harfle başlayan gün isimlerini yazdırın

    //   Scanner scan = new Scanner(System.in);
    //   System.out.println("Lütfen bir gün ismi giriniz");
    //   String gun = scan.next().toLowerCase();

    //   if (gun.charAt(0) == 'p')
    //   {
    //       System.out.println("P ile başlayan günler şunlardır: Pazar Pazartesi Perşembe");
    //   }
    //   else if (gun.charAt(0)== 's')
    //   {
    //       System.out.println("S ile başlayan günler şunlardır: Salı");

    //   }
    //   else if (gun.charAt(0)=='c')
    //   {
    //       System.out.println("C ile başlayan günler şunlardır: Cuma ve Cumartesi");

    //   }

    //   else if (gun.charAt(0)=='ç')
    //   {
    //       System.out.println("Ç ile başlayan günler şunlardır: Çarşamba");

    //   }
    //   else {
    //       System.out.println(gun + " ile başlayan bir gün yoktur." );
    //   }



        //Kullanıcıdan gün ismini alın ve haftaiçi veya haftasonu olduğunu yazdırın.

    //  Scanner scan = new Scanner(System.in);
    //  System.out.println("Lutfen bir gün ismi giriniz");
    //  String gun = scan.next().toLowerCase();
    //  if (gun.equals("pazar") || gun.equals("cumartesi"))
    //  {
    //      System.out.println(gun +" günü hafta sonudur.");
    //  }
    //   else if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma") )
    //  {
    //      System.out.println(gun +" günü hafta içidir.");
    //  }
    //   else {
    //      System.out.println("lütfen geçerli bir gün ismi giriniz");
    //  }


        //Kullanıcıdan dikdörtgenin kenar uzunluklarını isteyin ve kare olup olmadığını yazdırın.

     // Scanner scan = new Scanner(System.in);
     // System.out.println("Lütfen dikdörgenin bir kenarını giriniz.");
     // int knr1 = scan.nextInt();
     // System.out.println("lütfen diğer kenarı giriniz.");
     // int knr2 = scan.nextInt();

     // if (knr1 == knr2)
     // {
     //     System.out.println("Bu dikdörtgen bir karedir");

     // }

     // else
     // {
     //     System.out.println("Bu dikdörtgen kare değildir");
     // }


        /*
        kullanıcıdan bir gün alın eğer gün "cuma" ise ekrana "müslümanlar için kutsal gün" yazdırın
        "cumartesi" ise ekrana "yahudiler için kutsal gün" yazdırın
        "pazar" ise ekrana "hıristiyanlar için kutsal gün" yazdırın
         */

     //   Scanner scan = new Scanner(System.in);
     //   System.out.println("lütfen bir gün giriniz");
     //   String gun = scan.next().toLowerCase();
     //   if (gun.equals("cuma"))
     //   {
     //       System.out.println("Müslümanlar için kutsal gün");
     //   }
     //   else if (gun.equals("cumartesi"))
     //   {
     //       System.out.println("Yahudiler için kutsal gün");
     //   }
     //   else if (gun.equals("pazar"))
     //   {
     //       System.out.println("Hıristiyanlar için kutsal gün");
     //   }



        //Kullanıcıdan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadığını kontrol edin

     //  Scanner scan = new Scanner (System.in);
     //  System.out.println("Lütfen bir karakter giriniz");
     //  char chr = scan.next().charAt(0);
     //  if ((chr <= 'z' && chr >= 'a') || (chr <= 'Z' && chr >= 'A')  )
     //  {
     //      System.out.println("Girilen karakter bir harftir.");
     //  }
     //  else
     //  {
     //      System.out.println("Girilen karakter bir harf değildir");
     //  }

        //kullanıcıya yaşını sorun eğer yas 65 den küçük ise "emekli olamazsın,çalışmalısın" 65e eşit veya büyükse "emekli olabilirsin" yazdırın

    //   Scanner scan = new Scanner(System.in);
    //   System.out.println("Lütfen yaşınızı giriniz");
    //   int yas = scan.nextInt();
    //   if (yas<65)
    //   {
    //       System.out.println("Emekli olmazsın "+(65-yas)+" yıl daha çalışmalısın");
    //   }
    //   else if (yas>=65)
    //   {
    //       System.out.println("Emekli olabilirsiniz");
    //   }

        //kullanıcıdan bir üçgenin üç kenar uzunluğunu alın eğer üç kenar uzunluğu biribrine eşitse ekrana
        //"Eşkenar üçgen" yazdırın. Diğer durumlarda ekrana "Eşkenar değil" yazırın

      // Scanner scan = new Scanner(System.in);
      // System.out.println("Lütfen eşkenar üçgenin birinci kenarını giriniz ");
      // int knr1 = scan.nextInt();
      // System.out.println("Lütfen eşkenar üçgenin ikinci kenarını giriniz ");
      // int knr2 = scan.nextInt();
      // System.out.println("Lütfen eşkenar üçgenin üçüncü kenarını giriniz ");
      // int knr3 = scan.nextInt();

      // if ((knr1==knr2) && (knr1==knr3) && (knr3==knr2))
      // {
      //     System.out.println("Eşkenar üçgen");
      // }

      // else
      // {
      //     System.out.println("Eşkenar değil");
      // }

        //oca sorusu
    //   int x = 1;
    //   int y = 1;
    //   if (x++ < ++y)
    //   {
    //       System.out.println("Hello ");
    //   }
    //   else
    //   {
    //       System.out.println("Welcome ");

    //   }
    //   System.out.println("Log" + x + ":" + y);



        //Kullanıcıdan gün ismi isteyin. Girilen isim geçerli bir gün ismi ise gün isminin 1.2.ve3. harflerini
        //ilk harf büyük diğer ikisi küçük olacak şekilde yazdırın, gün ismi geçerli değilse "geçerli gün ismi giriniz" yazdırın

     // Scanner scan = new Scanner(System.in);
     // System.out.println("Lütfen geçerli bir gün ismi giriniz");
     // String gun = scan.next().toLowerCase();
     // if (gun.equals("pazartesi") || gun.equals("salı") || gun.equals("çarşamba") || gun.equals("perşembe") || gun.equals("cuma") || gun.equals("cumartesi") || gun.equals("pazar") )
     // {
     //     System.out.println("girilen gün: " + gun.substring(0,1).toUpperCase()+gun.substring(1));
//
//
     // }
//
     // else
//
     // {
     //     System.out.println("Lütfen geçerli bir gün ismi giriniz");
     // }


        /* kullanıcıdan iki sayı isteyin, sayıların ikiside pozitif ise sayıların toplamını yazdırın,
            sayıların ikiside negatif ise sayıların çarpımını yazdırın,sayıların ikisi farklı işaretlere sahipse
            "farklı işaretli sayılarla işlem yapamazsın" yazdırın,sayılardan sıfıra eşit olan varsa "sıfır çarpmaya göre yutan elemandır" yazdırın

         */

     //  Scanner scan = new Scanner(System.in);
     //  System.out.println("Lütfen birinci sayıyı giriniz");
     //  int sayi1 = scan.nextInt();
     //  System.out.println("Lütfen ikinci sayıyı giriniz");
     //  int sayi2= scan.nextInt();

     //  if (sayi1>0 && sayi2>0)
     //  {
     //      System.out.println("Sayıların toplamı= " + (sayi1+sayi2));
     //  }
     //  else if (sayi1<0 && sayi2<0)
     //  {
     //      System.out.println("Sayıların çarpımı= " + (sayi1*sayi2));
     //  } else if (sayi1 == 0 || sayi2==0)

     //  {
     //      System.out.println("Sıfır çarpmaya göre yutan elemandır.");
     //  }

     //  else
     //  {
     //      System.out.println("Farklı işaretlerde işlem yapamazsın");
     //  }

        /*
            Kullanıcıdan 100 üzerinden notu isteyin.Not'u harf sistemine çevirip yazdırın.
            50'den küçükse "D", 50-60 arası "C", 60-80 arası "B", 80 üzerinde ise "A"
         */

     // Scanner scan = new Scanner(System.in);
     // System.out.println("Lütfen 0-100 arası notunuzu giriniz");
     // int not = scan.nextInt();;
     // if (not<50 && not>0)
     // {
     //     System.out.println("Harf sisteminde notunuz: D ");
     // }
     // else if (not>=50 && not<=60)
     // {
     //     System.out.println("Harf sisteminde notunuz: C");
     // }
     // else if (not>60 && not<=80)
     // {
     //     System.out.println("Harf sisteminde notunuz: B");
     // }

     // else if (not>80 && not<=100)
     // {
     //     System.out.println("Harf sisteminde notunuz: A");
     // }
     // else
     // {
     //     System.out.println("Lütfen geçerli bir not giriniz");
     // }

        //kullanıcıdan maas için bir teklif isteyin ve asağıdaki değerlere göre cevap yazdırın
        //teklif 80.000 üzerinde ise "kabul ediyorum"
        //60.000-80.000 arası ise "konuşabiliriz"
        //60.000 altında ise malesef kabul edemem

     //  Scanner scan = new Scanner(System.in);
     //  System.out.println("Lütfen maaş teklifini giriniz");
     //  int maas = scan.nextInt();
     //  if(maas>=80000)
     //  {
     //      System.out.println("Kabul ediyorum");
     //  }
     //  else if (maas<80000 && maas>=60000)
     //  {
     //      System.out.println("Konuşabiliriz");
     //  } else if (maas<60000)
     //  {
     //      System.out.println("Malesef kabul edemem");
     //  }

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Günde kaç bardak çay içiyorsunuz?");
//        double cay = scan.nextDouble();
//        System.out.println("Çaya kaç şeker atıyorsunuz?");
//        double kac_skr = scan.nextDouble();
//
//        double sonuc = (((cay*kac_skr)*365)*1.7)/1000;
//        System.out.println("Yılda " + sonuc + " kg şeker kullanıyor");











    }

}
