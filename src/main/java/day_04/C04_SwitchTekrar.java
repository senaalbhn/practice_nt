package day_04;

import java.util.Scanner;

public class C04_SwitchTekrar {
    public static void main(String[] args) {

        /* Kullanıcıdan 0-4 arasi sınav puanını sisteme girmesini isteyiniz.

         Eger puanı 0,0-1,0 arasında ise KALDI seviyesi veriniz
              puanı 1,0-2,0 arasında ise GECTI seviyesi veriniz
              puanı 2,0-2,5 arasında ise IYI seviyesi veriniz
              puanı 2,5-3,5 arasında ise UST seviyesi veriniz
              puanı 3,5-4,0 arasında ise HARİKA seviyesi veriniz

              seviyesini yazdırınız

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTİ seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARİKA seviyesine A harf notu veriniz

             harf notunu yazdırınız
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 0-4 arasi sınav puanını sisteme giriniz");
        double puan= scan.nextDouble();
        String seviye= "";

        if (puan<0 || puan>4){
            seviye="Gecersiz giris";
        } else if (puan<1){
           seviye="Kaldi";
        } else if (puan<2){
            seviye="Gecti";
        } else if (puan<2.5){
            seviye="Iyi";
        } else if (puan<3.5){
            seviye="Ust";
        }  else {
            seviye="Harika";
        }
        System.out.println(seviye);

        switch (seviye){
            case "Kaldi":
                System.out.println("Notunuz: F");break;
            case "Gecti":
                System.out.println("Notunuz: D");break;
            case "Iyi":
                System.out.println("Notunuz: C");break;
            case "Ust":
                System.out.println("Notunuz: B");break;
            case "Harika":
                System.out.println("Notunuz: A");break;
        }


























    }
}
