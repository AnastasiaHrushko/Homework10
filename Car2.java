package Homework8;

import java.util.Objects;

public class Car2 extends Car{

    int maxSpeed;

    Car2(String carBrand, String carModel, int yearRelease, String color, int maxSpeed) {
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
        Car2 car2 = (Car2) o;
        return maxSpeed == car2.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }
}
