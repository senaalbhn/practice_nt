package day_07;

import static day_07.C06_Varargs.*;

public class C07_Varargs {
    public static void main(String[] args) {
        // parametre olarak bir int
        // ve istediginiz kadar String alan bir method olusturun,
        // en uzun String'in harf sayisi ile int parametre degerini carpıp
        // sonucu yazdıranız.

        int sayi=5;
        String str1="Zulal";
        String str2="Zeynep";
        String str3="Can";

        carpim(sayi,str1,str2,str3);
        System.out.println();
        System.out.println("C06_Varargs.enUzunKelime(str1, str2,str3) = " + enUzunKelime(str1, str2, str3));

    }

    private static void carpim(int sayi, String... str) {
       int kelime=0;
        for (String w:str) {
            if (w.length()>kelime){
                kelime=w.length();
            }
        }
        int sonuc=kelime * sayi;
        System.out.println(sonuc);

    }
}
