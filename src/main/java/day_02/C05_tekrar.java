package day_02;

public class C05_tekrar {
    public static void main(String[] args) {

        // 1- Verilen sayi1 ve sayi2 variable'larinin degerlerini degistiren (SWAP) bir program yaziniz
        // Orn: sayi1=10 ve sayi2=20;
        // kod calistiktan sonra
        // sayi1 = 20 ve sayi2 = 10

        int num1= 10;
        int num2= 20;

        System.out.println("Before swap number:\n"+ num1+ "\n"+ num2);

        swapAndPrint( num1, num2 );

    }

    private static void swapAndPrint(int num1, int num2) {
        int tent = num1;
        num1=num2;
        num2=tent;

        System.out.println("After swap new number:\n"+num1 + "\n"+ num2);


    }
}
