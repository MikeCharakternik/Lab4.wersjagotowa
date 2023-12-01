package Part_1;

public class test_GC {
    public static void przetestowanieGC (){ //gdybym klasa była private wyskoczy brak dostępu do pola w main

        // Tworzenie i usuwanie obiektów, które nie są nigdzie przypisane, stają się nieosiągalne
        for (int i = 0; i < 10; i++) {
            new test_GC();
        }
        // Sugestia uruchomienia Garbage Collector'a - nie musi się uruchomić!
        System.gc();
    }

    /* Metoda finalize uruchamia się przed usunięciem nadmiarowego obiektu przez Garbage Collector
     metoda ta została nadpisana aby wyświetlić komunikat o usunięciu obiektu */
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obiekt został usunięty");
    }
}
