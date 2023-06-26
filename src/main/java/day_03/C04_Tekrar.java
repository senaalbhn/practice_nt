package day_03;

import java.util.Scanner;

public class C04_Tekrar {

        /*Kullanıcıdan sisteme bir numara girmesini isteyin.
          Eger numara sıfırdan küçükse, konsolda "Negatif Sayı" yazdırın.
          Degilse, 10'dan küçük olup olmadığına bakın. 10'dan küçükse konsola "Pozitif Rakam" yazdırın,
          10'dan büyük veya eşitse konsola "Pozitif Sayı" yazdırın. */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir numara giriniz");
        int num= scan.nextInt();


        if (num<0){
            System.out.println("Negatif Sayi");
        } else {
            if (num<10){
                System.out.println("Pozitif");
            }else {
                System.out.println("Pozitif Sayı");
            }

        }



    }














}
