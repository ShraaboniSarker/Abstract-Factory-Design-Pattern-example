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
public class VehicleCreatorWithAbstractFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle car = VehicleFactory.createVehicle(new CarFactory(4,4,true));
        Vehicle p1ane = VehicleFactory.createVehicle(new PlaneFactory(3,15,false));
    }
    
}
