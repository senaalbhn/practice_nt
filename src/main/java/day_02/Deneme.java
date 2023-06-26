package day_02;

import java.util.Scanner;

public class Deneme {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen dunyanin en tatli bebeginin ismini yaziniz!");

        char ch= scan.next().charAt(0);

        print(ch);
    }

    private static void print(char ch) {

        System.out.println( ch+"       "+ch+"\n"+
                            ch+"       "+ch+"\n"+
                            ch+"       "+ch+"\n"+
                            ch+"       "+ch+"\n"+
                            " "+ch+" "+ch+" "+ch+" "+ch
        );
    }
}
