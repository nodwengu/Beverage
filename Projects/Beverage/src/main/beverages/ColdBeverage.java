package main.beverages;

import main.temperatures.Coolable;

public class ColdBeverage extends Beverage implements Coolable {
   private int temperature;
   
   @Override
   public int currentTemperature() {
      return temperature;
   }
   
   @Override
   public void coolDownWith(int number) {
      temperature -= number;
   }
   
   public void setForMinutes(Coolable coolableObj) {
      coolableObj.coolDownWith(3);
      temperature = coolableObj.currentTemperature();
   }
   
   public void setForHours(Coolable coolableObj) {
      coolableObj.coolDownWith(10);
      temperature = coolableObj.currentTemperature();
   }
   
   public void setForDays(Coolable coolableObj) {
      coolableObj.coolDownWith(20);
      temperature = coolableObj.currentTemperature();
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
