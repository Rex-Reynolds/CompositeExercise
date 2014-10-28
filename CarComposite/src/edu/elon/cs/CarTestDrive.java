/**
 * CarTestDrive.java 1.0 Oct 28, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds. All Rights Reserved
 */
package edu.elon.cs;

/**
 * Start each Class or interface with a summary description line
 * 
 * @author RexIII
 * @version 1.0
 * 
 */
public class CarTestDrive {
  public static void main(String args[]) {
    CarComponent hondaCar = new Component("Model", "Drivetrain");
    CarComponent carColor = new Component("InteriorColor", "ExteriorColor");
    CarComponent exteriorAccessories = new Component("Accessories", "Exterior");
    CarComponent interiorAccessories = new Component("Accessories", "Interior");
    CarComponent electronicAccessories = new Component("Accessories", "Electronic");
    CarComponent DestinationHandling = new Component("$790.00", "huehue");

    CarComponent allComponents = new Component("ALL COMPONENTS", "All components combines");

    hondaCar.add(new ModelComponent("2014 CRZ EX", "Manual"));
    carColor.add(new ColorComponent("Milano Red", "Black/Red"));
    exteriorAccessories.add(new ExteriorComponent("Side Spoilers"));
    interiorAccessories.add(new InteriorComponent("Armrest"));
    electronicAccessories.add(new ElectronicComponent("XM Radio"));
    DestinationHandling.add(new DestinationHandlingComponent("$790.00"));

    allComponents.add(hondaCar);
    System.out.println();
    allComponents.add(carColor);
    allComponents.add(exteriorAccessories);
    allComponents.add(interiorAccessories);
    allComponents.add(electronicAccessories);
    allComponents.add(DestinationHandling);

    Car car = new Car(allComponents);
    car.print();
  }

}
