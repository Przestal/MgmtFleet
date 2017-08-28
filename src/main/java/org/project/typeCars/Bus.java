package org.project.typeCars;

import org.project.CarsType;

public class Bus extends CarsType {
    public Bus(String carBrand, Double weightCar, Integer carMileage) {
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
