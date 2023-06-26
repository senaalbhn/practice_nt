package day_04;

import java.util.Scanner;

public class C06_ForLoops {
    public static void main(String[] args) {
         /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String word= scan.next().toLowerCase();
        int sayac= 0;


        for (int i=0; i< word.length(); i++){

            if (word.charAt(i)=='a'){
                sayac++;
            } else if (word.charAt(i)=='c') {
                break;
            }
        }
        System.out.println(sayac);





    }
}
