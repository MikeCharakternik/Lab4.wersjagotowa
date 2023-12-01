package Part_1;

import java.util.Arrays;

public class zadanie_7 implements Cloneable{
    private String nazwisko;
    private int wiek;

    zadanie_7(String nazwisko, int wiek){
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    public static void testMetod (){
        int[] tablica = {1,2,3,4,5};
        String a = "ABC";
        String b = "ABC";

        System.out.println(a.equals(b)); //test metody equals
        System.out.println(Arrays.toString(tablica)); //test metody toString
    }
    /*metoda poprzedza usunięcie obiektu przez Gaerbage Collector, dlatego jeżeli on się nie uruchomi
    metoda finalize nie zostanie użyta */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Test metody finalize");
    }
    //tworzenie kopii referencji
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
