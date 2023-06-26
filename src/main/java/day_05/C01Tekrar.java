package day_05;

import java.util.Scanner;

public class C01Tekrar {
    public static void main(String[] args) {
        /*
            Kullanıcıdan sisteme satır sayısını ve karakter girmesini isteyiniz.
            ve ardından kullanıcının girdiği karakteri kullanarak ikizkenar dik üçgen çizen
            bir method olusturun

            Satır sayısı = 4
            girilen karakter * ==>      *
                                        * *
                                        * * *
                                        * * * *
            */

        Scanner scan= new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir=scan.nextInt();
        System.out.println("Karakteri giriniz");
        char ch= scan.next().charAt(0);

        for (int i = 0; i < satir; i++) {

            for (int j = 0; j < i
                    ; j++) {

            }

        }























    }
}
