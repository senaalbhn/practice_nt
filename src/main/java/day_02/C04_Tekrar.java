package day_02;

import java.util.Scanner;

public class C04_Tekrar {

    public static void main(String[] args) {
        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char ch= scan.next().charAt(0);

        print(ch);


    }

    private static void print(char ch) {

        System.out.println("  "+ch+"  \n"+
                           " "+ch+" "+ch+" \n"+
                           ch+" "+ch+" "+ch
        );
    }
}
