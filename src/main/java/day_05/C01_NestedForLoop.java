package day_05;

import java.util.Scanner;

public class C01_NestedForLoop {
    public static void main(String[] args) {
        /*
            Kullanıcıdan sisteme satır sayısını ve karakter girmesini isteyiniz.
            ve ardından kullanıcının girdiği karakteri kullanarak ikizkenar dik üçgen çizen
            bir method olusturun

            Satır sayısı = 4
            girilen karakter * ==>      *
                                        * *
                                        * * *
                                        * * * *
            */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir= scan.nextInt();

        System.out.println("Lutfen girmek istediginiz karakteri yaziniz");
        char ch= scan.next().charAt(0);

        ucgenciz(satir,ch);


    }

    private static void ucgenciz(int satir, char ch) {

        for (int i=0; i<satir; i++){
          for (int k=0; k<=i; k++){
              System.out.print(ch+" ");
          }
            System.out.println();
        }


    }
}
