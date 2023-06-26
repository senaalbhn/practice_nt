package day_09.inheritance;

import day_09.arabalar.Araba;

public class Child extends Parent {
    protected Child(){
        //super(); child classta gorunmese bile bu ifade vardir
        //bu ifade parent class taki parametresiz cons isaret eder
        System.out.println("Child class tek parametresiz cons");
    }
    protected Child(int a){
        super(1);
        System.out.println("Child class tek parametreli cons");
    }
    protected Child(int a, int b){
        super(1,4);
        System.out.println("Child class iki parametreli cons");
    }
    public static void main(String[] args) {
       // Child obj2= new Child();
       // Child obj1= new Child(1);
        Child obj3= new Child(1,5);



    /*
        Ali b=new C();
        1.Ali classının olması gerek
        2.C classının Alinin child classı olması gerek
        3.C classında parametresiz cons olmalı
         */














    }






}
