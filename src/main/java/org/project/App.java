package org.project;


import org.project.mgmtCars.CarsFactory;

import java.util.List;

public class App
{


    public static void main(String[] args )

    {
        List<CarsType> carsTypeList = CarsFactory.getCarsType();



        for (CarsType carsType : carsTypeList) {



            System.out.println("Car brand: "+carsType.getCarBrand());
            System.out.println("Car mileage: "+carsType.getCarMileage().toString());
            System.out.println("Car weight: "+carsType.getWeightCar().toString());
            System.out.println("-------------------");

        }
    }

}
