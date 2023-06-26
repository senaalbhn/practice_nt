package day_06;

public class C06_Scope {
    /*
    scope kapsam demektir, java icin scope variablelarin gecerli oldugu yer anlamina gelir
    4.cesit scopevardir

    1.Static variable= class variable
    2.Instance variable= object variable
    --static ve instance variable class level de olusturulur
    3.local variable= method icinde olusturdugumuz variable
    4.loop variable=loopun icinde olusturdugumuz variable
     */

    static int staticSayi;
    int instanceSayi;


    public static void main(String[] args) {
        int localSayi=4;
        for (int i=0; i<2; i++){
            System.out.println(i);
        }
        System.out.println(localSayi);
        //System.out.println(i);
        System.out.println(staticSayi);
        //System.out.println(instaceSayi);

        C06_Scope obj=new C06_Scope();
        System.out.println(obj.instanceSayi);


    }
}
