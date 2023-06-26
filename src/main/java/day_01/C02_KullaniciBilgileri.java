package day_01;

public class C02_KullaniciBilgileri {
    public static void main(String[] args) {

        /*
         isim, soyisim, yas, boy ve kilo değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
            Isim: ...
            Soyisim: ...
            Yas: ...
            Boy: ...
            Kilo: ...
    Not: Sadece bir adet "System.out.println(); kullanınız.
    */

        String isim= "Sena";
        String soyisim= "Albahan";
        byte yas= 29;
        float boy= 1.64F;
        float kilo= 64.7F;

        System.out.println(isim + soyisim + yas + boy + kilo);
        System.out.println("Isim:" + isim + "\nSoyisim:" + soyisim + "\nYas:" + yas + "\nBoy:" + boy + "\nKilo:"+ kilo);
        // \n ifadesi yazdirmada alt satira tasir
    }
}
