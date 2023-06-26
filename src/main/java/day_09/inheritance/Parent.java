package day_09.inheritance;

public class Parent {
    // Parent isminde bir class olusturunuz
    // Child class'ı, Parent class'a extends ediniz
    // Child class'da parametresiz, tek parametreli ve iki parametreli obje olusturunuz.
    // super() constructor'u kullanarak Parent' den ekran cıktısı alınız


    protected Parent() {
        System.out.println("Paarent class parametresiz");
    }
    protected Parent(int a) {
        System.out.println("Paarent class tek parametreli");
    }
    protected Parent(int a, int b) {
        this();
        System.out.println("Paarent class iki parametreli");
    }



}
