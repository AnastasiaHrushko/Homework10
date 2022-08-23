package Homework8;

import java.util.Objects;

public class Car4 extends Car {

    int maxSpeed;

    Car4(String carBrand, String carModel, int yearRelease, String color, int maxSpeed) {
        super(carBrand, carModel, yearRelease, color);
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", yearRelease=" + yearRelease +
                ", color='" + color + '\'' +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car4 car4 = (Car4) o;
        return maxSpeed == car4.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }
}
