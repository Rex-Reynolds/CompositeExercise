/**
 * Car.java 1.0 Oct 28, 2014
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
public class Car {
  CarComponent allComponents;
  
  public Car(CarComponent allComponents){
    this.allComponents = allComponents;
  }

  
  public void print(){
    allComponents.print();
  }
}
