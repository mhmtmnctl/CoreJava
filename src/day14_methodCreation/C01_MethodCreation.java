package day14_methodCreation;

import day13_method_Creation.C04_MethodCreation;

public class C01_MethodCreation {
    public static void main(String[] args) {

        //input olarak verilen bir stringi tersten yazdıran bir method oluşturalım
        terstenYazdir("okan");
        C04_MethodCreation.topla(3,5);//önceki classtaki metodu çağırma



    }
    public static void terstenYazdir(String input){

        String tersInput = input.substring(3)+ input.substring(2,3)+input.substring(1,2)+input.substring(0,1);
        System.out.println("Verilen kelimenin tersten yazılışı : " + tersInput);




    }
}
