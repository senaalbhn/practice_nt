package day_07;

public class C06_Varargs {

    // kac tane kelime verilirse verilsin
    // iclerinden en uzun olanı yazdıran bir method olusturun
    // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız
    public static void main(String[] args) {

        String str1 = "Ali";
        String str2 = "Veli";
        String str3 = "Ahmet";
        String str4 = "Abdullah";
        String str5 = "Abdulrahman";
        String str6 = "Uras";

        System.out.println(enUzunKelime(str1, str2, str4, str6));


    }

    public static String enUzunKelime(String... str) {//Parametre kismini ismi str olan bir Array olarak dusunebiliriz
        String enUzunKelime = "";

        for (String each : str) {
            if (each.length() > enUzunKelime.length()) {
                enUzunKelime = each;
            }
        }
        return enUzunKelime;
    }


}
