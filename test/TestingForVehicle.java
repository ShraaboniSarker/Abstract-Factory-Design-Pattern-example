/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import vehiclecreatorwithabstractfactorypattern.Car;
import vehiclecreatorwithabstractfactorypattern.CarFactory;
import vehiclecreatorwithabstractfactorypattern.PlaneFactory;
import vehiclecreatorwithabstractfactorypattern.Vehicle;
import vehiclecreatorwithabstractfactorypattern.VehicleFactory;

/**
 *
 * @author Lenovo
 */
public class TestingForVehicle {
    
  
    
    @Before
    public void setUp() {
    }
    
  
     @Test
     public void doTest() {
     Vehicle car = VehicleFactory.createVehicle(new CarFactory(4,4,true));
     Vehicle plane = VehicleFactory.createVehicle(new PlaneFactory(4,4,true));
     Assert.assertTrue(car instanceof Vehicle);
     Assert.assertTrue(plane instanceof Vehicle);
      }
}
