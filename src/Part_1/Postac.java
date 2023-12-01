package Part_1;

public class Postac{
    String nazwa;
    int zdrowie;

    // Konstruktor bez parametrów
    Postac() {
        this.nazwa = "Jason";
        this.zdrowie = 100;
    }
    // Konstruktor z parametrami
    Postac(String nazwa1, int zdrowie1) {
         this.nazwa = nazwa1;
         this.zdrowie = zdrowie1;
    }
    //metoda służąca do wyświetlenia tworzonych obiektów
    void testKonstruktorow() {
         System.out.println("Nazwa: " + nazwa);
         System.out.println("Zdrowie: " + zdrowie);
    }
}