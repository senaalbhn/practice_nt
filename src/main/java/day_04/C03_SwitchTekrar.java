package day_04;

import java.util.Scanner;

public class C03_SwitchTekrar {
    public static void main(String[] args) {

        // Kullanıcıdan uc basamaklı pozitif bir sayı sisteme girmesini isteyiniz
        // Bu sayıyı okunuşuna çeviren bir kod yazınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen uc basamakli bir sayi giriniz");
        int num= scan.nextInt();
        int num1= Math.abs(num);

        if (num1<100 && num1>999){
            System.out.println("Girdiginiz sayi uc basamakli degildir");
        } else {

            if ( num<0){
                int birler= num1%10;
                int onlar= (num1/10)%10;
                int yuzler= num1/100;

                switch (yuzler){
                    case 1:
                        System.out.print("eksi yuz ");break;
                    case 2:
                        System.out.print("eksi iki yuz ");break;
                    case 3:
                        System.out.print("eksi uc yuz ");break;
                    case 4:
                        System.out.print("eksi dort yuz ");break;
                    case 5:
                        System.out.print("eksi bes yuz ");break;
                    case 6:
                        System.out.print("eksi alti yuz ");break;
                    case 7:
                        System.out.print("eksi yedi yuz ");break;
                    case 8:
                        System.out.print("eksi sekiz yuz ");break;
                    case 9:
                        System.out.print("eksi dokuz yuz ");break;
                }
                switch (onlar){
                    case 1:
                        System.out.print("on ");break;
                    case 2:
                        System.out.print("yirmi ");break;
                    case 3:
                        System.out.print("otuz ");break;
                    case 4:
                        System.out.print("kirk ");break;
                    case 5:
                        System.out.print("elli ");break;
                    case 6:
                        System.out.print("altmis ");break;
                    case 7:
                        System.out.print("yetmis ");break;
                    case 8:
                        System.out.print("seksen ");break;
                    case 9:
                        System.out.print("doksan ");break;
                }
                switch (birler){
                    case 1:
                        System.out.print("bir");break;
                    case 2:
                        System.out.print("iki ");break;
                    case 3:
                        System.out.print("uc ");break;
                    case 4:
                        System.out.print("dort ");break;
                    case 5:
                        System.out.print("bes ");break;
                    case 6:
                        System.out.print("alti ");break;
                    case 7:
                        System.out.print("yedi ");break;
                    case 8:
                        System.out.print("sekiz ");break;
                    case 9:
                        System.out.print("dokuz ");break;
                }
            }
            else {int birler= num1%10;
                int onlar= (num1/10)%10;
                int yuzler= num1/100;

                switch (yuzler){
                    case 1:
                        System.out.print("yuz ");break;
                    case 2:
                        System.out.print("iki yuz ");break;
                    case 3:
                        System.out.print("uc yuz ");break;
                    case 4:
                        System.out.print("dort yuz ");break;
                    case 5:
                        System.out.print("bes yuz ");break;
                    case 6:
                        System.out.print("alti yuz ");break;
                    case 7:
                        System.out.print("yedi yuz ");break;
                    case 8:
                        System.out.print("sekiz yuz ");break;
                    case 9:
                        System.out.print("dokuz yuz ");break;
                }
                switch (onlar){
                    case 1:
                        System.out.print("on ");break;
                    case 2:
                        System.out.print("yirmi ");break;
                    case 3:
                        System.out.print("otuz ");break;
                    case 4:
                        System.out.print("kirk ");break;
                    case 5:
                        System.out.print("elli ");break;
                    case 6:
                        System.out.print("altmis ");break;
                    case 7:
                        System.out.print("yetmis ");break;
                    case 8:
                        System.out.print("seksen ");break;
                    case 9:
                        System.out.print("doksan ");break;
                }
                switch (birler){
                    case 1:
                        System.out.print("bir");break;
                    case 2:
                        System.out.print("iki ");break;
                    case 3:
                        System.out.print("uc ");break;
                    case 4:
                        System.out.print("dort ");break;
                    case 5:
                        System.out.print("bes ");break;
                    case 6:
                        System.out.print("alti ");break;
                    case 7:
                        System.out.print("yedi ");break;
                    case 8:
                        System.out.print("sekiz ");break;
                    case 9:
                        System.out.print("dokuz ");break;
                }}














        }


































    }
}
