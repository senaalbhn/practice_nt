package day_06;

import java.util.Arrays;

public class C02_Arrays {
       /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */
       public static void main(String[] args) {
           int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
           Arrays.sort(arr);
           Arrays.toString(arr);


           int min= arr[0];
           int max=arr[arr.length-1];
           int ikinciMax=arr[arr.length-2];
           System.out.println(min);
           System.out.println(max);
           System.out.println(ikinciMax);


       }
}
