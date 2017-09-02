package org.project;

public class CarsType {


    private String carBrand;
    private Double weightCar;
    private Integer carMileage;
    private Boolean carAvailability;
    private Double carGPS;

    public CarsType(String carBrand, Double weightCar, Integer carMileage, Boolean carAvailability, Double carGPS) {
        this.carBrand = carBrand;
        this.weightCar = weightCar;
        this.carMileage = carMileage;
        this.carAvailability = carAvailability;
        this.carGPS = carGPS;
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

    public Boolean getCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(Boolean carAvailability) {
        this.carAvailability = carAvailability;
    }

    public Double getCarGPS() {
        return carGPS;
    }

    public void setCarGPS(Double carGPS) {
        this.carGPS = carGPS;
    }
}
