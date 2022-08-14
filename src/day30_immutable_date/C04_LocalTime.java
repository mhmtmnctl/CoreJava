package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {

        LocalTime time1= LocalTime.now();
        System.out.println(time1); //19:12:24.576542200
        /*
        bizim olusturdugumuz date ve time
        canli saat ve tarih degildir
         LocalTime.now() kullandigimiz satirda o anki tarih veya saati alip
         bizim variable imiza store eder
         time1 variablei'nin degeri SABITTIR!!!
         */
        Thread.sleep(3000);
        time1=LocalTime.now();
        System.out.println(time1); // 19:17:27.588443200



    }
}
