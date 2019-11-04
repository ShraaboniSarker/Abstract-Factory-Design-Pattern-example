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
public class Plane implements Vehicle{

    int numOfWheels; 
    int numOfPassengers;
    boolean hasGas;

    public Plane(int numOfWheels, int numOfPassengers, boolean hasGas) {
        this.numOfWheels = numOfWheels;
        this.numOfPassengers = numOfPassengers;
        this.hasGas = hasGas;
    }
    
     
    @Override
    public int set_num_of_wheels() {
        return this.numOfWheels;
    }

    @Override
    public int set_num_of_passengers() {
       return this.numOfPassengers;
    }

    @Override
    public boolean has_gas() {
        return this.hasGas ;
    }
    
}
