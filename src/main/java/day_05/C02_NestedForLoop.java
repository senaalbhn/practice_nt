package day_05;

import java.util.Scanner;

public class C02_NestedForLoop {
    public static void main(String[] args) {
          /*
    Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
    ve ardından aşağıdaki şekli bu sayıya göre yazdırın:

    örnegin: Satır Sayısı 5 icin;

     1
     2 3
     4 5 6
     7 8 9 10


     */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz");
        int satir= scan.nextInt();

        int a=1;

        for (int i=0; i<satir; i++){

            for (int k=0; k<=i; k++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }

























    }
}
