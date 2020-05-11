package main.beverages;

import main.temperatures.Fridge;

public class ColdBeverage extends Beverage {
   private int temperature;
   
   public int getTemperature() {
      return temperature;
   }
   
   public void setForMinutes(Fridge temperature) {
      temperature.coolForMinutes(temperature);
      this.temperature = temperature.currentTemperature();
   }
   
   public void setForHours(Fridge temperature) {
      temperature.coolForHours(temperature);
      this.temperature = temperature.currentTemperature();
   }
   
   public void setForDays(Fridge temperature) {
      temperature.coolForDays(temperature);
      this.temperature = temperature.currentTemperature();
   }
   
   @Override
   public String drink() {
      return "Drink a cold beverage";
   }
   
   public String dontSpill() {
      return "Don't spill your cold drink";
   }
   
   public String drinkWithIce() {
      return "Drink with ice";
   }
}
