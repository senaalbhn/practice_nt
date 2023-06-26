package day_05;

import java.util.Arrays;
import java.util.Scanner;

public class C06Tekrar {

    // Kullanıcıdan 4 tane rakam sisteme girmesini isteyiniz
    // ve bu rakamları bir array'e assiyn ediniz. Olusturdugunuz array'i yazdırınız
    // Array'in icindeki elemanların ortalamasını bulunuz. Ortalamayı yazdırınız
    // Ortalamadan daha buyuk olan array elemanlarını yazdırınız }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 4 adet sayi giriniz");
        int arr[] = new int[4];

        for (int i = 0; i < 4; i++) {

            arr[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        int toplam=0;

        for (int w:arr){
            toplam=toplam+w;
        }
        double ort= toplam/4;
        System.out.println(ort);

        for (int w: arr){
            if (w>ort){
                System.out.print(w+" ");
            }
        }

    }
}
