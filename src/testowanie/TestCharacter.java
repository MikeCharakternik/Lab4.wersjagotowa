package testowanie;

import myapp.MyCharacter;

public class TestCharacter {
    public static void main(String[] args) {
        //inicjalizacja nowego obiktu o nazwie Osoba w klasie MyCharacter
        MyCharacter Osoba = new MyCharacter("Marqo", "Czarnoksiężnik", "Drow", 99);
        System.out.println("Dane postaci:");
        System.out.print("Nazwa postaci: " + Osoba.imie + " \nKlasa: " + Osoba.klasaPostaci );
        System.out.println("\nRasa " + Osoba.rasa + " \nSiła: " + Osoba.sila);
        }
}