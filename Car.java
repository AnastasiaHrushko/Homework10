package Homework8;

import java.util.Objects;

abstract class Car {
    String carBrand;
    String carModel;
    int yearRelease;
    String color;
    Car (String carBrand, String carModel, int yearRelease, String color){
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.yearRelease = yearRelease;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carBrand='" + carBrand + '\'' +
                ", carModel='" + carModel + '\'' +
                ", yearRelease=" + yearRelease +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearRelease == car.yearRelease && carBrand.equals(car.carBrand) && carModel.equals(car.carModel) && color.equals(car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carBrand, carModel, yearRelease, color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }
}
