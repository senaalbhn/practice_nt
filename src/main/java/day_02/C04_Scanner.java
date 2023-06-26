package day_02;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        //Kullanicidan aldiginiz character ile asagidaki gibi bir gorunum olusturunuz

        /*
                  A
                 A A
                A A A
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz!");

        char ch= scan.next().charAt(0);

        System.out.println("Lutfen bir karakter daha giriniz!");

        char ch2= scan.next().charAt(0);

        System.out.println("Lutfen bir karakter daha giriniz!");

        char ch3= scan.next().charAt(0);

        //scanner objesinin nextChar diye bir methodu yok bu yuzden kullanicinin girdigi datayi once string olarak aliyorum
        //daha sonra bu stringin 0. indexindeki karakteri charAt(0) methodu ile aliyorum

        //Strin variablelarda index yapisi vardir ve index 0'dan baslar
        // charAt(0) =>sifirinci index yani ilk karakter demektir

        System.out.println("Karakterterleriniz = " + ch +ch2+ch3);

        //Konsolda space yapmak icin sout'un icinde space'i mutlaka "" icinde yazmaliyiz

        System.out.println(
                "  "+ch+"  "+"\n"+
                " "+ch2+" "+ch2+"\n"+
                ch3+" "+ch3+" "+ch3
        );
    }
}
