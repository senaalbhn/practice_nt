package day_09.arabalar;

public class Araba {

    // Araba, Opel, Corsa adında farklı class'lar olusturunuz.
    // Opel class'ı Araba class'ına baglı olacak
    // Corsa class'ı Opel class'ına baglı olacak
    // Araba class'ına genel bilgileri, variable ve method olarak yazınız.
    // Opel class'ına gerekli bilgileri, variable ve method olarak yazınız.
    // Corsa class'ına en spesifik bilgileri, variable ve method olarak yazınız.

    // Corsa class'ından obje olusturarak variableları ve methodları yazdırınız.


    //tum arabalar icin ortak olan ozellikler variable olarak tanimlayalim
    protected String haraket="Arabalar teker ile haraket eder";
    protected String hiz= "Arabalar motor gucune gore haraket eder";
    protected String yakit="Arabalar farkli yakitlar kullanabilir";
    protected String marka="Arabalar uretildikleri markaya sahiptir";

    //tum arabalar icin ortak olan ozellikleri method olarak tanimlayalim

    protected  void motor(){
        System.out.println("Arabalar farkli markalarda motor kullanirlar");
    }

    protected void yatikTuketimi (){
        System.out.println("Arabalar mator gucune gore yakit tuketirler");
    }


}
