package day_02;

import java.util.Scanner;

public class C03tekrar {

    public static void main(String[] args) {

        //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
        //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        double num1= scan.nextDouble();

        System.out.println("Lutfen bir sayi daha giriniz");

        double num2 = scan.nextDouble();

        esitmi (num1 ,num2 );
    }

    private static void esitmi(double num1, double num2) {

        boolean esitmi = (num1*num1)==(num2*num2);
        System.out.println(esitmi);

    }
}
