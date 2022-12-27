package day04_dataCasting;

public class C04_ExplicitNarrowing {
    public static void main(String[] args) {

        // geniş data türündeki değeri dar data türündeki variable'a atamak isterseniz
        //java sizin geniş data türündeki değerin dar data türünün sınırlarına uyup uyamayacağını çalıştırana kadar bilemez. ama java risk almaz
        //riski sıfıra indirmek için burada bir sorun olursa sorumluluğu kabul etmenizi bekler
        //bunun için değerin önüne parantez içinde istediğimiz data türünü yazmamız yeterlidir
        //2 risk var. bu riski üstlendiğimizde 3 durum oluşabilir.
        // 1.durum. bizim değerimiz dar kalıp değerlerine uygun olursa hiç bir kayıp olmadan cast olur.
        //2.durum. double bir sayıyı int'e cast etmek gibi durumlarda data kaybı yaşanabilir.
        //3.durum. geniş kalıptan değeri dar kalıba koyduğnuzda sınırları aşan durumlarda veri başkalaşabilir.

        int sayi1=132;

        byte sayi2= (byte) sayi1;
        System.out.println(sayi2);


    }
}
