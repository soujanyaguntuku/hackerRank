package com.code.staticblock;

import java.util.Date;

public class StaticExample {

  public static void main(String args[]){
    Bicycle myCycle1 = new Bicycle(2,"ladybird");
    System.out.println(String.format("static from object1 %s",Bicycle.numberofBicycles));

    Bicycle myCycle2 = new Bicycle(3, "cello");
    System.out.println(String.format("static from object2 %s",Bicycle.numberofBicycles));

    Bicycle myCycle3 = new Bicycle(2,"Janbhumi");
    System.out.println(String.format("static from object3 %s",Bicycle.numberofBicycles));

    Bicycle myCycle4 = new Bicycle(4, "BB");
    System.out.println(String.format("static from object4 %s",Bicycle.numberofBicycles));

    System.out.println(String.format("static from object1 %s",myCycle1.numberofBicycles));
    System.out.println(String.format("static from object2 %s",myCycle2.numberofBicycles));
    System.out.println(String.format("static from object3 %s",myCycle3.numberofBicycles));
    System.out.println(String.format("static from object4 %s",myCycle4.numberofBicycles));
  }
}
class Bicycle{
  public static int numberofBicycles = 0;
  public int gares;
  public String model;
  public Bicycle(int gares, String model){
    this.gares = gares;
    this.model = model;
    numberofBicycles ++;
  }

}
