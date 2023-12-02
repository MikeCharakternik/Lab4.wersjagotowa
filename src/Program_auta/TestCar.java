package Program_auta;

public class TestCar {
    public static void main(String[] args) {

        //Tworzenie nowych obiektów klasy Car
        Car auto1 = new Car("Opel","Astra","2009","4","1.0","10000 zł");
        Car auto2 = new Car("Toyota","Yaris","2015","4","1.4","20000 zł");
        Car auto3 = new Car("Volkswagen","Passat","2015","4","2.0","12000 zł");

        //tworzenie nowej tablicy obiektów - 3 nowych aut
        Car[] tablicaAut = new Car[3];

        tablicaAut[0] = auto1;
        tablicaAut[1] = auto2;
        tablicaAut[2] = auto3;

        //wyswietlam informacje o każdym aucie
        for (Car car : tablicaAut){
            System.out.println("Marka: " + car.marka + "\nModel: " + car.model + "\nRok produkcji: " + car.rokProdukcji);
            System.out.println("Liczba drzwi: " + car.liczbaDrzwi + "\nPojemność silnika: " + car.pojemnoscSilnika);
            System.out.println("Cena: " + car.cena + "\n");
        }
    }
}
