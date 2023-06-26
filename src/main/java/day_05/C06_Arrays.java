package day_05;

import java.util.Arrays;
import java.util.Scanner;

public class C06_Arrays {
    public static void main(String[] args) {
        // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
        // ve bu rakamları bir array'e assiyn ediniz. Olusturdugunuz array'i yazdırınız
        // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
        // Ortalamadan daha buyuk olan array elemanlarını yazdırınız

        Scanner scan= new Scanner(System.in);

        int arr[]= new  int[4];

        for (int i=0; i<arr.length; i++){
            System.out.println("Lutfen dort adet sayi giriniz");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        double toplam=0;
        for (int w: arr) {
            toplam=+w;
        }
        double ort= toplam/arr.length;
        System.out.println(ort);

        for (int w: arr) {
            if (w>ort){
                System.out.print(w+" ");
            }
        }







    }
}
