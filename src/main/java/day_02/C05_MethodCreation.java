package day_02;

public class C05_MethodCreation {
    public static void main(String[] args) {
          /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP)
        bir program yaziniz
         Orn    : sayi1=10 ve sayi2=20;
          kod calistiktan sonra
         sayi1=20 ve sayi2=10
         */

        int num1= 10;
        int num2= 20;
        System.out.println( "before swap num1: "+ num1);
        System.out.println( "before swap num2: "+ num2);
        System.out.println("");

        swapAndPrint(num1,num2);


    }

    private static void swapAndPrint(int num1, int num2) {
        int num3;
        num3=num1;
        num1=num2;
        num2=num3;
        System.out.println(
                "after swap num1: "+ num1+"\n"+
                "after swap num2: "+ num2) ;
        System.out.println("");

        System.out.println("after swap num1: "+ num1);
        System.out.println("after swap num2: "+ num2);
    }
}
