package day_08;

public class C02S_tringBuilder {
     /*
        kapasitesi 7 olan bir stringbuilder objesi olusturun, capacity, lenght yazdırın
        "hava guzel" verisini ekleyin, yazdırın
        sbdeki boslugu silin
        sb'yi ters cevirin
        sbnin son 4 karakterini silin
        sbyi tekrar ters cevirin ve "Java guzel" yazısını elde edin
         */

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(7);
        System.out.println("sb.length() = " + sb.length());
        System.out.println("sb.capacity() = " + sb.capacity());
        sb.append("hava guzel");
        System.out.println("sb = " + sb);
        //once space karakterinin indexsini bulup sonra deletecharAt yapariz
        int idx=sb.indexOf(" ");
        sb.deleteCharAt(idx);
        System.out.println("sb = " + sb);
        sb.reverse();
        System.out.println("sb = " + sb);
        sb.delete(sb.length()-4,sb.length());
        System.out.println("sb = " + sb);
        sb.reverse();
        sb.insert(0,"Java ");
        System.out.println("sb son = " + sb);


    }
}
