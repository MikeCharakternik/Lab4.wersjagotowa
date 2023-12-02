package Program_auta;

public class Car {
    //public bo pola klasy muszą być dostępne w innej klasie
    public String marka;
    public String model;
    public String rokProdukcji;
    public String liczbaDrzwi;
    public String pojemnoscSilnika;
    public String cena;

    Car(String marka, String model, String rokProdukcji, String liczbaDrzwi, String pojemnoscSilnika, String cena) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.liczbaDrzwi = liczbaDrzwi;
        this.pojemnoscSilnika = pojemnoscSilnika;
        this.cena = cena;
    }
}