package lambda_functional_programming;

public class Utils {

    public static void ayniSatirdaBosluklaYazdir(Object obj){

        System.out.print(obj+" ");

    }

    public static boolean ciftElemaniSec(int x){

        return x%2==0;

    }

    public static boolean tekElemaniSec(int x){

        return x%2!=0;

    }

    public static int karesinAl(int x){

        return x*x;
    }

    public static int kupunuAl(int x){

        return x*x*x;
    }
    public static double yarisiniAl(int x){

        return x/2.0;

    }

    public static char sonKarakteriAl(String str){

        return str.charAt(str.length()-1);
    }

    public static char ilkKarakteriAl(String str){

        return str.charAt(0);
    }


}