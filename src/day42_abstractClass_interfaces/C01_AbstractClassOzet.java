package day42_abstractClass_interfaces;

public class C01_AbstractClassOzet {
     /*
    Abstract Class Ozet:
    1-Bir class'i abstract yapip yapmamaya bastan karar veririz. Eger bir class'tan obje olusturmayacaksak
    o class'i child class'larinin uymasi gereken kurallari belirleyecek sekilde dizayn etmek istiyorsak, abstract class yapariz
​
    2- Abstract bir class'ta child class'larin mutlaka uymasi gereken kurallari abstract method'lar ile belirleriz
    Abstract method'lar mutlaka child class'larda override edileceği icin body'ye ihtiyac duymaz
​
    3-Abstract olarak tanimlanan method'larin body'si olmaz.
​
    4-Abstract class zincirinden sonra gelen ilk concrete class, parent'larinda bulunan ve concrete olmayan tum methodlari
    override etmek ZORUNDADIR. Ancak parent abstract class'larda bulunan concrete method'lari
    @Override etmek ZORUNDA DEGILDIR.
​
    5-Abstract bir class'in abstract child'i, parent'taki abstract method'lari @Override etmek ZORUNDA DEGILDIR.
​
    6-Abstract class'lar constructor'a sahiptir fakat abstract class'lardan OBJE OLUSTURULAMAZ.
     */
}
