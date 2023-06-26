package day_08;

import java.util.Scanner;

public class C01_StringBuilder {//kullanıcıdan aldiginiz veriyi stringbuilder objesine atayın
    //capasity lenght yazdırın
    //capasity i lenghte esıtleyın tekrar yazdırın
    //ikinci bir stringbuilder objesi olusturun, kullanıcıdaan aldıgınız veriyi atayın
    //iki objeyi karsılastırın(== , equals , compareTo ile)
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        //neden obje olustururuz==> instance method/variable ulasmak icin h
        System.out.println("Lutfen bir kelime giriniz:");
        String kelime = scan.next();
        //kullanicinin girdigi veriyi
        StringBuilder sb =new StringBuilder(kelime);
        System.out.println(sb);
        System.out.println("sb.capacity() = " + sb.capacity());
        System.out.println("sb.length() = " + sb.length());
        //parametreli cons kullanarak olusturdugumuz sb objesinin kapasitesi -> 16 + parametre olarak verilen stringin uzunlugu
        //parametresiz cons kullanırsak kapasite default olarak 16 olur
        System.out.println("sb.length() = " + sb.length());

        sb.trimToSize();//bu method cpasity i lenght e esitler
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        //parametresiz cons kullanarak sb objesi olusturalim

        StringBuilder sb2= new StringBuilder();
        sb2.append(kelime);
        System.out.println("sb2.capacity() = " + sb2.capacity());
        System.out.println("sb2.length() = " + sb2.length());


        //iki objeyi karsılastırın(== , equals , compareTo ile)
        System.out.println(sb == sb2);//false
        System.out.println(sb.equals(sb2));// false=> StringBuilder daki equals methodu hem degere hem adrese bakar
        System.out.println(sb.compareTo(sb2));
        /*
        compareTo methodu 0 ve ya baska bir deger dondurur.
        bizim icin onemli olan donutun 0 olup olmamasidir.
        0 ise iki objenin degerleri esit demektir
         */
    }
}










