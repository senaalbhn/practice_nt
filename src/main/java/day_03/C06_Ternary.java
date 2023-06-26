package day_03;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan bir sayı alınız
        //verılen sayının 3 veya daha cok bsmklı olup olmadıgını  ternary ile kontrol eden
        // ve yazdıran bir method olusturun

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen 3 veya cok basamakli pozitif bir sayi giriniz");
        int sayi= scan.nextInt();


        kacBasamakli(sayi);
    }

    private static void kacBasamakli(int sayi) {
        System.out.println((sayi > 99 ? "Sayi uc veya daha cok basamakli" : "Sayi ucten az basamakli"));
    }
}
