package day_09;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class C03_Set {
    public static void main(String[] args) {
        // Verilen bir array'den tekrar eden elemanları silip
        // unique elemanlardan olusan bir array haline donusturen method olusturun
        // int arr[]={1,2,2,3,4,4,5};

        int arr[] = {1, 2, 2, 3, 4, 4, 5, 0, 7, 5, 1, 3, 0};
        System.out.println("benzersizYap(arr) = " + Arrays.toString(benzersizYap(arr)));
    }

    private static int[] benzersizYap(int[] arr) {
        //Set yapisi tekrarli elemani kabul etmez
        //bu durumda verilen array i bir sete koymaya calisirsam bu array otomatik unique hale gelmis olur
        System.out.println("Arr nin ilk hali = " + Arrays.toString(arr));
        Set<Integer> tekrarsiz = new TreeSet<>();
        for (int each : arr) {
            tekrarsiz.add(each);
        }
        System.out.println(tekrarsiz);
        //TreeSet datalari natural ordera gore siralar

        int arr2[] = new int[tekrarsiz.size()];
        int idx = 0;
        for (int each : tekrarsiz) {
            arr2[idx] = each;
            idx++;
        }
        arr=arr2;
        System.out.println("Arrnin son hali"+Arrays.toString(arr2));

        return arr;
    }

}
