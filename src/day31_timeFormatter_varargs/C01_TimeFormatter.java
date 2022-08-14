package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarihSaat = LocalDateTime.now();
        System.out.println("Ilk olusturulan tarih : "+tarihSaat);
        //Ilk olusturulan tarih : 2022-07-25T21:40:45.427324800

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/M/yy hh:mm");
        System.out.println(dtf1.format(tarihSaat)); //25/7/22 09:45

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat));  // 25/Tem/2022 21:46


    }
}
