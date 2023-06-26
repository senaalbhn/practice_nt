package day_09.arabalar;

public class Corsa extends Opel{

    String hiz= "Corsa max 200 km hiz yapar";
    String yakit="Corsa arabalar benzinli veya elektriklidir";
    String model= "Corsa";

    @Override
    protected void motor() {
        System.out.println("Corsa arabalar  cevreci motor kullanirlar");
    }

    @Override
    protected void yatikTuketimi() {
        System.out.println("Corsa arabalar 5.6 lt yakit tuketirler");
    }

    protected void vitesSayisi(){
        System.out.println("Corsa 5 viteslidir");
    }

    public static void main(String[] args) {
        //bir tane corsa opjesi olusturalim
        //static methoddan instance datalara ulasmak icin obje olustururuz

        Corsa arb1= new Corsa();
        System.out.println(arb1.haraket);
        System.out.println(arb1.hiz);
        System.out.println(arb1.yakit);
        System.out.println(arb1.marka);
        System.out.println(arb1.sirketMerkezi);
        System.out.println(arb1.model);

        arb1.motor();

        //bir tanede opel objesi olusturalim
        Opel arb2=new Corsa();

        //data turu parent, constructor childdan gelecek sekilde obje olustirabiliriz
        System.out.println("arb2.haraket = " + arb2.haraket);
        System.out.println("arb2.hiz = " + arb2.hiz);
        System.out.println("arb2.yakit = " + arb2.yakit);
        System.out.println("arb2.marka = " + arb2.marka);
        System.out.println("arb2.sirketMerkezi = " + arb2.sirketMerkezi);
        //arb2.model --> opel veya opelin parentinda moldel variable si olmadigi icin
        //cte verir
        arb2.motor();
        /*
        inhetitance da variable lar;
        aramaya data turu neyse oradan baslar
        bulamazsa parente bakar ve ilk buldugu yerden alir
         */

        /*
        inheritance de methodlar;
        aramaya data turu neyse oradan baslar
        bulamazsa parent a bakar,
        ilk buldugunu almaz!
        constructor'in oldugu classa kadar override edilmis mi diye bakar
        son buldugu yerden alir
            */
        //arama islemi variable ve methodlar icin asagidan yukari dogrudur
        //override kontrol islemi ise yukaridan asagi dogrudur

        arb2.garanti();
        arb2.yatikTuketimi();
        /*
        methodlar icin iki asama var
        1.Methodu arama ve bulma islemi: asagidan yukari dogru
        2. bulduktan sonra asagi dogru averride kontrol islemi
         */
        //arb2.vitesSayisi---> CTE

        Araba arb3= new Corsa();
        System.out.println("arb3.haraket = " + arb3.haraket);
        System.out.println("arb3.hiz = " + arb3.hiz);
        System.out.println("arb3.yakit = " + arb3.yakit);
        //arb3.sirketMerkezi---> CTE
        arb3.yatikTuketimi();
        arb3.motor();
        //arb3.garanti--->CTE
        //arb3.vitesSayisi--->CTE

        Araba arb4= new Opel();
        arb4.motor();



    }
}
