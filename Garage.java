package Homework8;

import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Car, Integer> garage = new HashMap<>();

    public void parking(Car car, int key){
        if (!garage.containsKey(car)) {
            garage.put(car, key);
        } else {
            garage.replace(car, garage.get(car) + key);
        }
        System.out.println(key + " " + car.getCarBrand() + " " + car.getCarModel());;
    }

    public void departure(Car car, int key){
        if(garage.containsKey(car)){
            garage.replace(car, garage.get(car) - key);
            System.out.println(key + " " + car.getCarBrand() + " " + car.getCarModel());
        }
        else {
            garage.replace(car, 0);
        }
    }

    public void quantity(Car car){
        int quantityCars = 0;
        for (Map.Entry<Car, Integer> quantity : garage.entrySet()) {
            if (quantity.getKey().getCarModel().equals(car)) {
                ++quantityCars;
            }
        }
        System.out.println("В гараже " + quantityCars + " " + car);
    }

}
