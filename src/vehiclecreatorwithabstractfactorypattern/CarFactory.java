/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehiclecreatorwithabstractfactorypattern;

/**
 *
 * @author Lenovo
 */
public class CarFactory implements VehicleAbstractFactory{

    @Override
    public Vehicle createVehicle() {
        return new Car(this.numOfWheels, this.numOfPassengers, this.hasGas);
    }
     int numOfWheels; 
    int numOfPassengers;
    boolean hasGas;

    public CarFactory(int numOfWheels, int numOfPassengers, boolean hasGas) {
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
        this.hasGas = hasGas;
    }
}
