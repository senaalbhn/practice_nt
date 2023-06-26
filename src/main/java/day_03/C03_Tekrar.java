package day_03;

import java.util.Scanner;

public class C03_Tekrar {
    public static void main(String[] args) {
        //kullanıcıdan iki sayı isteyin
        //sayıların ikisi de pozitifse sayıların toplamını yazdırın
        //ikisi de negatifse sayıların çarpımını yazdırın
        //ikisi farklı işaretlere sahipse farklı işaretlerde sayılarla işlem yapamazsın
        //sayılardan sıfıra eşit olan varsa sıfır çarpmaya göre yutan elamandır yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki tane sayi giriniz");
        int num1= scan.nextInt();
        int num2= scan.nextInt();
        
        
        if (num1>0 && num2>0){
            System.out.println(num1+num2);
        } else if (num1<0 && num2<0) {
            System.out.println(num1*num2);
        } else if ((num1>0 && num2<0) || (num1<0 && num2>0)) {
            System.out.println("farklı işaretlerde sayılarla işlem yapamazsın");
        } else {
            System.out.println("sıfır çarpmaya göre yutan elamandır ");
        }


    }
}
