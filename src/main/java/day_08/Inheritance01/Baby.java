package day_08.Inheritance01;

public class Baby extends Child {

    int kilo=45;

    public static void main(String[] args) {

       method1();
       method2();
        System.out.println("isim = " + isim);
        System.out.println(soyisim);

        Baby obj1= new Baby();
        obj1.method3();
        System.out.println("obj1.yas = " + obj1.yas);
        System.out.println("obj1.kilo = " + obj1.kilo);

        Child obj2= new Child();
       // obj2.kilo
        /*child class da ilk olark child classa bakar. child class da kilo yok o zaman
        parent a bakar. parentta da kilo olmadigi icin jaca cte verir
        cocuklara bakmaz.
        her zaman aramaya yukari dogru gideer, asagiya bakmaz
         */


    }



}
