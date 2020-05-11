package main.beverages;

import main.temperatures.Microwave;

public class HotBeverage extends Beverage {
   private int temperature;
   
   public int getTemperature() {
      return temperature;
   }
   
   public void setLowTemperature(Microwave temperature) {
      temperature.low(temperature);
      this.temperature = temperature.currentTemperature();
   }
   
   public void setMediumTemperature(Microwave temperature) {
      temperature.medium(temperature);
      this.temperature = temperature.currentTemperature();
   }
   
   public void setHighTemperature(Microwave temperature) {
      temperature.high(temperature);
      this.temperature = temperature.currentTemperature();
   }
   
   @Override
   public String drink() {
      return "Drink a hot beverage";
   }
   
   public String drinkSlowly() {
      return "Drink slowly this is hot";
   }
}
