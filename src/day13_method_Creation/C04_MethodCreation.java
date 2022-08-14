package day13_method_Creation;

public class C04_MethodCreation {
    public static void main(String[] args) {


       // String str = "Java her gecen gun guzellesiyor";
       // System.out.println(str.substring(0,4));;//Java //ctrl basılı tutarak substring üzerine tıkla metodu gör



        //input olarak verilen iki integeri toplayıp sonucunu yazdıran bir metod oluşturun

        int input1=10,input2=20;
        topla(input1,input2);
 //       int input1= 30;



    }
    //method 4 adımda oluşturulur
    //1.adım method call
    //2.adım argument eklenmesi gerekiyorsa ekleyelim,eğer metodun return type'ı voidden farklı olacaksa
              //bir variable oluşturup metod call'u assign edelim.

   public static void topla(int giris1,int giris2) {
        //3.adım metot declarasyonunda değiştirilmesi gereken bölümleri değiştir
            //(access modifier, return type vb...)

       //4.adım eğer return type void dışında birşeyse return keyword'u ve dönecek değeri hesaplamalıyız
       System.out.println("girilen iki sayının toplamı :" + (giris1+giris2));
      // int input1 = 10;



    }
}
