package main.beverages;

import main.temperatures.Heatable;

public class HotBeverage extends Beverage implements Heatable {
   private int temperature;
   
   @Override
   public int currentTemperature() { return temperature; }
   
   @Override
   public void heatUpTo(int number) {
      temperature = number;
   }
   
   @Override
   public String drink() {
      return "Drink a hot beverage";
   }

   public String drinkSlowly() {
      return "Drink slowly this is hot";
   }
}
