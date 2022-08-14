package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe {
    /*
    Extends keyword kullanilan class'larda ister
    default cons bulunsun istersek de biz yeni constructor(lar)
    ollusturalim,  JAVA constructor'in ilk satirina
    super(); constructor call yazar

    super(); constructor call, default cons a benzer
    gorunmese de orada vardir ve calisir
    ancak biz ilk satira farkli bir constr call yazarsak
    JAVA super(); 'i siler

    Eger biz mudahale edip kendi constr call umuzu olusturmazsak
    Java nin fefault olarak olusturdugu constr call herzaman parametresizdir

     */

    FMemur (){
        //super();
        System.out.println("Memur parametresiz cons");
    }

    FMemur (String isim){
        System.out.println("Memur parametreLI cons");
    }

    public static void main(String[] args) {

        FMemur memur1 = new FMemur("Ali");

    }

}
