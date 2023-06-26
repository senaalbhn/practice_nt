package day_07;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C01_DateTime {
    public static void main(String[] args) {
         /*
        Ali 29.10.1923 tarihinden 45 yıl 8 ay 5 gun sonra dogdu.
        Veli  15.09.1993 tarihinden 24 yil 2 ay 11 gun once dogdu.
        Ali ve Veli'nin dogum tarihini hesaplayıp yazdırınız.
        Ali'nin dogum tarihini 23/6/15 formatına benzer bir formatta yazdırın
        Ali ve Veli'nin dogum tarihlerinin aynı olup olmadıgını kontrol eden kodu yazınız
         */

        LocalDate dogAli= LocalDate.of(1923,10,29).plusYears(45).plusMonths(8).plusDays(5);
        System.out.println(dogAli);

        LocalDate dogVeli=LocalDate.of(1993,9,15).minusYears(24).minusMonths(2).minusDays(11);
        System.out.println(dogVeli);

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yy/MM/dd");
        String formatliAli= dtf.format(dogAli);
        System.out.println(formatliAli);
        String formatliVeli= dtf.format(dogVeli);
        System.out.println(formatliVeli);

        boolean isEqual= dogAli.isEqual(dogVeli);
        if (isEqual==true){
            System.out.println("Ali ve Veli ayni gunde dogmustur");
        }else {
            System.out.println("Ali ve Veli farkli gunlerde dogmustur");
        }


    }
}
