package day41_abstractClass_Interface;
public class GCorolla extends EToyota {
    @Override
    protected void yakit() {
    }
    @Override
    protected void kaporta() {
    }
    /*
      Corolla class'inin 2 tane parent'i var
      corolla parent'larinin ikisinin de standartlarina (abstract method)
      uymak zorundadir
      Concrete bir class parent'i olan tum abstract class'larda
      abstract olan method'lari implement etmek ZORUNDADIR
      Ancak Parent silsilesinde override edilerek concrete yapilan method'lari
      override etmek zorunda DEGILDIR
     */
}
