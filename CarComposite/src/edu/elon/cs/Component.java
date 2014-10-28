/**
 * Component.java 1.0 Oct 28, 2014
 *
 * Copyright (c) 2014 Rex A. Reynolds. All Rights Reserved
 */
package edu.elon.cs;

import java.util.ArrayList;

/**
 * Start each Class or interface with a summary description line
 *
 * @author RexIII
 * @version 1.0
 *
 */
public class Component extends CarComponent {
  ArrayList<CarComponent> carComponents = new ArrayList<CarComponent>(); 
  String exteriorColor;
  String interiorColor;
  
  public Component(String exteriorColor, String interiorColor){
    this.exteriorColor = exteriorColor;
    this.interiorColor = interiorColor;
  }
  
  public void add(CarComponent carComponent){
    carComponents.add(carComponent);
  }

  
  public void remove(CarComponent carComponent){
    carComponents.remove(carComponent);
  }
  
  public CarComponent getChild(int i){
    return (CarComponent) carComponents.get(i);
  }
  
  public String getName(){
    return exteriorColor;
  }
  
  public String getDescription(){
    return interiorColor;
  }
  
  public void print(){
    System.out.println("\n"+ getName());
    System.out.println(", "+ getDescription());
    System.out.println("-----------------------");
  }

}
