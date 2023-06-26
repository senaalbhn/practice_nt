package day_07;

public class C03_Constructor {

    //bu classta parametreli constructor olusturunuz
    //ve farklı bir classtan deger ataması yapınız
    String marka;
    String model;
    int yil;
    String yakit;

    public C03_Constructor(String marka, String model, int yil, String yakit) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.yakit = yakit;
    }

    public C03_Constructor() {
    }
    //parametreli veya parametresiz cons olusturdugumuzda default cons olur
    //bir classa parametreli cons eklendiyse mutlaka default cons benzer bir cons eklenmelidir




}
