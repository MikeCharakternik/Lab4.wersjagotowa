package Part_1;
import  java.util.*;
public class zadanie_10 {
    public static void zadanie_10(){

        //tworzenie 3 nowych obiektów klasy String
        String[] tablicaObiektow = {"String2", "String3", "String1"};
        //poniżej określam który element chcę wyszukać
        String wyszukiwarkaElementow = "String3";
        for (int i = 0; i < tablicaObiektow.length; i++){

            //warunek wystąpienia szukanego elementu w tabeli obiektów
            if (tablicaObiektow[i].equals(wyszukiwarkaElementow)){
                System.out.print("Element " + wyszukiwarkaElementow + " którego szukaliśmy");
                System.out.println(" znajduje się na pozycji: " + i);
            }
        }
        //Tu zaczyna się zad 11: używana są metody klasy Arrays: toString i sort
        System.out.println("\n");
        System.out.println("Tablica przed sortowaniem: " + Arrays.toString(tablicaObiektow));
        Arrays.sort(tablicaObiektow);
        System.out.println("Tablica po sortowaniu: " + Arrays.toString(tablicaObiektow));
    }
}
