package day_03;

import java.util.Scanner;

public class C06_Tekrar {
    public static void main(String[] args) {

        //kullanıcıdan bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num= scan.nextInt();

        kacBasamakli(num);


    }

    private static void kacBasamakli(int num) {
        System.out.println((num>99 ? "uc basamakli" : "uc basamakli degil"));

    }
}
