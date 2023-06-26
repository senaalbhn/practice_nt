package day_02;

import java.util.Scanner;

public class C03_Scanner {

    //kullanıcıdan aldıgınız iki sayının karelerinin birbirine esıt olup olmadıgını kontrol eden bir method yazınız
    //yani alınan iki sayının kareleri esıt ıse true, degıl ıse false yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen birinci sayiyi giriniz");

        int num1 = scan.nextInt();

        System.out.println("Lutfen ikinci sayiyi giriniz");

        int num2 = scan.nextInt();

        boolean sonucunuz= karelerEsitMi(num1,num2);
        System.out.println("sonuc = " + sonucunuz);





    }

    public static boolean karelerEsitMi ( int num1 , int num2){

        boolean sonuc= (num1*num1)==(num2*num2);
        return sonuc;
    }
}
