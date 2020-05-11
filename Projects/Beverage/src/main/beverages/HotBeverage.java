package main.beverages;

import main.temperatures.Heatable;

public class HotBeverage extends Beverage implements Heatable {
   private int temperature;
   
   @Override
   public int currentTemperature() { return temperature; }
   
   @Override
   public int heatUpTo(int number) {
      return number;
   }
   
   public void setLowTemperature(Heatable heatableObj) {
      temperature = heatableObj.heatUpTo(30);
   }

   public void setMediumTemperature(Heatable heatableObj) {
      temperature = heatableObj.heatUpTo(60);
   }

   public void setHighTemperature(Heatable heatableObj) {
      temperature = heatableObj.heatUpTo(90);
   }

   @Override
   public String drink() {
      return "Drink a hot beverage";
   }

   public String drinkSlowly() {
      return "Drink slowly this is hot";
   }
}
