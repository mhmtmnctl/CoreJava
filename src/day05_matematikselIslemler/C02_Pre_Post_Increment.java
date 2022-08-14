package day05_matematikselIslemler;

public class C02_Pre_Post_Increment {
    public static void main(String[] args) {
        int sayi = 10;
        System.out.println("Pre-increment : "  +   ++sayi); // 11 yazcak. çünkü önce artırdık.


        System.out.println("Post-increment:  "   +   sayi++);// 11 yazcak çünkü yazdırma önce... ama sonra da sayıyı 12 yapcak


        System.out.println("Post-increment'den sonra : "  +  sayi);//sayının son değeri 12 oldu üstte
        sayi++;//13
        ++sayi;//14 olur



    }
}
