package day_08;

public class C03_Encapsulation {
        /*
    bir class olusturun
    private access mod sahip variablelar olusturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor olusturun
    bu variablelara ait getter setter methodlarını olusturun
    toString methodunu olusturun
     */

    private String isim;//Instance
    private String soyIsim;//Instance
    private int yas;//Instance

    public C03_Encapsulation() {
    }

    public C03_Encapsulation(String isim, String soyIsim, int yas) {
        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
            this.isim=isim;
        }else {
            System.out.println("Isim buyuk harfle baslamalidir");
        }
        this.soyIsim = soyIsim;
        if (yas>=0){
            this.yas=yas;
        }else {
            System.out.println("Negatif yas olamaz");
        }    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
        if (isim.charAt(0)>='A' && isim.charAt(0)<='Z'){
            this.isim=isim;
        }else {
            System.out.println("Isim buyuk harfle baslamalidir");
        }
    }

    public String getSoyIsim() {
        return soyIsim;
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
        if (yas>=0){
            this.yas=yas;
        }else {
            System.out.println("Negatif yas olamaz");
        }
    }

    @Override
    public String toString() {
        return "C03_Encapsulation{" +
                "isim='" + isim + '\'' +
                ", soyIsim='" + soyIsim + '\'' +
                ", yas=" + yas +
                '}';
    }
}

