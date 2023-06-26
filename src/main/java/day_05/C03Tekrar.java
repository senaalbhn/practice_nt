package day_05;

import java.util.Scanner;

public class C03Tekrar {
    public static void main(String[] args) {

        // Kullanıcıdan sisteme bir sayi girmesini isteyiniz
        // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
        //or: 5!=1*2*3*4*5

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int num = scan.nextInt();
        int kvnz = 1;

        int i = 1;
        while (i <= num) {
            kvnz = kvnz * i;
            i++;
        }
        System.out.println(kvnz);


    }
}
