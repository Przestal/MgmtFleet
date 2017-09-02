package org.project.mgmtCars;

import org.project.CarsType;
import org.project.brandCars.Iveco;
import org.project.brandCars.Renault;
import org.project.brandCars.Solaris;
import org.project.typeCars.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsFactory {

public static List<CarsType> getCarsType(){
List<CarsType> carsTypes = new ArrayList<>();

carsTypes.add(new Iveco("STRALIS",9820.0, 326855, true, 52.326));
carsTypes.add(new Renault("SCENIC",1428.2,186000, true, 12.235));
carsTypes.add(new Solaris("URBINO 12",13200.0,500000, true, 325.9889));

return carsTypes;



}




}
