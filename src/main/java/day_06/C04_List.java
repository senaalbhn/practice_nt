package day_06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04_List {
    public static void main(String[] args) {
          /*
    Bir list olusturunuz. 1'den 15'e kadar sayıları bu liste ekleyiniz.
    Daha sonra 10'dan buyuk olan tum elemanları 2 katına cıkarınız
    */

        List<Integer> nums= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
        System.out.println(nums);

        for (int i=0; i<nums.size(); i++) {
            if (nums.get(i)>10){
               nums.set(i,nums.get(i)*2);
            }
        }
        System.out.println(nums);












    }











}

