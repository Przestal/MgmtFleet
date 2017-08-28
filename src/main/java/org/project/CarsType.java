package org.project;

public class CarsType {


    private String carBrand;
    private Double weightCar;
    private Integer carMileage;

    public CarsType(String carBrand, Double weightCar, Integer carMileage) {
        this.carBrand = carBrand;
        this.weightCar = weightCar;
        this.carMileage = carMileage;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Double getWeightCar() {
        return weightCar;
    }

    public void setWeightCar(Double weightCar) {
        this.weightCar = weightCar;
    }

    public Integer getCarMileage() {
        return carMileage;
    }

    public void setCarMileage(Integer carMileage) {
        this.carMileage = carMileage;
    }


}
