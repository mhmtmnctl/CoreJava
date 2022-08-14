package day25_constructor;

public class Car {

    //bu class bizim kalıphanemiz
    /*
    bir araba oluşturmak için ihtiyacımız olan variable ve metotları bu classda belirleriz
    sonra farklı classlarda araba oluşturmamız gerekirse
    bu classdan biir obje oluşturup burada belirlenen variable ve metotolara göre
    araba üretiriz.
     */

   public String marka="Marka belirtilmedi";//adam markayı girmezse default olarak bu gözüksün.
   public String model = "Model belirtilmedi";
    int yil;
    public int fiyat;


    public void benzinliArac(){

        System.out.println("Bu araç benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("Bu araba max "+hiz+" km hız yapar.");
        int a;
    }


}
