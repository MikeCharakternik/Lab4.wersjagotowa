package Part_1;

public class Main {
    public static void main(String[] args) {

        //Zad. 1:
        //Utworzenie obiektu za pomocą konstruktora bez parametrów
        Postac bohater1 = new Postac();
        bohater1.testKonstruktorow();

        //Utworzenie obiektu z wykorzystaniem konstruktora z parametrami
        Postac bohater2 = new Postac("Geralt", 999);
        bohater2.testKonstruktorow();

        /*Zad. 2:
        To maszyna wirtualna JVM określa, kiedy uruchomić Garbage Collector,
        na podstawie wbudowanych algorytmów. GC uruchamia się gdy obiekty zajmują zbyt dużo miejsca w pamięci
         */

        //Zad. 3:
        test_GC.przetestowanieGC();

        //Zad. 4:
        //W zadaniu 3 przetestowano dostępność klas i metod

        //Zad. 5:
        zadanie_5.zadanie5();
        System.out.println();

        //Zad. 6:
        //Zapoznałem się.

        //Zad. 7:
        zadanie_7.testMetod();
        System.out.println();

        //Zad. 8:
        zadanie_8.zadanie8();
        System.out.println();

        //Zad. 9:

        // Tworzenie tablicy obiektów klasy Postac
        Postac[] herosi = new Postac[3];
        // Inicjalizacja elementów tablicy "herosi" - korzystam z wcześniej utworzonych obiektów
        // dodatkowo tworzę 1 nowy obiekt dla tablicy "Dziadek"
        herosi[0] = bohater1;
        herosi[1] = bohater2;
        herosi[2] = new Postac("Dziadek", 1);

        // Wyświetlanie danych o obiektach (herosi) klasy Postac
        for (Postac Postac : herosi) {
            System.out.println("Nazwa herosa: " + Postac.nazwa + ", Zdrowie herosa: " + Postac.zdrowie);
        }
        System.out.println();

        //Zad. 10-11:
        zadanie_10.zadanie_10();
        System.out.println();

        //Zad. 12: wykonane (pakiety myapp i testowanie)
        //Zad. 13: wykonane (pakiet Program_auta)
    }
}