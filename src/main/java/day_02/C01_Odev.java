package day_02;

public class C01_Odev {

    //iki sayının kareleri toplamını bulan ve yazdıran bır method olusturunuz
    //main methodun içinde tanımladıgım iki sayının kareleri toplamını bulan ve yazdıran bır method olusturun

    public static void main(String[] args) {

        int a=2;
        int b=3;

        kareToplaYazdir(a,b); //buradaki parantez icindeki variablelere



    }

    public static void kareToplaYazdir( int a, int b){ // method parantezinin icine method body de kullanacagimiz variabllelari
                                                                // tanimliyoruz. bunlara parametre denir
        int toplam = (a*a)+(b*b);
        System.out.println("toplam = " + toplam);

    }


}
