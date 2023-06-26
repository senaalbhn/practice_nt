package day_01;

public class C03_Ortalama {

    public static void main(String[] args) {
         /*
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 100;

       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */

        double num1= 23.4;
        double num2= 24.0;
        double num3= 12;
        double num4 = 450.3;
        double num5 = 100;

        //double data typeda ismi toplam olan bir variable olusturalim ve bu variableye yazdigimiz bes sayinin toplamini assing edelim

        double toplam= (num1+num2+num3+num4+num5);
        System.out.println(toplam);

        //sayisal (numeric) datalarda + isareti matematiksel toplama islemi yapar

        double ortalama= toplam/ 5;
        System.out.println(ortalama);

    }
}
