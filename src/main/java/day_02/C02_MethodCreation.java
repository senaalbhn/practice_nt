package day_02;

import java.util.Scanner;

public class C02_MethodCreation {

    public static void main(String[] args) {
        //kullanicidan fahrenheit cinsi bir deger girmesini isteyin
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        Scanner scan = new Scanner(System.in) ;

        String istek= "Lutfen hava sicakligini fahrenheit cinsinde yaziniz";

        System.out.println(istek);

        double fahrenheit = scan.nextDouble();

        System.out.println("fahrenheit = " + fahrenheit);

        //main method icinden method olustururken
        //methodumuza verecegimiz ismi yaziyoruz

        double celsius= fahrToCels( fahrenheit ); //method parantezinin icine neyi degistireceksek onu yazariz
        //method parantezinin icine argument yazilir
        System.out.println("celsius = " + celsius);
    }

    public static double fahrToCels(double fahrenheit) {
        double celcius= (fahrenheit-32)/1.8;
        return celcius;}


}



