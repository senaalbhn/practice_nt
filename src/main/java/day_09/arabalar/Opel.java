package day_09.arabalar;

public class Opel extends Araba{

    String hiz="Opel arabalar max 220km hiz yaparlar";
    String marka="Opel";
    String sirketMerkezi= "Almanya";

    @Override
    protected void motor() {
        System.out.println("Opel arabalar Opel marka motor kullanirlar");
    }

    protected void garanti(){
        System.out.println("Ople arabalar 2 yil garantilidir");
    }


}
