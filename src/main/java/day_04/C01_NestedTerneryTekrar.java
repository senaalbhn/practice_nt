package day_04;

import java.util.Scanner;

public class C01_NestedTerneryTekrar {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayıyı ekrana yazdırın.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen birinci sayiyi giriniz");
        int num1= scan.nextInt();
        System.out.println("Lutfen ikinci sayiyi giriniz");
        int num2= scan.nextInt();

        System.out.println(num1 == num2 ? "Sayilar birbirine esittir" : (num1 > num2 ? "Buyuk olan sayi: "+num1 : "Buyuk olan sayi: "+ num2));


    }
}
