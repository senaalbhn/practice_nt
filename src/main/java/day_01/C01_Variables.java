package day_01;

public class C01_Variables {

    public static void main(String[] args) {

        //bir variable olustur ve yazdir
        int yas = 35;
        // syntax:  variable data type+ variable name+ assigment operator+ variable deger
        // ctrl+d bulundugu satiri cagaltir
        //ctrl alt+l kodlarimizi duzenlemeye yarar

        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        System.out.println(yas);
        //sayi = 50 seklinde yazdir
        int sayi = 40;
        System.out.println(" sayi = " + sayi);
        //sayi variable ini etiketi ile birlikte yazdirmak
        //bir variable yi etiketi ile birlikte yazdirmanin kisa yolu = soutv
        System.out.println("sayi = " + sayi);
        System.out.println("yas = " + yas);
        System.out.println("sayi = 50");

        // string bir variable olusturma=>  non primitive data turu "" icinde yazilir, buyuk harfle baslar
        String isim= "Ali";
        // isim variablesini etiketi ile birlikte yazdir
        System.out.println("isim = " + isim);

        //olusturdugun bir variableyi baska bir variableye kopyala
        //yeni bir variable olusturuyorum. bu variable nin adi benimYasim ve bu variable nin degeri yas variablenin degerine esit olsun

        int benimYasim = yas;
        System.out.println(benimYasim);

        //onunIsmi variablesinin ismi "Ali" olsun ve bunu kopyalama islemi ile yapalim
        String onunIsmi= isim;
        System.out.println("onunIsmi = " + onunIsmi);

        String tatliBebek= "Uras";
        String tombulKus= tatliBebek;

        System.out.println("tombulKus = " + tombulKus);

        //ayni satirda coklu variable deklare et
        int yil = 2023, ay=5,gun= 15;
        System.out.println("yil = " + yil);
        System.out.println("ay = " + ay);
        System.out.println("gun = " + gun);
        System.out.println("yil + ay + gun = " + yil + ay + gun);
        System.out.println(yil+" "+ ay+" " + gun+" ");


        //bir variable degerini guncelle
        //az once olusturdugun isim variable degerini Veli olarak guncelle
         isim= "Veli";
        System.out.println("isim = " + isim);
        System.out.println("onunIsmi = " + onunIsmi);

        //camelCase
        //PaskalCase
        //snake_case
        //kebab-case


        //Bir variable deklere et : x -->deklare etmek= tanimlamak= data type+ data name
        double x;
        //Bir variable baslat : y
        double y= 12.5;
        //Başka bir variable başlat : z
        double z= 33;  //java buraya yazdigimiz 33 degerini 33.0 olarak algiladigi icin hata vermedi
        //x degişkenini y degişkeni ile başlat
         x= y; // bir variavle bir scope (main method) da sadece bor kez deklare edebiliriz.
        //Variable y'i guncelle
        y=13.9;
        //Degişkenleri yazdır
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);





    }

}
