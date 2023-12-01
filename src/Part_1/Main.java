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

        //Zad. 8:

    }
}