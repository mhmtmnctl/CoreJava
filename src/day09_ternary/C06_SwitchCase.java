package day09_ternary;


import java.util.Locale;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //kullanıcıdan bir gün ismi isteyin ve haftaiçi veya hafta sonu olduğunu yazınız

        String input = "pazar";
        input = input.toLowerCase();

        switch (input){

            case "pazartesi":
                System.out.println("Hafta içi");
                break;
            case "sali":
                System.out.println("Hafta içi");
                break;
            case "çarşamba":
                System.out.println("Hafta içi");
                break;
            case "perşembe":
                System.out.println("Hafta içi");
                break;
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lütfen geçerli bir gün giriniz");
                break;

        }



        switch (input){

            case "pazartesi":
            case "sali":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Hafta içi");
                break;
            case "cumartesi":

            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lütfen geçerli bir gün giriniz");
                break;

        }

    }
}
