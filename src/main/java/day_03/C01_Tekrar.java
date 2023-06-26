package day_03;

import java.util.Scanner;

public class C01_Tekrar {
    public static void main(String[] args) {

       /*Kullanıcıdan ad ve soyadını aralarında bir bosluk olacak sekılde sisteme girmesini isteyiniz
        NOT: Yalnızca bir ad bir soyad girilmeli
        Ad ve Soyadı ilk harfleri buyuk olacak sekılde alt alta yazdırın
        Ad : Canan
        Soyad : Can */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ad ve soyadınızi aralarında bir bosluk olacak sekılde sisteme giriniz");
        String a= scan.nextLine();


        int indexSpace= a.trim().indexOf(" ");

        String isim= a.substring(0,indexSpace);
        String soyisim= a.substring(indexSpace+1);

        String isim2= isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        String soyisim2= soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
        System.out.println(isim2+"\n"+soyisim2);




    }
}
