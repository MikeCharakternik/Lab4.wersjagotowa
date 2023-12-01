package Part_1;
import java.util.*;

public class zadanie_5 {
    public static void zadanie5 (){

        int [][] tablica = new int[10][10];
        Random losowaLiczba = new Random();

        //zapełnianie tablei 2-wymiarowej losowymi liczbami

        for (int i = 0; i < tablica.length; i++){
            for (int j = 0; j < tablica.length; j++){
                //dodajemy 20 do dolnej granicy czyli 0, i górnej granicy czyli 25
                tablica[i][j] = losowaLiczba.nextInt(26) + 20;
            }
            Arrays.sort(tablica[i]); //sortowanie gotowych wierszy
        }
        //wyświela w pętli for each 100 elementów tablicy
        for (int[] wiersz : tablica) {
            System.out.println(Arrays.toString(wiersz));
        }
    }
}
