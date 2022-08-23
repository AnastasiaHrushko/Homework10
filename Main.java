package Homework8;

public class Main {

    static Car bmw = new Car1("BMW", "x5", 2013, "black", 180);
    static Car audi = new Car2("audi", "q6", 2018, "white", 185);
    static Car nissan = new Car4("nissan", "qashqai", 2012, "red", 175);
    static Car mercedes = new Car3("mersedes", "sprinter", 2010, "grey", 179);
    static Car volkswagen = new Car2("volkswagen", "polo", 2019, "white", 186);

    public static void main(String[] args) {
        Garage garage = new Garage();
        garage.parking(bmw, 1);
        garage.parking(nissan, 2);
        garage.parking(audi, 3);
        garage.parking(mercedes, 4);
        garage.parking(volkswagen, 5);
        garage.departure(nissan, 2);
        garage.quantity(nissan);
    }
}
