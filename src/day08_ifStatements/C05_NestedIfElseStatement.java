package day08_ifStatements;

import java.util.Scanner;

public class C05_NestedIfElseStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen şifre giriniz");
        String sifre = scan.next();
        char ilkHarf = sifre.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z') // ilk harfi büyük harf olan kelimeler
        {
            if (ilkHarf == 'A') {
                System.out.println("Gecerli şifre");
            } else {
                System.out.println("Geçersiz şifre");
            }
        }
            else if (ilkHarf>='a' &&  ilkHarf<='z')//ilk harf küçük harf
        {
            if (ilkHarf=='z')
            {
                System.out.println("Geçerli şifre");
            }else {
                System.out.println("Geçersiz şifre");
            }

        }
            else
            {
                System.out.println("Lütfen ilk karakter için sadece harf kullanın");
            }


        }


    }


