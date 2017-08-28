package org.project.brandCars;

import org.project.typeCars.Car;

public class Renault extends Car {

    public Renault(String carBrand, Double weightCar, Integer carMileage) {
        super(carBrand, weightCar, carMileage);
    }

    @Override
    public void setCarBrand(String carBrand) {
        super.setCarBrand(carBrand);
    }

    @Override
    public void setWeightCar(Double weightCar) {
        super.setWeightCar(weightCar);
    }

    @Override
    public void setCarMileage(Integer carMileage) {
        super.setCarMileage(carMileage);
    }
}
