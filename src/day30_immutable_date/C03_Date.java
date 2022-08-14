package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {
    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();
        System.out.println(tarih);  //2022-07-23

        tarih.getDayOfYear();
        System.out.println(tarih.getDayOfYear()); //204
        System.out.println(tarih.getYear());      // 2022
        System.out.println(tarih.getDayOfWeek()); //SATURDAY
        System.out.println(tarih.getMonthValue()); //7
        System.out.println(tarih.isLeapYear());  // false   (artik yil mi degil mi)

        LocalDate tarih2 = LocalDate.of(1991, 8, 14);
        System.out.println(tarih2); // 1991-08-14

        LocalDate tarih3 = LocalDate.of(1987, Month.SEPTEMBER,  3);
        System.out.println(tarih3);   // 1991-08-14

        System.out.println(tarih.plusDays(100)); //2022-10-31

        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12)); //2027-11-04

        System.out.println(tarih.minusWeeks(20)); // 2022-03-05   (20 hafta oncesini yazar)

        System.out.println(tarih.minusDays(100).minusMonths(5)); // 2021-11-14

        System.out.println(tarih.isAfter(tarih2)); //true  (tarih1 , tarih2 den sonra mi)

        // iki farkli dogum gunu girildiginde
        //hangisinde doganin daha buyuk oldugunu bulunuzz

        if (tarih2.isAfter(tarih3)){
            System.out.println(tarih3+" tarihinde dogan daha buyuk");
        }else if (tarih2.isBefore(tarih3)){
            System.out.println(tarih2+" tarihinde dogan daha buyuk");
        }else {
            System.out.println("iki tarih birbiri ile ayni");
        }

    }
}
