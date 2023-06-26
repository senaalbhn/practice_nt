package day_05;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // Kullanıcıdan sisteme bir sayi girmesini isteyiniz
        // kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
        //or: 5!=1*2*3*4*5

        Scanner scan= new Scanner(System.in);
        System.out.println("Lurfen bir sayi girin");
        int a=scan.nextInt();
        int carpim=1;

        int i=1;
        while (i<=a){
            carpim=carpim*i;
            i++;
        }
        System.out.println(carpim);












    }
}
