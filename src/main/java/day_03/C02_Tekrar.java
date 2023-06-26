package day_03;

import java.util.Scanner;

public class C02_Tekrar {

    // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
    // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num1 = scan.nextInt();
        System.out.println("Lutfen bir sayi daha giriniz");
        int num2= scan.nextInt();

        if (num1>num2 ){
            System.out.println("ilk sayi ikinci sayidan buyuk");
        }else if (num1<num2) {
            System.out.println("ilk sayi ikinci sayidan kucuk");
        } else {
            System.out.println("iki sayi bir birine esit");
        }

    }
}
