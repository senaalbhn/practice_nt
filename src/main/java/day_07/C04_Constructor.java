package day_07;

public class C04_Constructor {

    public static void main(String[] args) {

        C02_Constructor car= new C02_Constructor();
        car.marka= "Renoult";
        car.model= "Megane3";
        car.yil= 2012;
        car.yakit= "Dizel";

        System.out.println(car.marka+" "+car.model+" "+ car.yil+" "+car.yakit);

        C02_Constructor obj2= new C02_Constructor();
        obj2.marka= "Mersedes";
        obj2.model="C180";
        obj2.yil=2023;
        obj2.yakit="Benzin";
        System.out.println(obj2.marka);
        System.out.println(obj2.model);
        System.out.println(obj2.yil);
        System.out.println(obj2.yakit);

        C03_Constructor obj3= new C03_Constructor("Uras","Tombul kus",2022,"Yogurt");
        System.out.println("marka = " + obj3.marka);
        System.out.println("model = " + obj3.model);
        System.out.println("yil = " + obj3.yil);
        System.out.println("yakit = " + obj3.yakit);

    }


}
