package main.beverages;

import main.temperatures.Heatable;

public class HotBeverage extends Beverage implements Heatable {
   private int temperature;
   
   @Override
   public int currentTemperature() { return temperature; }
   
   @Override
   public void heatUpTo(int number) {
      temperature += number;
   }
   
   public void setLowTemperature(Heatable heatableObj) {
      heatableObj.heatUpTo(30);
      temperature = heatableObj.currentTemperature();
   }

   public void setMediumTemperature(Heatable heatableObj) {
      heatableObj.heatUpTo(60);
      temperature = heatableObj.currentTemperature();
   }

   public void setHighTemperature(Heatable heatableObj) {
      heatableObj.heatUpTo(90);
      temperature = heatableObj.currentTemperature();
   }

   @Override
   public String drink() {
      return "Drink a hot beverage";
   }

   public String drinkSlowly() {
      return "Drink slowly this is hot";
   }
}
